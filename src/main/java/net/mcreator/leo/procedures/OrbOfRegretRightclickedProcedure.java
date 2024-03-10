package net.mcreator.leo.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.leo.network.LEOModVariables;

public class OrbOfRegretRightclickedProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		{
			boolean _setval = false;
			entity.getCapability(LEOModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.HasOrgin = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		OpenOrginMenuOnFreshStartProcedure.execute(world, entity);
	}
}
