package net.aot.mytitan.procedures;

import net.minecraft.entity.Entity;

import net.aot.mytitan.MyTitanModElements;
import net.aot.mytitan.MyTitanMod;

import java.util.Map;

@MyTitanModElements.ModElement.Tag
public class ArmorODMLeggingsTickEventProcedure extends MyTitanModElements.ModElement {
	public ArmorODMLeggingsTickEventProcedure(MyTitanModElements instance) {
		super(instance, 221);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MyTitanMod.LOGGER.warn("Failed to load dependency entity for procedure ArmorODMLeggingsTickEvent!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((entity.getMotion().getX()) >= 40)) {
			entity.setMotion(35, (entity.getMotion().getY()), (entity.getMotion().getZ()));
		}
		if (((entity.getMotion().getY()) >= 40)) {
			entity.setMotion((entity.getMotion().getX()), 35, (entity.getMotion().getZ()));
		}
		if (((entity.getMotion().getZ()) >= 40)) {
			entity.setMotion((entity.getMotion().getX()), (entity.getMotion().getY()), 35);
		}
	}
}
