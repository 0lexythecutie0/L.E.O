
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.leo.init;

import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.GameRules;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class LEOModGameRules {
	public static final GameRules.Key<GameRules.BooleanValue> DEBUG = GameRules.register("debug", GameRules.Category.UPDATES, GameRules.BooleanValue.create(false));
}
