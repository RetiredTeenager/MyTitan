package net.aot.mytitan.procedures;

import net.minecraft.entity.Entity;

import net.aot.mytitan.MyTitanModVariables;
import net.aot.mytitan.MyTitanModElements;
import net.aot.mytitan.MyTitanMod;

import java.util.Map;

@MyTitanModElements.ModElement.Tag
public class ColossalTitan2ndAbilityStopProcedure extends MyTitanModElements.ModElement {
	public ColossalTitan2ndAbilityStopProcedure(MyTitanModElements instance) {
		super(instance, 66);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MyTitanMod.LOGGER.warn("Failed to load dependency entity for procedure ColossalTitan2ndAbilityStop!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		{
			boolean _setval = (boolean) (false);
			entity.getCapability(MyTitanModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.isColossalAbilityOn = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
