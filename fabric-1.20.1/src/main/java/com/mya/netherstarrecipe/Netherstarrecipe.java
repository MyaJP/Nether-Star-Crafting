package com.mya.netherstarrecipe;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Netherstarrecipe implements ModInitializer {
	public static final String MOD_ID = "netherstarrecipe";

	// This logger is used to write text to the console and the log file.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	// The "netherstar_shard" item
	public static final Item NETHERSTAR_SHARD = new Item(new Item.Settings());

	@Override
	public void onInitialize() {
		// Register the netherstar shard item
		Registry.register(Registries.ITEM, id("netherstar_shard"), NETHERSTAR_SHARD);

		// Add it to the Ingredients creative tab
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
			entries.add(NETHERSTAR_SHARD);
		});
	}

	public static Identifier id(String path) {
		return new Identifier(MOD_ID, path);
	}
}
