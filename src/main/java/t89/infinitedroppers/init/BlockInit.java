package t89.infinitedroppers.init;


import net.minecraft.block.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import t89.infinitedroppers.InfiniteDroppers;

public class BlockInit {
    public static final Block INFINITE_DROPPER = register("infinite_dropper", new Block(AbstractBlock.Settings.copy(Blocks.DROPPER)));

            public static <T extends Block> T register(String name, T block) {
                return Registry.register(Registries.BLOCK, InfiniteDroppers.id(name), block);
            }
}
