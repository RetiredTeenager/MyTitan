package net.aot.mytitan.procedures;

import net.minecraft.world.IWorld;

import net.aot.mytitan.MyTitanModVariables;
import net.aot.mytitan.MyTitanModElements;
import net.aot.mytitan.MyTitanMod;

import java.util.Map;

@MyTitanModElements.ModElement.Tag
public class EntityErenHumanOnInitialEntitySpawnProcedure extends MyTitanModElements.ModElement {
	public EntityErenHumanOnInitialEntitySpawnProcedure(MyTitanModElements instance) {
		super(instance, 224);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				MyTitanMod.LOGGER.warn("Failed to load dependency world for procedure EntityErenHumanOnInitialEntitySpawn!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		MyTitanModVariables.MapVariables.get(world).isErenInWorld = (boolean) (true);
		MyTitanModVariables.MapVariables.get(world).syncData(world);
	}
}
