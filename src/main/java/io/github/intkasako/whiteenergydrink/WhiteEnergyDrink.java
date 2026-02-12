package io.github.intkasako.whiteenergydrink;

import io.github.intkasako.whiteenergydrink.block.ModBlocks;
import io.github.intkasako.whiteenergydrink.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WhiteEnergyDrink implements ModInitializer {
	public static final String MOD_ID = "white_energy_drink";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();

	}
}