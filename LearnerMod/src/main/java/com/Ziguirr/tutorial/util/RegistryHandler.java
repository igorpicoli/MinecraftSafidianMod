package com.Ziguirr.tutorial.util;

import com.Ziguirr.tutorial.Tutorial;
import com.Ziguirr.tutorial.items.ItemBase;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.rmi.registry.Registry;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Tutorial.MOD_ID);

    public static void init(){
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // Items
    public static final RegistryObject<Item> SAFIDIAN = ITEMS.register("safidian", ItemBase::new);
    public static final RegistryObject<Item> SAFIDIAN_SWORD = ITEMS.register("safidian_sword", ItemBase::new);
}
