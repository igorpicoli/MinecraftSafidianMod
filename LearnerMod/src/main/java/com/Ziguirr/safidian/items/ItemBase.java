package com.Ziguirr.safidian.items;

import com.Ziguirr.safidian.safidian;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
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

        //safidian
        event.getRegistry().register(new Item(new Item.Properties().group(com.Ziguirr.safidian.safidian.SafidianItemGroup.instance)).setRegistryName("safidian"));

        //safidian potato
        event.getRegistry().register(new Item(new Item.Properties().group(com.Ziguirr.safidian.safidian.SafidianItemGroup.instance).food(new Food.Builder().hunger(6).saturation(1.2f).effect(new EffectInstance(Effects.SPEED, 6000, 3), 0.7f).build())).setRegistryName("safidian_potato"));
    }
}