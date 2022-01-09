package net.aot.mytitan.procedures;

import net.minecraft.entity.Entity;

import net.aot.mytitan.MyTitanModVariables;
import net.aot.mytitan.MyTitanModElements;
import net.aot.mytitan.MyTitanMod;

import java.util.Map;

@MyTitanModElements.ModElement.Tag
public class ProcedureBeastTitanIconProcedure extends MyTitanModElements.ModElement {
	public ProcedureBeastTitanIconProcedure(MyTitanModElements instance) {
		super(instance, 102);
	}

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MyTitanMod.LOGGER.warn("Failed to load dependency entity for procedure ProcedureBeastTitanIcon!");
			return false;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((((entity.getCapability(MyTitanModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new MyTitanModVariables.PlayerVariables())).hasTitanBeast) == (true))) {
			return (true);
		}
		return (false);
	}
}
