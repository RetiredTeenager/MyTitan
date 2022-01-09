package net.aot.mytitan.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.Entity;

import net.aot.mytitan.entity.EntityCartSeatEntity;
import net.aot.mytitan.MyTitanModVariables;
import net.aot.mytitan.MyTitanModElements;
import net.aot.mytitan.MyTitanMod;

import java.util.Map;

@MyTitanModElements.ModElement.Tag
public class EntityControllableCartTitanOnEntityTickUpdateProcedure extends MyTitanModElements.ModElement {
	public EntityControllableCartTitanOnEntityTickUpdateProcedure(MyTitanModElements instance) {
		super(instance, 85);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MyTitanMod.LOGGER.warn("Failed to load dependency entity for procedure EntityControllableCartTitanOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				MyTitanMod.LOGGER.warn("Failed to load dependency x for procedure EntityControllableCartTitanOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				MyTitanMod.LOGGER.warn("Failed to load dependency y for procedure EntityControllableCartTitanOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				MyTitanMod.LOGGER.warn("Failed to load dependency z for procedure EntityControllableCartTitanOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				MyTitanMod.LOGGER.warn("Failed to load dependency world for procedure EntityControllableCartTitanOnEntityTickUpdate!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((((MyTitanModVariables.WorldVariables.get(world).isCartMinigunOn) == (true))
				&& ((MyTitanModVariables.WorldVariables.get(world).hasCartMinigunSpawned) == (false)))) {
			if (world instanceof World && !world.getWorld().isRemote) {
				Entity entityToSpawn = new EntityCartSeatEntity.CustomEntity(EntityCartSeatEntity.entity, world.getWorld());
				entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof MobEntity)
					((MobEntity) entityToSpawn).onInitialSpawn(world, world.getDifficultyForLocation(new BlockPos(entityToSpawn)),
							SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
				world.addEntity(entityToSpawn);
			}
			if (entity instanceof PlayerEntity && !entity.world.isRemote) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("Spawned"), (false));
			}
		}
		if (((MyTitanModVariables.WorldVariables.get(world).isCartMinigunOn) == (true))) {
			MyTitanModVariables.WorldVariables.get(world).getCartCoordsX = (double) (entity.getPosX());
			MyTitanModVariables.WorldVariables.get(world).syncData(world);
			MyTitanModVariables.WorldVariables.get(world).getCartCoordsY = (double) (entity.getPosY());
			MyTitanModVariables.WorldVariables.get(world).syncData(world);
			MyTitanModVariables.WorldVariables.get(world).getCartCoordsZ = (double) (entity.getPosZ());
			MyTitanModVariables.WorldVariables.get(world).syncData(world);
		}
	}
}
