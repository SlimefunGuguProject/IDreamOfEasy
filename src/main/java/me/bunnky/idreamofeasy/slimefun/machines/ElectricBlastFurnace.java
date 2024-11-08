package me.bunnky.idreamofeasy.slimefun.machines;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotHopperable;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.BlastingRecipe;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Recipe;
import org.jetbrains.annotations.NotNull;

import java.util.Iterator;
/*
An efficient furnace that uses electricity to blast ores and materials into refined items quickly.
 */
public class ElectricBlastFurnace extends AContainer implements NotHopperable, RecipeDisplayItem {

    public ElectricBlastFurnace(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, item, recipeType, recipe);
    }

    @Override
    protected void registerDefaultRecipes() {
        for (@NotNull Iterator<Recipe> it = Bukkit.recipeIterator(); it.hasNext(); ) {
            Recipe recipe = it.next();
            if (recipe instanceof BlastingRecipe) {
                BlastingRecipe blastingRecipe = (BlastingRecipe) recipe;
                ItemStack input = blastingRecipe.getInput();
                ItemStack result = blastingRecipe.getResult();
                registerRecipe(10, new ItemStack[]{input}, new ItemStack[]{result});
            }
        }
    }

    @Override
    public ItemStack getProgressBar() {
        return new ItemStack(Material.FLINT_AND_STEEL);
    }

    @Override
    public @NotNull String getMachineIdentifier() {
        return "IDOE_ELECTRIC_BLASTFURNACE";
    }
}
