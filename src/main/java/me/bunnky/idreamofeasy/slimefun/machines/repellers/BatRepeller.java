package me.bunnky.idreamofeasy.slimefun.machines.repellers;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.ItemStack;

public class BatRepeller extends MobRepeller {

    public BatRepeller(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe, int ecost, int cap) {
        super(itemGroup, item, recipeType, recipe, ecost, cap);
    }

    @Override
    protected EntityType getRepelledEntityType() {
        return EntityType.BAT;
    }

    @Override
    protected String getRepelledEntityName() {
        return "蝙蝠";
    }
}
