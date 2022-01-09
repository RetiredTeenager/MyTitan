package net.aot.mytitan.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.Entity;

import net.aot.mytitan.MyTitanModVariables;
import net.aot.mytitan.MyTitanModElements;
import net.aot.mytitan.MyTitanMod;

import java.util.Map;
import java.util.Collections;

@MyTitanModElements.ModElement.Tag
public class EntityCartSeatOnEntityTickUpdateProcedure extends MyTitanModElements.ModElement {
	public EntityCartSeatOnEntityTickUpdateProcedure(MyTitanModElements instance) {
		super(instance, 113);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MyTitanMod.LOGGER.warn("Failed to load dependency entity for procedure EntityCartSeatOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				MyTitanMod.LOGGER.warn("Failed to load dependency world for procedure EntityCartSeatOnEntityTickUpdate!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		IWorld world = (IWorld) dependencies.get("world");
		if (((MyTitanModVariables.WorldVariables.get(world).isCartMinigunOn) == (true))) {
			{
				Entity _ent = entity;
				_ent.setPositionAndUpdate((MyTitanModVariables.WorldVariables.get(world).getCartCoordsX),
						(MyTitanModVariables.WorldVariables.get(world).getCartCoordsY),
						(MyTitanModVariables.WorldVariables.get(world).getCartCoordsZ));
				if (_ent instanceof ServerPlayerEntity) {
					((ServerPlayerEntity) _ent).connection.setPlayerLocation((MyTitanModVariables.WorldVariables.get(world).getCartCoordsX),
							(MyTitanModVariables.WorldVariables.get(world).getCartCoordsY),
							(MyTitanModVariables.WorldVariables.get(world).getCartCoordsZ), _ent.rotationYaw, _ent.rotationPitch,
							Collections.emptySet());
				}
			}
		} else {
			if (!entity.world.isRemote)
				entity.remove();
		}
	}
}
