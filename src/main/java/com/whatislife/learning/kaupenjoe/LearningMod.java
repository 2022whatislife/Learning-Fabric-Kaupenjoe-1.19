package com.whatislife.learning.kaupenjoe;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LearningMod implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("learning-kaupenjoe");

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
	}
}
