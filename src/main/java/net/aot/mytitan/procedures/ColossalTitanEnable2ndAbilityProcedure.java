package net.aot.mytitan.procedures;

import software.bernie.geckolib.entity.IAnimatedEntity;
import software.bernie.geckolib.animation.builder.AnimationBuilder;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.world.Explosion;
import net.minecraft.util.math.RayTraceContext;
import net.minecraft.entity.Entity;

import net.aot.mytitan.MyTitanModElements;
import net.aot.mytitan.MyTitanMod;

import java.util.Map;

@MyTitanModElements.ModElement.Tag
public class ColossalTitanEnable2ndAbilityProcedure extends MyTitanModElements.ModElement {
	public ColossalTitanEnable2ndAbilityProcedure(MyTitanModElements instance) {
		super(instance, 65);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MyTitanMod.LOGGER.warn("Failed to load dependency entity for procedure ColossalTitanEnable2ndAbility!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				MyTitanMod.LOGGER.warn("Failed to load dependency world for procedure ColossalTitanEnable2ndAbility!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		IWorld world = (IWorld) dependencies.get("world");
		double randommoment = 0;
		double countup = 0;
		if ((entity.getRidingEntity()) instanceof IAnimatedEntity) {
			new Object() {
				@OnlyIn(Dist.CLIENT)
				void playAnimation(Entity entity, String animationID) {
					IAnimatedEntity aniEntity = (IAnimatedEntity) entity;
					aniEntity.getAnimationManager().get("controller").setAnimation(new AnimationBuilder().addAnimation(animationID, (false)));
				}
			}.playAnimation((entity.getRidingEntity()), "kickplaceboomboomR");
		}
		new Object() {
			private int ticks = 0;
			private float waitTicks;
			private IWorld world;
			public void start(IWorld world, int waitTicks) {
				this.waitTicks = waitTicks;
				MinecraftForge.EVENT_BUS.register(this);
				this.world = world;
			}

			@SubscribeEvent
			public void tick(TickEvent.ServerTickEvent event) {
				if (event.phase == TickEvent.Phase.END) {
					this.ticks += 1;
					if (this.ticks >= this.waitTicks)
						run();
				}
			}

			private void run() {
				if (world instanceof World && !world.getWorld().isRemote) {
					world.getWorld().createExplosion(null,
							(int) ((entity.getRidingEntity()).world
									.rayTraceBlocks(new RayTraceContext((entity.getRidingEntity()).getEyePosition(1f),
											(entity.getRidingEntity()).getEyePosition(1f).add(
													(entity.getRidingEntity()).getLook(1f).x * 13, (entity.getRidingEntity()).getLook(1f).y * 13,
													(entity.getRidingEntity()).getLook(1f).z * 13),
											RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, (entity.getRidingEntity())))
									.getPos().getX()),
							(int) ((entity.getRidingEntity()).getPosY()),
							(int) ((entity.getRidingEntity()).world
									.rayTraceBlocks(new RayTraceContext((entity.getRidingEntity()).getEyePosition(1f),
											(entity.getRidingEntity()).getEyePosition(1f).add((entity.getRidingEntity()).getLook(1f).x * 13,
													(entity.getRidingEntity()).getLook(1f).y * 13, (entity.getRidingEntity()).getLook(1f).z * 13),
											RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, (entity.getRidingEntity())))
									.getPos().getZ()),
							(float) 6, Explosion.Mode.BREAK);
				}
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, (int) 138.4);
	}
}
