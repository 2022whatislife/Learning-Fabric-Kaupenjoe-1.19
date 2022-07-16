package com.whatislife.learning.kaupenjoe;

import com.whatislife.learning.kaupenjoe.block.ModBlocks;
import com.whatislife.learning.kaupenjoe.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LearningMod implements ModInitializer {
	public static final String MOD_ID = "learning-kaupenjoe";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
