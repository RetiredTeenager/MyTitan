package net.aot.mytitan.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.gen.feature.template.Template;
import net.minecraft.world.gen.feature.template.PlacementSettings;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.RayTraceContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.Rotation;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Mirror;
import net.minecraft.entity.Entity;

import net.aot.mytitan.MyTitanModElements;
import net.aot.mytitan.MyTitanMod;

import java.util.Map;

@MyTitanModElements.ModElement.Tag
public class ProcedureWarhammerSpikesAttackProcedure extends MyTitanModElements.ModElement {
	public ProcedureWarhammerSpikesAttackProcedure(MyTitanModElements instance) {
		super(instance, 97);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MyTitanMod.LOGGER.warn("Failed to load dependency entity for procedure ProcedureWarhammerSpikesAttack!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				MyTitanMod.LOGGER.warn("Failed to load dependency world for procedure ProcedureWarhammerSpikesAttack!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		IWorld world = (IWorld) dependencies.get("world");
		double RaytraceY = 0;
		double RaytraceX = 0;
		double RaytraceZ = 0;
		double RandomNumber = 0;
		RaytraceY = (double) (entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
				entity.getEyePosition(1f).add(entity.getLook(1f).x * 20, entity.getLook(1f).y * 20, entity.getLook(1f).z * 20),
				RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getY());
		RaytraceX = (double) (entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
				entity.getEyePosition(1f).add(entity.getLook(1f).x * 20, entity.getLook(1f).y * 20, entity.getLook(1f).z * 20),
				RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getX());
		RaytraceZ = (double) (entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
				entity.getEyePosition(1f).add(entity.getLook(1f).x * 20, entity.getLook(1f).y * 20, entity.getLook(1f).z * 20),
				RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getZ());
		if (((world.isAirBlock(new BlockPos((int) (RaytraceX), (int) (RaytraceY), (int) (RaytraceZ)))) == (false))) {
			if (((world.isRemote()) == (false))) {
				RandomNumber = (double) Math.random();
				if (((RandomNumber) < 0.1)) {
					if (world instanceof ServerWorld) {
						Template template = ((ServerWorld) world).getStructureTemplateManager()
								.getTemplateDefaulted(new ResourceLocation("my_titan", "warhammerspikes"));
						if (template != null) {
							template.func_237144_a_((ServerWorld) world, new BlockPos((int) (RaytraceX), (int) (RaytraceY), (int) (RaytraceZ)),
									new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
									((World) world).rand);
						}
					}
				} else if (((RandomNumber) < 0.2)) {
					if (world instanceof ServerWorld) {
						Template template = ((ServerWorld) world).getStructureTemplateManager()
								.getTemplateDefaulted(new ResourceLocation("my_titan", "warhammerspikes1"));
						if (template != null) {
							template.func_237144_a_((ServerWorld) world, new BlockPos((int) (RaytraceX), (int) (RaytraceY), (int) (RaytraceZ)),
									new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
									((World) world).rand);
						}
					}
				} else if (((RandomNumber) < 0.3)) {
					if (world instanceof ServerWorld) {
						Template template = ((ServerWorld) world).getStructureTemplateManager()
								.getTemplateDefaulted(new ResourceLocation("my_titan", "warhammerspikes2"));
						if (template != null) {
							template.func_237144_a_((ServerWorld) world, new BlockPos((int) (RaytraceX), (int) (RaytraceY), (int) (RaytraceZ)),
									new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
									((World) world).rand);
						}
					}
				} else if (((RandomNumber) < 0.4)) {
					if (world instanceof ServerWorld) {
						Template template = ((ServerWorld) world).getStructureTemplateManager()
								.getTemplateDefaulted(new ResourceLocation("my_titan", "warhammerspikes3"));
						if (template != null) {
							template.func_237144_a_((ServerWorld) world, new BlockPos((int) (RaytraceX), (int) (RaytraceY), (int) (RaytraceZ)),
									new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
									((World) world).rand);
						}
					}
				} else if (((RandomNumber) < 0.5)) {
					if (world instanceof ServerWorld) {
						Template template = ((ServerWorld) world).getStructureTemplateManager()
								.getTemplateDefaulted(new ResourceLocation("my_titan", "warhammerspikes4"));
						if (template != null) {
							template.func_237144_a_((ServerWorld) world, new BlockPos((int) (RaytraceX), (int) (RaytraceY), (int) (RaytraceZ)),
									new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
									((World) world).rand);
						}
					}
				} else if (((RandomNumber) < 0.6)) {
					if (world instanceof ServerWorld) {
						Template template = ((ServerWorld) world).getStructureTemplateManager()
								.getTemplateDefaulted(new ResourceLocation("my_titan", "warhammerspikes5"));
						if (template != null) {
							template.func_237144_a_((ServerWorld) world, new BlockPos((int) (RaytraceX), (int) (RaytraceY), (int) (RaytraceZ)),
									new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
									((World) world).rand);
						}
					}
				} else if (((RandomNumber) < 0.7)) {
					if (world instanceof ServerWorld) {
						Template template = ((ServerWorld) world).getStructureTemplateManager()
								.getTemplateDefaulted(new ResourceLocation("my_titan", "warhammerspikes6"));
						if (template != null) {
							template.func_237144_a_((ServerWorld) world, new BlockPos((int) (RaytraceX), (int) (RaytraceY), (int) (RaytraceZ)),
									new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
									((World) world).rand);
						}
					}
				} else if (((RandomNumber) < 0.8)) {
					if (world instanceof ServerWorld) {
						Template template = ((ServerWorld) world).getStructureTemplateManager()
								.getTemplateDefaulted(new ResourceLocation("my_titan", "warhammerspikes7"));
						if (template != null) {
							template.func_237144_a_((ServerWorld) world, new BlockPos((int) (RaytraceX), (int) (RaytraceY), (int) (RaytraceZ)),
									new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
									((World) world).rand);
						}
					}
				} else if (((RandomNumber) < 0.9)) {
					if (world instanceof ServerWorld) {
						Template template = ((ServerWorld) world).getStructureTemplateManager()
								.getTemplateDefaulted(new ResourceLocation("my_titan", "warhammerspikes8"));
						if (template != null) {
							template.func_237144_a_((ServerWorld) world, new BlockPos((int) (RaytraceX), (int) (RaytraceY), (int) (RaytraceZ)),
									new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
									((World) world).rand);
						}
					}
				} else if (((RandomNumber) <= 1)) {
					if (world instanceof ServerWorld) {
						Template template = ((ServerWorld) world).getStructureTemplateManager()
								.getTemplateDefaulted(new ResourceLocation("my_titan", "warhammerspikes9"));
						if (template != null) {
							template.func_237144_a_((ServerWorld) world, new BlockPos((int) (RaytraceX), (int) (RaytraceY), (int) (RaytraceZ)),
									new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
									((World) world).rand);
						}
					}
				}
				if (world instanceof World && !world.isRemote()) {
					((World) world).playSound(null, new BlockPos((int) (RaytraceX), (int) (RaytraceY), (int) (RaytraceZ)),
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("my_titan:rocks")),
							SoundCategory.NEUTRAL, (float) 3, (float) 1);
				} else {
					((World) world).playSound((RaytraceX), (RaytraceY), (RaytraceZ),
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("my_titan:rocks")),
							SoundCategory.NEUTRAL, (float) 3, (float) 1, false);
				}
			}
		}
	}
}
