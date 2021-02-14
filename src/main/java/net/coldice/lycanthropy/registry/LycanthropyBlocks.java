package net.coldice.lycanthropy.registry;

import net.coldice.lycanthropy.Lycanthropy;
import net.coldice.lycanthropy.registry.blocks.SilverBlock;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class LycanthropyBlocks {

    public static SilverBlock SILVER_BLOCK = new SilverBlock();

    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(Lycanthropy.MOD_ID, "silver_block"), SILVER_BLOCK);
    }
}
