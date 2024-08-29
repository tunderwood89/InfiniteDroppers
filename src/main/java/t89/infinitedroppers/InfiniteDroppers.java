package t89.infinitedroppers;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.item.Item;
import net.minecraft.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import t89.infinitedroppers.init.ItemInit;

public class InfiniteDroppers implements ModInitializer {
	public static final String MOD_ID = "infinitedroppers";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static final Item INFINITE_DROPPER = new Item(new Item.Settings());


	@Override
	public void onInitialize() {
		LOGGER.info("Loading " + MOD_ID);
		ItemInit.load();
		Registry.register(Registries.ITEM, new Identifier("infinitedroppers", "infinite_dropper"), INFINITE_DROPPER);

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.MISC).register(content -> {
			content.add(INFINITEDROPPERS);
		});
	}

	public static Identifier id(String path) {
			return Identifier.of(MOD_ID, path);
    }
}

