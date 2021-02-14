package net.coldice.lycanthropy.registry.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class Silver extends Item {
    public Silver() {
        super(new Settings().maxCount(64).group(ItemGroup.MATERIALS));
    }
}
