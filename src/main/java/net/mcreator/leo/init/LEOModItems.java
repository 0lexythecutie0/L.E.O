
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.leo.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.leo.item.OrbOfRegretItem;
import net.mcreator.leo.LEOMod;

public class LEOModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, LEOMod.MODID);
	public static final RegistryObject<Item> ORB_OF_REGRET = REGISTRY.register("orb_of_regret", () -> new OrbOfRegretItem());
}
