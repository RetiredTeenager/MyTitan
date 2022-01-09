package net.aot.mytitan.procedures;

import net.minecraft.entity.Entity;

import net.aot.mytitan.MyTitanModVariables;
import net.aot.mytitan.MyTitanModElements;
import net.aot.mytitan.MyTitanMod;

import java.util.Map;

@MyTitanModElements.ModElement.Tag
public class ColossalRideProcedure extends MyTitanModElements.ModElement {
	public ColossalRideProcedure(MyTitanModElements instance) {
		super(instance, 204);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MyTitanMod.LOGGER.warn("Failed to load dependency entity for procedure ColossalRide!");
			return;
		}
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				MyTitanMod.LOGGER.warn("Failed to load dependency sourceentity for procedure ColossalRide!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		if ((((entity.getCapability(MyTitanModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new MyTitanModVariables.PlayerVariables())).hasTitanColossus) == (true))) {
			sourceentity.startRiding(entity);
		}
	}
}
