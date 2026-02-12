package io.github.intkasako.whiteenergydrink.block;

import io.github.intkasako.whiteenergydrink.WhiteEnergyDrink;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block ARCTIC_CRYSTAL_BLOCK = registerBlock(
            "arctic_crystal_block",
            new Block(AbstractBlock.Settings
                    .copy(Blocks.AMETHYST_BLOCK)
                    .luminance(state -> 8)
            )
    );


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(
                Registries.BLOCK,
                Identifier.of(WhiteEnergyDrink.MOD_ID, name),
                block
        );
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(
                Registries.ITEM,
                Identifier.of(WhiteEnergyDrink.MOD_ID, name),
                new BlockItem(block, new Item.Settings())
        );
    }

    public static void registerModBlocks() {
        WhiteEnergyDrink.LOGGER.info("Registering Mod Blocks for " + WhiteEnergyDrink.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ARCTIC_CRYSTAL_BLOCK);
        });
    }


}
