package io.github.intkasako.whiteenergydrink.item;

import io.github.intkasako.whiteenergydrink.WhiteEnergyDrink;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item ARCTIC_ESSENCE = registerItem("arctic_essence", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(WhiteEnergyDrink.MOD_ID, name), item);
    }

    public static void  registerModItems(){
        WhiteEnergyDrink.LOGGER.info("Registering Mod Items for " + WhiteEnergyDrink.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(ARCTIC_ESSENCE);
        });
    }

}
