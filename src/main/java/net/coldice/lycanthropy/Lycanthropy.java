package net.coldice.lycanthropy;

import net.coldice.lycanthropy.registry.LycanthropyBlocks;
import net.coldice.lycanthropy.registry.LycanthropyItems;
import net.fabricmc.api.ModInitializer;

public class Lycanthropy implements ModInitializer {

    public static final String MOD_ID = "lycanthropy";

    @Override
    public void onInitialize() {
        LycanthropyItems.registerItems();
        LycanthropyBlocks.registerBlocks();
    }
}
