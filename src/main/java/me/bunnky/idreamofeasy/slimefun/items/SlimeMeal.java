package me.bunnky.idreamofeasy.slimefun.items;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import me.bunnky.idreamofeasy.utils.IDOEUtility;
import org.bukkit.GameMode;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Slime;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class SlimeMeal extends SlimefunItem {

    public SlimeMeal(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, item, recipeType, recipe);
        addItemHandler(onUse());
        IDOEUtility.setGlow(item);
    }

    private ItemUseHandler onUse() {
        return e -> {
            PlayerInteractEvent event = e.getInteractEvent();
            Player p = event.getPlayer();
            Entity entity = p.getTargetEntity(5);

            if (entity != null && entity.getType() == EntityType.SLIME) {
                Slime slime = (Slime) entity;
                int newSize = Math.min(slime.getSize() + 1, 20);
                slime.setSize(newSize);
                if (p.getGameMode() == GameMode.SURVIVAL) {
                    event.getItem().setAmount(event.getItem().getAmount() - 1);
                }
            }
        };
    }
}