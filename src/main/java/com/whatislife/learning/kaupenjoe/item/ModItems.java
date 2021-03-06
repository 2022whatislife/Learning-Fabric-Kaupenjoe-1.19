package com.whatislife.learning.kaupenjoe.item;

import com.whatislife.learning.kaupenjoe.LearningMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item LEARNING_GEM = registerItem("raw_learning",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static final Item LEARNING_INGOT = registerItem("learning_ingot",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static final Item LEARNING_NUGGET = registerItem("learning_nugget",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(LearningMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        LearningMod.LOGGER.info("Registering Mod Items For " + LearningMod.MOD_ID);
    }
}
