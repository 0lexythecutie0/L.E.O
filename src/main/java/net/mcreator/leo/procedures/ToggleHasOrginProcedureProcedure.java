package net.mcreator.leo.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.leo.network.LEOModVariables;

public class ToggleHasOrginProcedureProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(LEOModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LEOModVariables.PlayerVariables())).HasOrgin == true) {
			{
				boolean _setval = false;
				entity.getCapability(LEOModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.HasOrgin = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else {
			{
				boolean _setval = true;
				entity.getCapability(LEOModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.HasOrgin = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
