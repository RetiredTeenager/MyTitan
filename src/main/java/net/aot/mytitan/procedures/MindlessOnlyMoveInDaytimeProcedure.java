package net.aot.mytitan.procedures;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.vector.Vector2f;
import net.minecraft.entity.Entity;
import net.minecraft.command.ICommandSource;
import net.minecraft.command.CommandSource;

import net.aot.mytitan.MyTitanModVariables;
import net.aot.mytitan.MyTitanModElements;
import net.aot.mytitan.MyTitanMod;

import java.util.Map;

@MyTitanModElements.ModElement.Tag
public class MindlessOnlyMoveInDaytimeProcedure extends MyTitanModElements.ModElement {
	public MindlessOnlyMoveInDaytimeProcedure(MyTitanModElements instance) {
		super(instance, 218);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MyTitanMod.LOGGER.warn("Failed to load dependency entity for procedure MindlessOnlyMoveInDaytime!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				MyTitanMod.LOGGER.warn("Failed to load dependency x for procedure MindlessOnlyMoveInDaytime!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				MyTitanMod.LOGGER.warn("Failed to load dependency y for procedure MindlessOnlyMoveInDaytime!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				MyTitanMod.LOGGER.warn("Failed to load dependency z for procedure MindlessOnlyMoveInDaytime!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				MyTitanMod.LOGGER.warn("Failed to load dependency world for procedure MindlessOnlyMoveInDaytime!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((((world.getWorldInfo().getDayTime()) >= 13000) && ((world.getWorldInfo().getDayTime()) < 23000))) {
			if (((MyTitanModVariables.WorldVariables.get(world).hasslept) == (false))) {
				if (entity instanceof IAnimatable) {
					new Object() {
						@OnlyIn(Dist.CLIENT)
						void playAnimation(Entity entity, String animationID) {
							IAnimatable aniEntity = (IAnimatable) entity;
							aniEntity.getFactory().get("controller").setAnimation(new AnimationBuilder().addAnimation(animationID, (false)));
						}
					}.playAnimation(entity, "nighttime");
				}
				if (world instanceof ServerWorld) {
					((World) world).getServer().getCommandManager().handleCommand(
							new CommandSource(ICommandSource.DUMMY, new Vector3d(x, y, z), Vector2f.ZERO, (ServerWorld) world, 4, "",
									new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
							"/execute as @e[type=my_titan:gluttonous_titan] run data merge entity @s {NoAI:1}");
				}
				MyTitanModVariables.WorldVariables.get(world).hasslept = (boolean) (true);
				MyTitanModVariables.WorldVariables.get(world).syncData(world);
				MyTitanModVariables.WorldVariables.get(world).haswokenup = (boolean) (false);
				MyTitanModVariables.WorldVariables.get(world).syncData(world);
			} else {
				if (entity instanceof IAnimatable) {
					new Object() {
						@OnlyIn(Dist.CLIENT)
						void playAnimation(Entity entity, String animationID) {
							IAnimatable aniEntity = (IAnimatable) entity;
							aniEntity.getFactory().get("controller").setAnimation(new AnimationBuilder().addAnimation(animationID, (true)));
						}
					}.playAnimation(entity, "laydown");
				}
				MyTitanModVariables.WorldVariables.get(world).haswokenup = (boolean) (false);
				MyTitanModVariables.WorldVariables.get(world).syncData(world);
			}
		} else if ((((world.getWorldInfo().getDayTime()) >= 23000) || ((world.getWorldInfo().getDayTime()) < 13000))) {
			if (((MyTitanModVariables.WorldVariables.get(world).haswokenup) == (false))) {
				if (entity instanceof IAnimatable) {
					new Object() {
						@OnlyIn(Dist.CLIENT)
						void playAnimation(Entity entity, String animationID) {
							IAnimatable aniEntity = (IAnimatable) entity;
							aniEntity.getFactory().get("controller").setAnimation(new AnimationBuilder().addAnimation(animationID, (false)));
						}
					}.playAnimation(entity, "daytime");
				}
				if (world instanceof ServerWorld) {
					((World) world).getServer().getCommandManager().handleCommand(
							new CommandSource(ICommandSource.DUMMY, new Vector3d(x, y, z), Vector2f.ZERO, (ServerWorld) world, 4, "",
									new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
							"/execute as @e[type=my_titan:gluttonous_titan] run data merge entity @s {NoAI:0}");
				}
				MyTitanModVariables.WorldVariables.get(world).haswokenup = (boolean) (true);
				MyTitanModVariables.WorldVariables.get(world).syncData(world);
				MyTitanModVariables.WorldVariables.get(world).hasslept = (boolean) (false);
				MyTitanModVariables.WorldVariables.get(world).syncData(world);
			}
		}
	}
}
