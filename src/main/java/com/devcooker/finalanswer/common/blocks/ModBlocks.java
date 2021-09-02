package com.devcooker.finalanswer.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, "finalanswer");
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "finalanswer");

    private static final RegistryObject<Block> ENERGY_ORE = BLOCKS.register("energy_ore", EnergyOre::new);
    private static final RegistryObject<Item> ENERGY_ORE_ITEM = ITEMS.register("energy_ore", () -> new BlockItem(ENERGY_ORE.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));

}
