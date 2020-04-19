package com.Ziguirr.safidian.items;

import com.Ziguirr.safidian.safidian;
import net.minecraft.item.*;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.LazyValue;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = safidian.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(safidian.MOD_ID)
public class ItemBase {
    public static final Item safidian = null;

    //Tools
    public static final Item safidian_sword = null;
    public static final Item safidian_pickaxe = null;
    public static final Item safidian_shovel = null;
    public static final Item safidian_axe = null;
    public static final Item safidian_hoe = null;


    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> event){

        //safidian
        event.getRegistry().register(new Item(new Item.Properties().group(com.Ziguirr.safidian.safidian.SafidianItemGroup.instance)).setRegistryName("safidian"));

        //safidian potato
        event.getRegistry().register(new Item(new Item.Properties()
                .group(com.Ziguirr.safidian.safidian.SafidianItemGroup.instance)
                .food(new Food.Builder().setAlwaysEdible().hunger(6).saturation(1.2f)
                        .effect(new EffectInstance(Effects.SPEED, 6000, 1), 0.7f)
                        .effect(new EffectInstance(Effects.JUMP_BOOST, 3000, 2), 0.71f)
                        .effect(new EffectInstance(Effects.INSTANT_HEALTH, 1, 1), 0.70f).build()))
                .setRegistryName("safidian_potato"));

        //Tools
        event.getRegistry().register(new SwordItem(ModItemTier.SAFIDIAN, 9, 3.0F, new Item.Properties().group(com.Ziguirr.safidian.safidian.SafidianItemGroup.instance)).setRegistryName("safidian_sword"));
        event.getRegistry().register(new PickaxeItem(ModItemTier.SAFIDIAN, 7, 1.8F, new Item.Properties().group(com.Ziguirr.safidian.safidian.SafidianItemGroup.instance)).setRegistryName("safidian_pickaxe"));
        event.getRegistry().register(new ShovelItem(ModItemTier.SAFIDIAN, 6, 1.2F, new Item.Properties().group(com.Ziguirr.safidian.safidian.SafidianItemGroup.instance)).setRegistryName("safidian_shovel"));
        event.getRegistry().register(new AxeItem(ModItemTier.SAFIDIAN, 11, 1.3F, new Item.Properties().group(com.Ziguirr.safidian.safidian.SafidianItemGroup.instance)).setRegistryName("safidian_axe"));
        event.getRegistry().register(new HoeItem(ModItemTier.SAFIDIAN, 4.0F, new Item.Properties().group(com.Ziguirr.safidian.safidian.SafidianItemGroup.instance)).setRegistryName("safidian_hoe"));
    }

    public enum ModItemTier implements IItemTier{
        SAFIDIAN(4,2032, 15.0f, 7.0f, 100, () -> {
            return Ingredient.fromItems(ItemBase.safidian);
        });
        private final int harvestLevel;
        private final int maxUses;
        private final float efficiency;
        private final float attackDamage;
        private final int enchantability;
        private final LazyValue<Ingredient> repairMaterial;

        private ModItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial){
            this.harvestLevel = harvestLevel;
            this.maxUses = maxUses;
            this.efficiency = efficiency;
            this.attackDamage = attackDamage;
            this.enchantability = enchantability;
            this.repairMaterial = new LazyValue<>(repairMaterial);
        }

        @Override
        public int getMaxUses() {
            return this.maxUses;
        }

        @Override
        public float getEfficiency() {
            return this.efficiency;
        }

        @Override
        public float getAttackDamage() {
            return this.attackDamage;
        }

        @Override
        public int getHarvestLevel() {
            return this.harvestLevel;
        }

        @Override
        public int getEnchantability() {
            return this.enchantability;
        }

        @Override
        public Ingredient getRepairMaterial() {
            return this.repairMaterial.getValue();
        }
    }
}