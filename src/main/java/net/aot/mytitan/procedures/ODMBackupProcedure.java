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

import net.aot.mytitan.MyTitanModElements;
import net.aot.mytitan.MyTitanMod;

import java.util.Map;

@MyTitanModElements.ModElement.Tag
public class ODMBackupProcedure extends MyTitanModElements.ModElement {
	public ODMBackupProcedure(MyTitanModElements instance) {
		super(instance, 220);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MyTitanMod.LOGGER.warn("Failed to load dependency entity for procedure ODMBackup!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				MyTitanMod.LOGGER.warn("Failed to load dependency world for procedure ODMBackup!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		IWorld world = (IWorld) dependencies.get("world");
		double x = 0;
		double y = 0;
		double z = 0;
		if ((((entity instanceof LivingEntity)
				? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.fromSlotTypeAndIndex(EquipmentSlotType.Group.ARMOR, (int) 3))
				: ItemStack.EMPTY).getItem() == new ItemStack(ArmorODMItem.legs, (int) (1)).getItem())) {
			x = (double) (entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
					entity.getEyePosition(1f).add(entity.getLook(1f).x * 50, entity.getLook(1f).y * 50, entity.getLook(1f).z * 50),
					RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getX());
			y = (double) (entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
					entity.getEyePosition(1f).add(entity.getLook(1f).x * 50, entity.getLook(1f).y * 50, entity.getLook(1f).z * 50),
					RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getY());
			z = (double) (entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
					entity.getEyePosition(1f).add(entity.getLook(1f).x * 50, entity.getLook(1f).y * 50, entity.getLook(1f).z * 50),
					RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getZ());
			if (((world.isAirBlock(new BlockPos((int) (x), (int) (y), (int) (z)))) == (false))) {
				entity.setNoGravity((true));
				if (((((x) - (entity.getPosX())) >= 41) && (((z) - (entity.getPosZ())) >= 41))) {
					entity.setMotion((((x) - (entity.getPosX())) - 35), (((y) - (entity.getPosY())) - (-35)), (((z) - (entity.getPosZ())) - 35));
				} else if (((((x) - (entity.getPosX())) <= 31) && (((z) - (entity.getPosZ())) <= 31))) {
					entity.setMotion((((x) - (entity.getPosX())) / 8), (((y) - (entity.getPosY())) / 8), (((z) - (entity.getPosZ())) / 8));
				} else if (((((x) - (entity.getPosX())) <= 21) && (((z) - (entity.getPosZ())) <= 21))) {
					entity.setMotion((((x) - (entity.getPosX())) / 6), (((y) - (entity.getPosY())) / 6), (((z) - (entity.getPosZ())) / 6));
				} else if (((((x) - (entity.getPosX())) <= 11) && (((z) - (entity.getPosZ())) <= 11))) {
					entity.setMotion((((x) - (entity.getPosX())) / 4), (((y) - (entity.getPosY())) / 4), (((z) - (entity.getPosZ())) / 4));
				} else {
					entity.setMotion(((x) - (entity.getPosX())), ((y) - (entity.getPosY())), ((z) - (entity.getPosZ())));
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
						entity.setNoGravity((false));
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, (int) 100);
			}
		}
	}
}
