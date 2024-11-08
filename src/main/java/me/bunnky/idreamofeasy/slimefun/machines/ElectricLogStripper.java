package me.bunnky.idreamofeasy.slimefun.machines;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotHopperable;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;
/*
Transforms logs into stripped wood, enhancing your building options.
 */

public class ElectricLogStripper extends AContainer implements NotHopperable, RecipeDisplayItem {

    public ElectricLogStripper(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, item, recipeType, recipe);
    }

    @Override
    protected void registerDefaultRecipes() {
        Material[] logs = {
            Material.OAK_LOG, Material.BIRCH_LOG, Material.SPRUCE_LOG,
            Material.JUNGLE_LOG, Material.ACACIA_LOG, Material.DARK_OAK_LOG,
            Material.MANGROVE_LOG, Material.CRIMSON_STEM, Material.WARPED_STEM, Material.CHERRY_LOG
        };

        Material[] strippedLogs = {
            Material.STRIPPED_OAK_LOG, Material.STRIPPED_BIRCH_LOG, Material.STRIPPED_SPRUCE_LOG,
            Material.STRIPPED_JUNGLE_LOG, Material.STRIPPED_ACACIA_LOG, Material.STRIPPED_DARK_OAK_LOG,
            Material.STRIPPED_MANGROVE_LOG, Material.STRIPPED_CRIMSON_STEM, Material.STRIPPED_WARPED_STEM, Material.STRIPPED_CHERRY_LOG
        };

        for (int i = 0; i < logs.length; i++) {
            ItemStack input = new ItemStack(logs[i]);
            ItemStack result = new ItemStack(strippedLogs[i]);
            registerRecipe(10, new ItemStack[]{input}, new ItemStack[]{result});
        }
    }

    @Override
    public ItemStack getProgressBar() {
        return new ItemStack(Material.STONE_AXE);
    }

    @Override
    public @NotNull String getMachineIdentifier() {
        return "IDOE_ELECTRIC_LOG_STRIPPER";
    }
}
