package me.bunnky.idreamofeasy.slimefun.machines;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotHopperable;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Recipe;
import org.bukkit.inventory.SmokingRecipe;
import org.jetbrains.annotations.NotNull;

import java.util.Iterator;
/*
A fast cooking machine that uses electricity to smoke food items.
 */
public class ElectricSmoker extends AContainer implements NotHopperable, RecipeDisplayItem {

    public ElectricSmoker(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, item, recipeType, recipe);
    }

    @Override
    protected void registerDefaultRecipes() {
        for (@NotNull Iterator<Recipe> it = Bukkit.recipeIterator(); it.hasNext(); ) {
            Recipe recipe = it.next();
            if (recipe instanceof SmokingRecipe) {
                SmokingRecipe smokingRecipe = (SmokingRecipe) recipe;
                ItemStack input = smokingRecipe.getInput();
                ItemStack result = smokingRecipe.getResult();
                registerRecipe(10, new ItemStack[]{input}, new ItemStack[]{result});
            }
        }
    }

    @Override
    public ItemStack getProgressBar() {
        return new ItemStack(Material.CAMPFIRE);
    }

    @Override
    public @NotNull String getMachineIdentifier() {
        return "IDOE_ELECTRIC_SMOKER";
    }

}
