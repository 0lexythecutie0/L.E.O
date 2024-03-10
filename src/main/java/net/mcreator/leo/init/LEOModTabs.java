
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.leo.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.leo.LEOMod;

public class LEOModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LEOMod.MODID);
	public static final RegistryObject<CreativeModeTab> LEXYS_EXTENDED_ORGINS = REGISTRY.register("lexys_extended_orgins",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.l_e_o.lexys_extended_orgins")).icon(() -> new ItemStack(Blocks.SUNFLOWER)).displayItems((parameters, tabData) -> {
				tabData.accept(LEOModItems.ORB_OF_REGRET.get());
			}).withSearchBar().build());
}
