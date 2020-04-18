package com.Ziguirr.safidian.items;

import com.Ziguirr.safidian.safidian;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = safidian.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(safidian.MOD_ID)
public class ItemBase {
    public static final Item safidian = null;

    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> event){
        event.getRegistry().register(new Item(new Item.Properties().group(ItemGroup.MISC)).setRegistryName("safidian"));
    }
}