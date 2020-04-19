package com.Ziguirr.safidian.blocks;

import com.Ziguirr.safidian.safidian;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(safidian.MOD_ID)
@Mod.EventBusSubscriber(modid = safidian.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class BlockBase {
    public static final Block safidian_block = null;

    @SubscribeEvent
    public static void registerBlocks(final RegistryEvent.Register<Block> event){
        event.getRegistry().register(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(0.5f, 15.0f).sound(SoundType.METAL)).setRegistryName("safidian_block"));
    }

    @SubscribeEvent
    public static void registerBlocksItems(final RegistryEvent.Register<Item> event){
        event.getRegistry().register(new BlockItem(safidian_block, new Item.Properties().maxStackSize(64).group(com.Ziguirr.safidian.safidian.SafidianItemGroup.instance)).setRegistryName("safidian_block"));
    }
}
