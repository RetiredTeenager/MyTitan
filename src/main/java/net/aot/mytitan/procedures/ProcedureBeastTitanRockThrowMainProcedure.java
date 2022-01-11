package net.aot.mytitan.procedures;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.aot.mytitan.item.ProjectileBeastTitanItem;
import net.aot.mytitan.MyTitanModElements;
import net.aot.mytitan.MyTitanMod;

import java.util.Random;
import java.util.Map;

@MyTitanModElements.ModElement.Tag
public class ProcedureBeastTitanRockThrowMainProcedure extends MyTitanModElements.ModElement {
	public ProcedureBeastTitanRockThrowMainProcedure(MyTitanModElements instance) {
		super(instance, 93);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MyTitanMod.LOGGER.warn("Failed to load dependency entity for procedure ProcedureBeastTitanRockThrowMain!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity) {
			Entity _ent = entity;
			if (!_ent.world.isRemote()) {
				ProjectileBeastTitanItem.shoot(_ent.world, (LivingEntity) entity, new Random(), (float) 3, (float) 20, (int) 25);
			}
		}
	}
}
