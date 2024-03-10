package net.mcreator.leo.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.leo.network.LEOModVariables;
import net.mcreator.leo.init.LEOModGameRules;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class OpenOrginMenuOnFreshStartProcedure {
	@SubscribeEvent
	public static void onEntityJoin(EntityJoinLevelEvent event) {
		execute(event, event.getLevel(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (world.getLevelData().getGameRules().getBoolean(LEOModGameRules.DEBUG) == true) {
			if ((entity.getCapability(LEOModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LEOModVariables.PlayerVariables())).HasOrgin == false) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Does not have Orgin"), true);
			} else {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Has Orgin"), true);
			}
		}
	}
}
