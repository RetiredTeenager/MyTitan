package net.aot.mytitan.procedures;

import net.minecraft.world.IWorld;

import net.aot.mytitan.MyTitanModVariables;
import net.aot.mytitan.MyTitanModElements;
import net.aot.mytitan.MyTitanMod;

import java.util.Map;

@MyTitanModElements.ModElement.Tag
public class EntityErenHumanEntityDiesProcedure extends MyTitanModElements.ModElement {
	public EntityErenHumanEntityDiesProcedure(MyTitanModElements instance) {
		super(instance, 223);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				MyTitanMod.LOGGER.warn("Failed to load dependency world for procedure EntityErenHumanEntityDies!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		MyTitanModVariables.MapVariables.get(world).isErenInWorld = (boolean) (false);
		MyTitanModVariables.MapVariables.get(world).syncData(world);
	}
}
