package net.coldice.lycanthropy.client;

import net.fabricmc.api.ClientModInitializer;

@net.fabricmc.api.Environment(net.fabricmc.api.EnvType.CLIENT)
public class LycanthropyClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        System.out.println("Playing");
    }
}
