package me.bunnky.idreamofeasy.slimefun.machines;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineRecipe;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.potion.PotionType;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class ElectricPoisonExtractor extends AContainer implements RecipeDisplayItem {

    public ElectricPoisonExtractor(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, item, recipeType, recipe);
    }

    @Override
    protected void registerDefaultRecipes() {
        registerRecipe(4, new ItemStack[] { new ItemStack(Material.GLASS_BOTTLE), new ItemStack(Material.POISONOUS_POTATO) }, new ItemStack[] { createPoisonPotion(PotionType.STRONG_POISON) });
        registerRecipe(6, new ItemStack[] { new ItemStack(Material.GLASS_BOTTLE), new ItemStack(Material.PUFFERFISH) }, new ItemStack[] { createPoisonPotion(PotionType.LONG_POISON) });
        registerRecipe(6, new ItemStack[] { new ItemStack(Material.GLASS_BOTTLE), new ItemStack(Material.SPIDER_EYE, 2) }, new ItemStack[] { createPoisonPotion(PotionType.POISON) });
        registerRecipe(8, new ItemStack[] { new ItemStack(Material.GLASS_BOTTLE), new ItemStack(Material.ROTTEN_FLESH, 8) }, new ItemStack[] { createPoisonPotion(PotionType.POISON) });
        registerRecipe(4, new ItemStack[] { new ItemStack(Material.GLASS_BOTTLE), new ItemStack(Material.RED_MUSHROOM, 4) }, new ItemStack[] { createPoisonPotion(PotionType.POISON) });
        registerRecipe(4, new ItemStack[] { new ItemStack(Material.GLASS_BOTTLE), new ItemStack(Material.BROWN_MUSHROOM, 4) }, new ItemStack[] { createPoisonPotion(PotionType.POISON) });
    }

    private ItemStack createPoisonPotion(PotionType type) {
        ItemStack potion = new ItemStack(Material.POTION);
        PotionMeta potionMeta = (PotionMeta) potion.getItemMeta();

        if (potionMeta != null) {
            switch (type) {
                case LONG_POISON:
                    potionMeta.setBasePotionType(PotionType.LONG_POISON);
                    break;
                case STRONG_POISON:
                    potionMeta.setBasePotionType(PotionType.STRONG_POISON);
                    break;
                default:
                    potionMeta.setBasePotionType(PotionType.POISON);
                    break;
            }

            potion.setItemMeta(potionMeta);
        }

        return potion;
    }

    @Override
    public List<ItemStack> getDisplayRecipes() {
        List<ItemStack> displayRecipes = new ArrayList<>(recipes.size() * 2);

        for (MachineRecipe recipe : recipes) {
            displayRecipes.add(recipe.getInput()[recipe.getInput().length - 1]);
            displayRecipes.add(recipe.getOutput()[0]);
        }

        return displayRecipes;
    }

    @Override
    public ItemStack getProgressBar() {
        return createPoisonPotion(PotionType.POISON);
    }

    @Override
    public @NotNull String getMachineIdentifier() {
        return "IDOE_ELECTRIC_POISON_EXTRACTOR";
    }
}