package t89.infinitedroppers.init;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import t89.infinitedroppers.InfiniteDroppers;

public class ItemInit {
    public static final BlockItem INFINITE_DROPPER = register("infinite_dropper",
            new BlockItem(BlockInit.INFINITE_DROPPER, new Item.Settings()));

    public static <T extends Item> T register(String name, T item) {
        return Registry.register(Registries.ITEM, InfiniteDroppers.id(name), item);
    }

    public static void load() {
    }
}
