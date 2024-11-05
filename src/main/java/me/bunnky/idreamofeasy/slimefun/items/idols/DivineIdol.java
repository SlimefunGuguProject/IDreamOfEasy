package me.bunnky.idreamofeasy.slimefun.items.idols;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import net.guizhanss.guizhanlib.minecraft.utils.compatibility.EnchantmentX;
import org.bukkit.Material;
import org.bukkit.Tag;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.enchantment.EnchantItemEvent;
import org.bukkit.event.player.PlayerExpChangeEvent;
import org.bukkit.event.player.PlayerItemDamageEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Map;
import java.util.Random;
/*
Divine Idol: The Divine Idol is a powerful artifact that enhances enchanting, amplifies experience gain, and prolongs the durability of tools and armor. With an impressive 80% chance to modify enchantments during the enchanting process, it can increase the level of existing enchantments, ensuring your gear is always at its best. Additionally, there's a 20% chance that it can grant the coveted Fortune enchantment, significantly boosting resource drops from mining. When it comes to experience, the Divine Idol doubles the amount received from any source 20% of the time, accelerating your progress and leveling up. Lastly, this idol protects your tools and armor from breaking; with a 20% chance to restore their durability, your gear will remain in top condition longer than ever. Embrace the power of the Divine Idol to become a true master of enchantments and experience!
*/
public class DivineIdol extends Idol {

    private final Random random = new Random();

    public DivineIdol(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, item, recipeType, recipe);
    }

    @Override
    protected void handleEvent(Event e) {
        if (e instanceof EnchantItemEvent) {
            onEnchant((EnchantItemEvent) e);
        } else if (e instanceof PlayerExpChangeEvent) {
            onPlayerExperience((PlayerExpChangeEvent) e);
        } else if (e instanceof PlayerItemDamageEvent) {
            onItemDamage((PlayerItemDamageEvent) e);
        }
    }

    // Talisman of the Magician & Wizard: Modify or boost enchantments during enchanting
    @EventHandler(priority = EventPriority.HIGHEST, ignoreCancelled = true)
    public void onEnchant(EnchantItemEvent e) {
        Player p = e.getEnchanter();
        ItemStack item = e.getItem();
        Material type = item.getType();

        if (random.nextDouble() < 0.8) {
            Map<Enchantment, Integer> enchantments = e.getEnchantsToAdd();
            enchantments.replaceAll((enchantment, level) -> Math.min(level + 1, enchantment.getMaxLevel()));

            sendMessage(p, this.getItemName() + ": §r§a强化附魔!");
            if ((Tag.ITEMS_PICKAXES.isTagged(type) ||
                Tag.ITEMS_SHOVELS.isTagged(type) ||
                Tag.ITEMS_AXES.isTagged(type) ||
                Tag.ITEMS_HOES.isTagged(type)) && random.nextDouble() < 0.2) {
                enchantments.put(EnchantmentX.FORTUNE, random.nextInt(3) + 1);
                sendMessage(p, this.getItemName() + ": §r§a已添加时运 II 附魔!");
            }
        }
    }

    // Talisman of the Wise: Double experience received from any source
    @EventHandler(priority = EventPriority.HIGHEST, ignoreCancelled = true)
    public void onPlayerExperience(PlayerExpChangeEvent e) {
        Player p = e.getPlayer();
        if (random.nextDouble() < 0.2) {
            e.setAmount(e.getAmount() * 2);
            sendMessage(p, this.getItemName() + ": §r§a双倍经验！");
        }
    }

    // Talisman of the Anvil: Prevent tool or armor from breaking by restoring durability
    @EventHandler(priority = EventPriority.HIGHEST, ignoreCancelled = true)
    public void onItemDamage(PlayerItemDamageEvent e) {
        Player p = e.getPlayer();
        ItemStack item = e.getItem();

        if (random.nextDouble() < 0.20) {
            if (item.getDurability() >= item.getType().getMaxDurability() - 1) {
                e.setCancelled(true);
                item.setDurability((short) 0);
                sendMessage(p, this.getItemName() + ": §r§a已保住 " + item.getItemMeta().getDisplayName() + "§r§a!");
            }
        }
    }
}
