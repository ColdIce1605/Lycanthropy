package net.coldice.lycanthropy.registry;

import net.coldice.lycanthropy.Lycanthropy;
import net.coldice.lycanthropy.registry.items.Silver;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class LycanthropyItems {
    //Items
    public static Silver SILVER = new Silver();
    //public static Silver SILVER_SWORD = new Silver();

    //Block Items
    public static final BlockItem SILVER_BLOCK = new BlockItem(LycanthropyBlocks.SILVER_BLOCK, new Item.Settings().maxCount(64).group(ItemGroup.BUILDING_BLOCKS));

    public static void registerItems() {

        Registry.register(Registry.ITEM, new Identifier(Lycanthropy.MOD_ID,"silver"), SILVER);
        Registry.register(Registry.ITEM, new Identifier(Lycanthropy.MOD_ID, "silver_block"), SILVER_BLOCK);
        //Registry.register(Registry.ITEM, new Identifier(Lycanthropy.MOD_ID, "Silver Sword"), SILVER_SWORD);
    }
}
