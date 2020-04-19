package com.Ziguirr.safidian;

import com.Ziguirr.safidian.items.ItemBase;
import com.Ziguirr.safidian.util.RegistryHandler;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartedEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("safidian")
public class safidian {
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "safidian";

    public safidian() {
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::setup);
        modEventBus.addListener(this::doClientStuff);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
    }

    @SubscribeEvent
    public void onServerStarting(FMLServerStartedEvent event) {

    }

    public static class SafidianItemGroup extends ItemGroup
    {
       public static final SafidianItemGroup instance = new SafidianItemGroup(ItemGroup.GROUPS.length, "safidiantab");
       private SafidianItemGroup(int index, String label)
       {
           super(index, label);
       }
       @Override
       public ItemStack createIcon()
       {
           return new ItemStack(ItemBase.safidian);
       }
    }
}
