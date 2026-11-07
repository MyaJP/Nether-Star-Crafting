package com.mya.netherstarrecipe;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

@Mod(NetherStarCrafting.MODID)
public class NetherStarCrafting {
    public static final String MODID = "netherstarrecipe";

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

    // netherstarrecipe:netherstar_shard
    public static final DeferredItem<Item> NETHERSTAR_SHARD = ITEMS.registerSimpleItem("netherstar_shard");

    public NetherStarCrafting(IEventBus modEventBus) {
        ITEMS.register(modEventBus);
        modEventBus.addListener(this::addCreative);
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(NETHERSTAR_SHARD);
        }
    }
}
