package net.aot.mytitan.procedures;

import net.minecraft.world.IWorld;

import net.aot.mytitan.MyTitanModVariables;
import net.aot.mytitan.MyTitanModElements;
import net.aot.mytitan.MyTitanMod;

import java.util.Map;

@MyTitanModElements.ModElement.Tag
public class ProcedureCartTitanRemovedProcedure extends MyTitanModElements.ModElement {
	public ProcedureCartTitanRemovedProcedure(MyTitanModElements instance) {
		super(instance, 119);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				MyTitanMod.LOGGER.warn("Failed to load dependency world for procedure ProcedureCartTitanRemoved!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		MyTitanModVariables.WorldVariables.get(world).isCartMinigunOn = (boolean) (false);
		MyTitanModVariables.WorldVariables.get(world).syncData(world);
	}
}
