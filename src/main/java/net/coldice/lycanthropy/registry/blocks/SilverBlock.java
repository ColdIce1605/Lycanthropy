package net.coldice.lycanthropy.registry.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;

public class SilverBlock extends Block {
    public SilverBlock() {
        super(Settings.copy(new Block(FabricBlockSettings.of(Material.METAL)
                .breakByTool(FabricToolTags.PICKAXES, 1)
                .requiresTool()
                .strength(4.0f, 15)
                .sounds(BlockSoundGroup.METAL))));
    }
}
