package net.aot.mytitan.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.RayTraceContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.aot.mytitan.item.ArmorODMItem;
import net.aot.mytitan.MyTitanModElements;
import net.aot.mytitan.MyTitanMod;

import java.util.Map;

@MyTitanModElements.ModElement.Tag
public class ODMGearProcedure extends MyTitanModElements.ModElement {
	public ODMGearProcedure(MyTitanModElements instance) {
		super(instance, 207);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MyTitanMod.LOGGER.warn("Failed to load dependency entity for procedure ODMGear!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				MyTitanMod.LOGGER.warn("Failed to load dependency world for procedure ODMGear!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		IWorld world = (IWorld) dependencies.get("world");
		double x = 0;
		double y = 0;
		double z = 0;
		if ((((entity instanceof LivingEntity)
				? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.fromSlotTypeAndIndex(EquipmentSlotType.Group.ARMOR, (int) 1))
				: ItemStack.EMPTY).getItem() == new ItemStack(ArmorODMItem.legs, (int) (1)).getItem())) {
			x = (double) (entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
					entity.getEyePosition(1f).add(entity.getLook(1f).x * 75, entity.getLook(1f).y * 75, entity.getLook(1f).z * 75),
					RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity)).getPos().getX());
			y = (double) (entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
					entity.getEyePosition(1f).add(entity.getLook(1f).x * 75, entity.getLook(1f).y * 75, entity.getLook(1f).z * 75),
					RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity)).getPos().getY());
			z = (double) (entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
					entity.getEyePosition(1f).add(entity.getLook(1f).x * 75, entity.getLook(1f).y * 75, entity.getLook(1f).z * 75),
					RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity)).getPos().getZ());
			if (((world.isAirBlock(new BlockPos((int) (x), (int) (y), (int) (z)))) == (false))) {
				if ((((x) - (entity.getPosX())) <= 75)) {
					if (entity instanceof LivingEntity) {
						entity.setNoGravity((true));
					}
					if (((((x) - (entity.getPosX())) >= 71) && (((z) - (entity.getPosZ())) >= 71))) {
						entity.setMotion((((x) - (entity.getPosX())) / 20), (((y) - (entity.getPosY())) / 16), (((z) - (entity.getPosZ())) / 16));
					} else if (((((x) - (entity.getPosX())) >= 61) && (((z) - (entity.getPosZ())) >= 61))) {
						entity.setMotion((((x) - (entity.getPosX())) / 16), (((y) - (entity.getPosY())) / 14), (((z) - (entity.getPosZ())) / 14));
					} else if (((((x) - (entity.getPosX())) >= 51) && (((z) - (entity.getPosZ())) >= 51))) {
						entity.setMotion((((x) - (entity.getPosX())) / 14), (((y) - (entity.getPosY())) / 12), (((z) - (entity.getPosZ())) / 12));
					} else if (((((x) - (entity.getPosX())) >= 41) && (((z) - (entity.getPosZ())) >= 41))) {
						entity.setMotion((((x) - (entity.getPosX())) / 12), (((y) - (entity.getPosY())) / 10), (((z) - (entity.getPosZ())) / 10));
					} else if (((((x) - (entity.getPosX())) <= 31) && (((z) - (entity.getPosZ())) <= 31))) {
						entity.setMotion((((x) - (entity.getPosX())) / 10), (((y) - (entity.getPosY())) / 6), (((z) - (entity.getPosZ())) / 6));
					} else if (((((x) - (entity.getPosX())) <= 21) && (((z) - (entity.getPosZ())) <= 21))) {
						entity.setMotion((((x) - (entity.getPosX())) / 6), (((y) - (entity.getPosY())) / 3), (((z) - (entity.getPosZ())) / 3));
					} else if (((((x) - (entity.getPosX())) <= 11) && (((z) - (entity.getPosZ())) <= 11))) {
						entity.setMotion(((x) - (entity.getPosX())), ((y) - (entity.getPosY())), ((z) - (entity.getPosZ())));
					}
				} else if ((((y) - (entity.getPosY())) <= 75)) {
					if (entity instanceof LivingEntity) {
						entity.setNoGravity((true));
					}
					if (((((x) - (entity.getPosX())) >= 71) && (((z) - (entity.getPosZ())) >= 71))) {
						entity.setMotion((((x) - (entity.getPosX())) / 16), (((y) - (entity.getPosY())) / 16), (((z) - (entity.getPosZ())) / 16));
					} else if (((((x) - (entity.getPosX())) >= 61) && (((z) - (entity.getPosZ())) >= 61))) {
						entity.setMotion((((x) - (entity.getPosX())) / 14), (((y) - (entity.getPosY())) / 14), (((z) - (entity.getPosZ())) / 14));
					} else if (((((x) - (entity.getPosX())) >= 51) && (((z) - (entity.getPosZ())) >= 51))) {
						entity.setMotion((((x) - (entity.getPosX())) / 12), (((y) - (entity.getPosY())) / 12), (((z) - (entity.getPosZ())) / 12));
					} else if (((((x) - (entity.getPosX())) >= 41) && (((z) - (entity.getPosZ())) >= 41))) {
						entity.setMotion((((x) - (entity.getPosX())) / 10), (((y) - (entity.getPosY())) / 10), (((z) - (entity.getPosZ())) / 10));
					} else if (((((x) - (entity.getPosX())) <= 31) && (((z) - (entity.getPosZ())) <= 31))) {
						entity.setMotion((((x) - (entity.getPosX())) / 6), (((y) - (entity.getPosY())) / 6), (((z) - (entity.getPosZ())) / 6));
					} else if (((((x) - (entity.getPosX())) <= 21) && (((z) - (entity.getPosZ())) <= 21))) {
						entity.setMotion((((x) - (entity.getPosX())) / 3), (((y) - (entity.getPosY())) / 3), (((z) - (entity.getPosZ())) / 3));
					} else if (((((x) - (entity.getPosX())) <= 11) && (((z) - (entity.getPosZ())) <= 11))) {
						entity.setMotion(((x) - (entity.getPosX())), ((y) - (entity.getPosY())), ((z) - (entity.getPosZ())));
					}
				} else if ((((z) - (entity.getPosZ())) <= 75)) {
					if (entity instanceof LivingEntity) {
						entity.setNoGravity((true));
					}
					if (((((x) - (entity.getPosX())) >= 71) && (((z) - (entity.getPosZ())) >= 71))) {
						entity.setMotion((((x) - (entity.getPosX())) / 16), (((y) - (entity.getPosY())) / 16), (((z) - (entity.getPosZ())) / 16));
					} else if (((((x) - (entity.getPosX())) >= 61) && (((z) - (entity.getPosZ())) >= 61))) {
						entity.setMotion((((x) - (entity.getPosX())) / 14), (((y) - (entity.getPosY())) / 14), (((z) - (entity.getPosZ())) / 14));
					} else if (((((x) - (entity.getPosX())) >= 51) && (((z) - (entity.getPosZ())) >= 51))) {
						entity.setMotion((((x) - (entity.getPosX())) / 12), (((y) - (entity.getPosY())) / 12), (((z) - (entity.getPosZ())) / 12));
					} else if (((((x) - (entity.getPosX())) >= 41) && (((z) - (entity.getPosZ())) >= 41))) {
						entity.setMotion((((x) - (entity.getPosX())) / 10), (((y) - (entity.getPosY())) / 10), (((z) - (entity.getPosZ())) / 10));
					} else if (((((x) - (entity.getPosX())) <= 31) && (((z) - (entity.getPosZ())) <= 31))) {
						entity.setMotion((((x) - (entity.getPosX())) / 6), (((y) - (entity.getPosY())) / 6), (((z) - (entity.getPosZ())) / 6));
					} else if (((((x) - (entity.getPosX())) <= 21) && (((z) - (entity.getPosZ())) <= 21))) {
						entity.setMotion((((x) - (entity.getPosX())) / 3), (((y) - (entity.getPosY())) / 3), (((z) - (entity.getPosZ())) / 3));
					} else if (((((x) - (entity.getPosX())) <= 11) && (((z) - (entity.getPosZ())) <= 11))) {
						entity.setMotion(((x) - (entity.getPosX())), ((y) - (entity.getPosY())), ((z) - (entity.getPosZ())));
					}
				}
				if (((entity.getMotion().getX()) > 5)) {
					entity.setMotion(5, (entity.getMotion().getY()), (entity.getMotion().getZ()));
				}
				if (((entity.getMotion().getY()) > 5)) {
					entity.setMotion((entity.getMotion().getX()), 5, (entity.getMotion().getZ()));
				}
				if (((entity.getMotion().getZ()) > 5)) {
					entity.setMotion((entity.getMotion().getX()), (entity.getMotion().getY()), 5);
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
						if (entity instanceof LivingEntity) {
							entity.setNoGravity((false));
						}
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, (int) 100);
			}
		}
	}
}
