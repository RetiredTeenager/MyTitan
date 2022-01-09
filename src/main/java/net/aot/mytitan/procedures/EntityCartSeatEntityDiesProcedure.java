package net.aot.mytitan.procedures;

import net.minecraft.world.IWorld;

import net.aot.mytitan.MyTitanModVariables;
import net.aot.mytitan.MyTitanModElements;
import net.aot.mytitan.MyTitanMod;

import java.util.Map;

@MyTitanModElements.ModElement.Tag
public class EntityCartSeatEntityDiesProcedure extends MyTitanModElements.ModElement {
	public EntityCartSeatEntityDiesProcedure(MyTitanModElements instance) {
		super(instance, 117);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				MyTitanMod.LOGGER.warn("Failed to load dependency world for procedure EntityCartSeatEntityDies!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		MyTitanModVariables.WorldVariables.get(world).hasCartMinigunSpawned = (boolean) (false);
		MyTitanModVariables.WorldVariables.get(world).syncData(world);
	}
}
