
package net.aot.mytitan.entity;

import software.bernie.geckolib.manager.EntityAnimationManager;
import software.bernie.geckolib.event.AnimationTestEvent;
import software.bernie.geckolib.entity.IAnimatedEntity;
import software.bernie.geckolib.animation.render.AnimatedModelRenderer;
import software.bernie.geckolib.animation.model.AnimatedEntityModel;
import software.bernie.geckolib.animation.controller.EntityAnimationController;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.network.NetworkHooks;
import net.minecraftforge.fml.network.FMLPlayMessages;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.gen.Heightmap;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.DamageSource;
import net.minecraft.network.IPacket;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.ai.goal.RandomWalkingGoal;
import net.minecraft.entity.ai.goal.NearestAttackableTargetGoal;
import net.minecraft.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.ai.goal.HurtByTargetGoal;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EntitySpawnPlacementRegistry;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.Entity;
import net.minecraft.entity.CreatureAttribute;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.block.BlockState;

import net.aot.mytitan.procedures.MindlessOnlyMoveInDaytimeProcedure;
import net.aot.mytitan.MyTitanModElements;

import java.util.Map;
import java.util.HashMap;

@MyTitanModElements.ModElement.Tag
public class GluttonousTitanEntity extends MyTitanModElements.ModElement {
	public static EntityType entity = null;
	public GluttonousTitanEntity(MyTitanModElements instance) {
		super(instance, 217);
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@Override
	public void initElements() {
		entity = (EntityType.Builder.<CustomEntity>create(CustomEntity::new, EntityClassification.MONSTER).setShouldReceiveVelocityUpdates(true)
				.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CustomEntity::new).size(1.5f, 4.5f)).build("gluttonous_titan")
						.setRegistryName("gluttonous_titan");
		elements.entities.add(() -> entity);
		elements.items.add(
				() -> new SpawnEggItem(entity, -1, -1, new Item.Properties().group(ItemGroup.MISC)).setRegistryName("gluttonous_titan_spawn_egg"));
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		for (Biome biome : ForgeRegistries.BIOMES.getValues()) {
			biome.getSpawns(EntityClassification.MONSTER).add(new Biome.SpawnListEntry(entity, 45, 1, 2));
		}
		EntitySpawnPlacementRegistry.register(entity, EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES,
				MonsterEntity::canMonsterSpawn);
	}

	@SubscribeEvent
	@OnlyIn(Dist.CLIENT)
	public void registerModels(ModelRegistryEvent event) {
		RenderingRegistry.registerEntityRenderingHandler(entity, renderManager -> {
			return new MobRenderer(renderManager, new ModelGluttonous_titan(), 1f) {
				@Override
				public ResourceLocation getEntityTexture(Entity entity) {
					return new ResourceLocation("my_titan:textures/gluttonous_titan.png");
				}
			};
		});
	}
	public static class CustomEntity extends MonsterEntity implements IAnimatedEntity {
		EntityAnimationManager manager = new EntityAnimationManager();
		EntityAnimationController controller = new EntityAnimationController(this, "controller", 1, this::animationPredicate);
		private <E extends Entity> boolean animationPredicate(AnimationTestEvent<E> event) {
			controller.transitionLengthTicks = 1;
			controller.markNeedsReload();
			return true;
		}

		@Override
		public EntityAnimationManager getAnimationManager() {
			return manager;
		}

		public CustomEntity(FMLPlayMessages.SpawnEntity packet, World world) {
			this(entity, world);
		}

		public CustomEntity(EntityType<CustomEntity> type, World world) {
			super(type, world);
			experienceValue = 0;
			setNoAI(false);
			manager.addAnimationController(controller);
		}

		@Override
		public IPacket<?> createSpawnPacket() {
			return NetworkHooks.getEntitySpawningPacket(this);
		}

		@Override
		protected void registerGoals() {
			super.registerGoals();
			this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.2, false));
			this.goalSelector.addGoal(2, new RandomWalkingGoal(this, 1));
			this.targetSelector.addGoal(3, new HurtByTargetGoal(this));
			this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, EntityControllableAttackTitanEntity.CustomEntity.class, true, true));
			this.goalSelector.addGoal(5, new LookRandomlyGoal(this));
			this.goalSelector.addGoal(6, new SwimGoal(this));
		}

		@Override
		public CreatureAttribute getCreatureAttribute() {
			return CreatureAttribute.UNDEFINED;
		}

		@Override
		public void playStepSound(BlockPos pos, BlockState blockIn) {
			this.playSound((net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("my_titan:titanfootsteps")),
					0.15f, 1);
		}

		@Override
		public net.minecraft.util.SoundEvent getHurtSound(DamageSource ds) {
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
		}

		@Override
		public net.minecraft.util.SoundEvent getDeathSound() {
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
		}

		@Override
		public void baseTick() {
			super.baseTick();
			double x = this.getPosX();
			double y = this.getPosY();
			double z = this.getPosZ();
			Entity entity = this;
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				MindlessOnlyMoveInDaytimeProcedure.executeProcedure($_dependencies);
			}
		}

		@Override
		protected void registerAttributes() {
			super.registerAttributes();
			if (this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED) != null)
				this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.3);
			if (this.getAttribute(SharedMonsterAttributes.MAX_HEALTH) != null)
				this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(75);
			if (this.getAttribute(SharedMonsterAttributes.ARMOR) != null)
				this.getAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(0);
			if (this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE) == null)
				this.getAttributes().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
			this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(8);
		}
	}

	// Made with Blockbench 3.6.6
	public static class ModelGluttonous_titan extends AnimatedEntityModel {
		private final AnimatedModelRenderer all;
		private final AnimatedModelRenderer torso;
		private final AnimatedModelRenderer movy;
		private final AnimatedModelRenderer yes_r9;
		private final AnimatedModelRenderer yes_r10;
		private final AnimatedModelRenderer yes_r11;
		private final AnimatedModelRenderer yes_r12;
		private final AnimatedModelRenderer movy2;
		private final AnimatedModelRenderer yes_r13;
		private final AnimatedModelRenderer yes_r6;
		private final AnimatedModelRenderer yes_r2;
		private final AnimatedModelRenderer yes_r5;
		private final AnimatedModelRenderer yes_r7;
		private final AnimatedModelRenderer yes_r8;
		private final AnimatedModelRenderer bone;
		private final AnimatedModelRenderer arms;
		private final AnimatedModelRenderer larm;
		private final AnimatedModelRenderer lshoulderarm;
		private final AnimatedModelRenderer cube_r13;
		private final AnimatedModelRenderer cube_r14;
		private final AnimatedModelRenderer lforearm;
		private final AnimatedModelRenderer lforearm_r5;
		private final AnimatedModelRenderer rarm;
		private final AnimatedModelRenderer lshoulderarm2;
		private final AnimatedModelRenderer cube_r2;
		private final AnimatedModelRenderer cube_r3;
		private final AnimatedModelRenderer lforearm2;
		private final AnimatedModelRenderer lforearm_r2;
		private final AnimatedModelRenderer cara;
		private final AnimatedModelRenderer movy3;
		private final AnimatedModelRenderer yes_r3;
		private final AnimatedModelRenderer yes_r4;
		private final AnimatedModelRenderer yes_r14;
		private final AnimatedModelRenderer yes_r15;
		private final AnimatedModelRenderer movy4;
		private final AnimatedModelRenderer yes_r16;
		private final AnimatedModelRenderer yes_r17;
		private final AnimatedModelRenderer yes_r18;
		private final AnimatedModelRenderer yes_r19;
		private final AnimatedModelRenderer yes_r20;
		private final AnimatedModelRenderer yes_r21;
		private final AnimatedModelRenderer bone2;
		private final AnimatedModelRenderer bone5;
		private final AnimatedModelRenderer bone6;
		private final AnimatedModelRenderer reye;
		private final AnimatedModelRenderer leye;
		private final AnimatedModelRenderer leftleg;
		private final AnimatedModelRenderer upperleftleg;
		private final AnimatedModelRenderer leftlowerlegs;
		private final AnimatedModelRenderer lfoot;
		private final AnimatedModelRenderer bone4;
		private final AnimatedModelRenderer lfoot_r9;
		private final AnimatedModelRenderer lfoot_r10;
		private final AnimatedModelRenderer lfoot_r11;
		private final AnimatedModelRenderer lfoot_r12;
		private final AnimatedModelRenderer rightleg;
		private final AnimatedModelRenderer upperrightleg;
		private final AnimatedModelRenderer rihgtlowerlegs;
		private final AnimatedModelRenderer rfoot;
		private final AnimatedModelRenderer bone3;
		private final AnimatedModelRenderer lfoot_r5;
		private final AnimatedModelRenderer lfoot_r6;
		private final AnimatedModelRenderer lfoot_r7;
		private final AnimatedModelRenderer lfoot_r8;
		public ModelGluttonous_titan() {
			textureWidth = 256;
			textureHeight = 256;
			all = new AnimatedModelRenderer(this);
			all.setRotationPoint(0.0F, 22.0F, 0.0F);
			setRotationAngle(all, 0.0F, 0.0F, 0.0F);
			all.setModelRendererName("all");
			this.registerModelRenderer(all);
			torso = new AnimatedModelRenderer(this);
			torso.setRotationPoint(0.0F, -18.0F, 0.0F);
			all.addChild(torso);
			torso.setModelRendererName("torso");
			this.registerModelRenderer(torso);
			movy = new AnimatedModelRenderer(this);
			movy.setRotationPoint(3.0F, -8.5F, 7.25F);
			torso.addChild(movy);
			setRotationAngle(movy, 0.0F, 3.1416F, 0.0F);
			movy.setModelRendererName("movy");
			this.registerModelRenderer(movy);
			yes_r9 = new AnimatedModelRenderer(this);
			yes_r9.setRotationPoint(4.75F, -0.25F, 0.0F);
			movy.addChild(yes_r9);
			setRotationAngle(yes_r9, 0.0F, -0.1309F, 0.1745F);
			yes_r9.setTextureOffset(118, 31).addBox(-0.3671F, -9.0154F, 0.6409F, 5.0F, 17.0F, 5.0F, 0.0F, false);
			yes_r9.setModelRendererName("yes_r9");
			this.registerModelRenderer(yes_r9);
			yes_r10 = new AnimatedModelRenderer(this);
			yes_r10.setRotationPoint(4.75F, -0.25F, 0.0F);
			movy.addChild(yes_r10);
			setRotationAngle(yes_r10, 0.0F, 0.1309F, -0.1745F);
			yes_r10.setTextureOffset(123, 97).addBox(-8.1148F, -9.6493F, 0.148F, 5.0F, 17.0F, 5.0F, 0.0F, false);
			yes_r10.setModelRendererName("yes_r10");
			this.registerModelRenderer(yes_r10);
			yes_r11 = new AnimatedModelRenderer(this);
			yes_r11.setRotationPoint(10.75F, 0.0F, 1.25F);
			movy.addChild(yes_r11);
			setRotationAngle(yes_r11, 0.0F, -0.2618F, 0.1745F);
			yes_r11.setTextureOffset(36, 114).addBox(-1.396F, -8.2199F, 0.3639F, 5.0F, 17.0F, 5.0F, 0.0F, false);
			yes_r11.setModelRendererName("yes_r11");
			this.registerModelRenderer(yes_r11);
			yes_r12 = new AnimatedModelRenderer(this);
			yes_r12.setRotationPoint(10.75F, 0.0F, 1.25F);
			movy.addChild(yes_r12);
			setRotationAngle(yes_r12, 0.0F, 0.2618F, -0.1745F);
			yes_r12.setTextureOffset(123, 123).addBox(-18.4068F, -10.9372F, -3.638F, 5.0F, 17.0F, 5.0F, 0.0F, false);
			yes_r12.setModelRendererName("yes_r12");
			this.registerModelRenderer(yes_r12);
			movy2 = new AnimatedModelRenderer(this);
			movy2.setRotationPoint(-3.0F, -8.5F, -4.75F);
			torso.addChild(movy2);
			setRotationAngle(movy2, 0.0F, 3.1416F, 0.0F);
			movy2.setModelRendererName("movy2");
			this.registerModelRenderer(movy2);
			yes_r13 = new AnimatedModelRenderer(this);
			yes_r13.setRotationPoint(4.75F, -0.25F, -6.25F);
			movy2.addChild(yes_r13);
			setRotationAngle(yes_r13, 0.0F, 0.0F, -0.1745F);
			yes_r13.setTextureOffset(56, 124).addBox(-18.4894F, -10.691F, -3.25F, 2.0F, 17.0F, 6.0F, 0.0F, false);
			yes_r13.setModelRendererName("yes_r13");
			this.registerModelRenderer(yes_r13);
			yes_r6 = new AnimatedModelRenderer(this);
			yes_r6.setRotationPoint(4.75F, -0.25F, -6.25F);
			movy2.addChild(yes_r6);
			setRotationAngle(yes_r6, 0.0F, 0.0F, 0.1745F);
			yes_r6.setTextureOffset(92, 127).addBox(0.4305F, -7.9737F, -3.2158F, 2.0F, 17.0F, 6.0F, 0.0F, false);
			yes_r6.setModelRendererName("yes_r6");
			this.registerModelRenderer(yes_r6);
			yes_r2 = new AnimatedModelRenderer(this);
			yes_r2.setRotationPoint(0.8975F, -1.8993F, -1.8958F);
			movy2.addChild(yes_r2);
			setRotationAngle(yes_r2, 0.0F, 0.4363F, 0.1745F);
			yes_r2.setTextureOffset(0, 79).addBox(-4.1717F, -7.3294F, -5.2675F, 6.0F, 17.0F, 9.0F, 0.0F, false);
			yes_r2.setModelRendererName("yes_r2");
			this.registerModelRenderer(yes_r2);
			yes_r5 = new AnimatedModelRenderer(this);
			yes_r5.setRotationPoint(7.2034F, 0.3174F, -3.0291F);
			movy2.addChild(yes_r5);
			setRotationAngle(yes_r5, 0.0F, 0.7418F, 0.1745F);
			yes_r5.setTextureOffset(30, 88).addBox(-4.5764F, -8.1065F, -8.3748F, 4.0F, 17.0F, 9.0F, 0.0F, false);
			yes_r5.setModelRendererName("yes_r5");
			this.registerModelRenderer(yes_r5);
			yes_r7 = new AnimatedModelRenderer(this);
			yes_r7.setRotationPoint(5.1025F, -1.8993F, -1.8958F);
			movy2.addChild(yes_r7);
			setRotationAngle(yes_r7, 0.0F, -0.4363F, -0.1745F);
			yes_r7.setTextureOffset(68, 34).addBox(-13.0674F, -9.4128F, -0.2731F, 6.0F, 17.0F, 9.0F, 0.0F, false);
			yes_r7.setModelRendererName("yes_r7");
			this.registerModelRenderer(yes_r7);
			yes_r8 = new AnimatedModelRenderer(this);
			yes_r8.setRotationPoint(-1.2034F, 0.3174F, -3.0291F);
			movy2.addChild(yes_r8);
			setRotationAngle(yes_r8, 0.0F, -0.7418F, -0.1745F);
			yes_r8.setTextureOffset(77, 85).addBox(-9.0819F, -10.2162F, -0.3676F, 4.0F, 17.0F, 9.0F, 0.0F, false);
			yes_r8.setModelRendererName("yes_r8");
			this.registerModelRenderer(yes_r8);
			bone = new AnimatedModelRenderer(this);
			bone.setRotationPoint(0.0F, -9.0F, -0.5F);
			torso.addChild(bone);
			bone.setTextureOffset(0, 0).addBox(-3.0F, -9.0F, -7.5F, 6.0F, 18.0F, 15.0F, 0.0F, false);
			bone.setModelRendererName("bone");
			this.registerModelRenderer(bone);
			arms = new AnimatedModelRenderer(this);
			arms.setRotationPoint(0.0F, 35.0F, 0.0F);
			torso.addChild(arms);
			arms.setModelRendererName("arms");
			this.registerModelRenderer(arms);
			larm = new AnimatedModelRenderer(this);
			larm.setRotationPoint(9.75F, -47.1F, 0.0F);
			arms.addChild(larm);
			setRotationAngle(larm, 0.0F, 0.0F, -0.2182F);
			larm.setModelRendererName("larm");
			this.registerModelRenderer(larm);
			lshoulderarm = new AnimatedModelRenderer(this);
			lshoulderarm.setRotationPoint(0.15F, 0.0F, 0.0F);
			larm.addChild(lshoulderarm);
			setRotationAngle(lshoulderarm, 0.0F, 0.0F, -0.0873F);
			lshoulderarm.setTextureOffset(42, 13).addBox(1.0018F, 2.5899F, -0.981F, 1.0F, 10.0F, 5.0F, 0.0F, false);
			lshoulderarm.setTextureOffset(47, 88).addBox(2.6235F, 3.5649F, -1.9905F, 4.0F, 7.0F, 1.0F, 0.0F, false);
			lshoulderarm.setTextureOffset(34, 144).addBox(1.2985F, 2.5899F, 2.9595F, 6.0F, 10.0F, 1.0F, 0.0F, false);
			lshoulderarm.setTextureOffset(138, 121).addBox(1.8518F, 11.7711F, -0.981F, 6.0F, 2.0F, 5.0F, 0.0F, false);
			lshoulderarm.setTextureOffset(0, 135).addBox(1.8518F, 1.7461F, -1.431F, 6.0F, 10.0F, 5.0F, 0.0F, false);
			lshoulderarm.setModelRendererName("lshoulderarm");
			this.registerModelRenderer(lshoulderarm);
			cube_r13 = new AnimatedModelRenderer(this);
			cube_r13.setRotationPoint(-4.2119F, 0.9646F, 2.25F);
			lshoulderarm.addChild(cube_r13);
			setRotationAngle(cube_r13, 0.0F, 0.0F, 0.2182F);
			cube_r13.setTextureOffset(113, 20).addBox(-0.6636F, -7.3312F, -3.981F, 10.0F, 5.0F, 6.0F, 0.0F, false);
			cube_r13.setModelRendererName("cube_r13");
			this.registerModelRenderer(cube_r13);
			cube_r14 = new AnimatedModelRenderer(this);
			cube_r14.setRotationPoint(3.9436F, 8.0024F, 2.7F);
			lshoulderarm.addChild(cube_r14);
			setRotationAngle(cube_r14, 0.0F, 0.0F, 1.309F);
			cube_r14.setTextureOffset(127, 80).addBox(-11.1001F, -5.6105F, -4.431F, 7.0F, 7.0F, 6.0F, 0.0F, false);
			cube_r14.setModelRendererName("cube_r14");
			this.registerModelRenderer(cube_r14);
			lforearm = new AnimatedModelRenderer(this);
			lforearm.setRotationPoint(6.75F, 20.1F, 0.0F);
			larm.addChild(lforearm);
			lforearm.setTextureOffset(140, 71).addBox(-1.8441F, -7.06F, -0.981F, 4.0F, 4.0F, 5.0F, 0.0F, false);
			lforearm.setModelRendererName("lforearm");
			this.registerModelRenderer(lforearm);
			lforearm_r5 = new AnimatedModelRenderer(this);
			lforearm_r5.setRotationPoint(-0.6344F, 11.4397F, 1.569F);
			lforearm.addChild(lforearm_r5);
			setRotationAngle(lforearm_r5, 0.0F, 0.0F, -0.4363F);
			lforearm_r5.setTextureOffset(120, 145).addBox(5.0311F, -17.6526F, -2.55F, 2.0F, 4.0F, 5.0F, 0.0F, false);
			lforearm_r5.setModelRendererName("lforearm_r5");
			this.registerModelRenderer(lforearm_r5);
			rarm = new AnimatedModelRenderer(this);
			rarm.setRotationPoint(-9.75F, -47.1F, 0.0F);
			arms.addChild(rarm);
			setRotationAngle(rarm, 0.0F, 0.0F, 0.2182F);
			rarm.setModelRendererName("rarm");
			this.registerModelRenderer(rarm);
			lshoulderarm2 = new AnimatedModelRenderer(this);
			lshoulderarm2.setRotationPoint(-0.15F, 0.0F, 0.0F);
			rarm.addChild(lshoulderarm2);
			setRotationAngle(lshoulderarm2, 0.0F, 0.0F, 0.0873F);
			lshoulderarm2.setTextureOffset(0, 0).addBox(-2.0018F, 2.5899F, -0.981F, 1.0F, 10.0F, 5.0F, 0.0F, false);
			lshoulderarm2.setTextureOffset(80, 26).addBox(-6.6235F, 3.5649F, -1.9905F, 4.0F, 7.0F, 1.0F, 0.0F, false);
			lshoulderarm2.setTextureOffset(143, 128).addBox(-7.2985F, 2.5899F, 2.9595F, 6.0F, 10.0F, 1.0F, 0.0F, false);
			lshoulderarm2.setTextureOffset(54, 34).addBox(-7.8518F, 11.7711F, -0.981F, 6.0F, 2.0F, 5.0F, 0.0F, false);
			lshoulderarm2.setTextureOffset(132, 0).addBox(-7.8518F, 1.7461F, -1.431F, 6.0F, 10.0F, 5.0F, 0.0F, false);
			lshoulderarm2.setModelRendererName("lshoulderarm2");
			this.registerModelRenderer(lshoulderarm2);
			cube_r2 = new AnimatedModelRenderer(this);
			cube_r2.setRotationPoint(4.2119F, 0.9646F, 2.25F);
			lshoulderarm2.addChild(cube_r2);
			setRotationAngle(cube_r2, 0.0F, 0.0F, -0.2182F);
			cube_r2.setTextureOffset(106, 56).addBox(-9.3364F, -7.3312F, -3.981F, 10.0F, 5.0F, 6.0F, 0.0F, false);
			cube_r2.setModelRendererName("cube_r2");
			this.registerModelRenderer(cube_r2);
			cube_r3 = new AnimatedModelRenderer(this);
			cube_r3.setRotationPoint(-3.9436F, 8.0024F, 2.7F);
			lshoulderarm2.addChild(cube_r3);
			setRotationAngle(cube_r3, 0.0F, 0.0F, -1.309F);
			cube_r3.setTextureOffset(114, 67).addBox(4.1001F, -5.6105F, -4.431F, 7.0F, 7.0F, 6.0F, 0.0F, false);
			cube_r3.setModelRendererName("cube_r3");
			this.registerModelRenderer(cube_r3);
			lforearm2 = new AnimatedModelRenderer(this);
			lforearm2.setRotationPoint(-6.75F, 20.1F, 0.0F);
			rarm.addChild(lforearm2);
			lforearm2.setTextureOffset(139, 15).addBox(-2.1559F, -7.06F, -0.981F, 4.0F, 4.0F, 5.0F, 0.0F, false);
			lforearm2.setModelRendererName("lforearm2");
			this.registerModelRenderer(lforearm2);
			lforearm_r2 = new AnimatedModelRenderer(this);
			lforearm_r2.setRotationPoint(0.6344F, 11.4397F, 1.569F);
			lforearm2.addChild(lforearm_r2);
			setRotationAngle(lforearm_r2, 0.0F, 0.0F, 0.4363F);
			lforearm_r2.setTextureOffset(51, 54).addBox(-7.0311F, -17.6526F, -2.55F, 2.0F, 4.0F, 5.0F, 0.0F, false);
			lforearm_r2.setModelRendererName("lforearm_r2");
			this.registerModelRenderer(lforearm_r2);
			cara = new AnimatedModelRenderer(this);
			cara.setRotationPoint(0.0F, -191.5714F, -0.0714F);
			torso.addChild(cara);
			setRotationAngle(cara, 0.0F, 0.0F, -3.1416F);
			cara.setTextureOffset(27, 0).addBox(-3.0F, -174.4286F, -3.9286F, 6.0F, 6.0F, 7.0F, 0.0F, false);
			cara.setModelRendererName("cara");
			this.registerModelRenderer(cara);
			movy3 = new AnimatedModelRenderer(this);
			movy3.setRotationPoint(3.0F, -164.9286F, 7.3214F);
			cara.addChild(movy3);
			setRotationAngle(movy3, 0.0F, 3.1416F, 0.0F);
			movy3.setModelRendererName("movy3");
			this.registerModelRenderer(movy3);
			yes_r3 = new AnimatedModelRenderer(this);
			yes_r3.setRotationPoint(4.75F, -0.25F, 0.0F);
			movy3.addChild(yes_r3);
			setRotationAngle(yes_r3, 0.0F, -0.1309F, 0.1745F);
			yes_r3.setTextureOffset(0, 105).addBox(-0.3671F, -6.0154F, 0.6409F, 5.0F, 25.0F, 5.0F, 0.0F, false);
			yes_r3.setModelRendererName("yes_r3");
			this.registerModelRenderer(yes_r3);
			yes_r4 = new AnimatedModelRenderer(this);
			yes_r4.setRotationPoint(4.75F, -0.25F, 0.0F);
			movy3.addChild(yes_r4);
			setRotationAngle(yes_r4, 0.0F, 0.1309F, -0.1745F);
			yes_r4.setTextureOffset(103, 103).addBox(-8.1148F, -6.6493F, 0.148F, 5.0F, 25.0F, 5.0F, 0.0F, false);
			yes_r4.setModelRendererName("yes_r4");
			this.registerModelRenderer(yes_r4);
			yes_r14 = new AnimatedModelRenderer(this);
			yes_r14.setRotationPoint(10.75F, 0.0F, 1.25F);
			movy3.addChild(yes_r14);
			setRotationAngle(yes_r14, 0.0F, -0.2618F, 0.1745F);
			yes_r14.setTextureOffset(98, 26).addBox(-1.396F, -5.2199F, 0.3639F, 5.0F, 25.0F, 5.0F, 0.0F, false);
			yes_r14.setModelRendererName("yes_r14");
			this.registerModelRenderer(yes_r14);
			yes_r15 = new AnimatedModelRenderer(this);
			yes_r15.setRotationPoint(10.75F, 0.0F, 1.25F);
			movy3.addChild(yes_r15);
			setRotationAngle(yes_r15, 0.0F, 0.2618F, -0.1745F);
			yes_r15.setTextureOffset(56, 94).addBox(-18.4068F, -7.9372F, -3.638F, 5.0F, 25.0F, 5.0F, 0.0F, false);
			yes_r15.setModelRendererName("yes_r15");
			this.registerModelRenderer(yes_r15);
			movy4 = new AnimatedModelRenderer(this);
			movy4.setRotationPoint(-3.0F, -164.9286F, -4.6786F);
			cara.addChild(movy4);
			setRotationAngle(movy4, 0.0F, 3.1416F, 0.0F);
			movy4.setModelRendererName("movy4");
			this.registerModelRenderer(movy4);
			yes_r16 = new AnimatedModelRenderer(this);
			yes_r16.setRotationPoint(4.75F, -0.25F, -6.25F);
			movy4.addChild(yes_r16);
			setRotationAngle(yes_r16, 0.0F, 0.0F, -0.1745F);
			yes_r16.setTextureOffset(76, 111).addBox(-18.4894F, -7.691F, -3.25F, 2.0F, 25.0F, 6.0F, 0.0F, false);
			yes_r16.setModelRendererName("yes_r16");
			this.registerModelRenderer(yes_r16);
			yes_r17 = new AnimatedModelRenderer(this);
			yes_r17.setRotationPoint(4.75F, -0.25F, -6.25F);
			movy4.addChild(yes_r17);
			setRotationAngle(yes_r17, 0.0F, 0.0F, 0.1745F);
			yes_r17.setTextureOffset(20, 108).addBox(0.4305F, -4.9737F, -3.2158F, 2.0F, 25.0F, 6.0F, 0.0F, false);
			yes_r17.setModelRendererName("yes_r17");
			this.registerModelRenderer(yes_r17);
			yes_r18 = new AnimatedModelRenderer(this);
			yes_r18.setRotationPoint(0.8975F, -1.8993F, -1.8958F);
			movy4.addChild(yes_r18);
			setRotationAngle(yes_r18, 0.0F, 0.4363F, 0.1745F);
			yes_r18.setTextureOffset(30, 54).addBox(-3.7205F, -4.3294F, -5.2675F, 6.0F, 25.0F, 9.0F, 0.0F, false);
			yes_r18.setModelRendererName("yes_r18");
			this.registerModelRenderer(yes_r18);
			yes_r19 = new AnimatedModelRenderer(this);
			yes_r19.setRotationPoint(7.2034F, 0.3174F, -3.0291F);
			movy4.addChild(yes_r19);
			setRotationAngle(yes_r19, 0.0F, 0.7418F, 0.1745F);
			yes_r19.setTextureOffset(60, 60).addBox(-4.5764F, -5.1065F, -8.3748F, 4.0F, 25.0F, 9.0F, 0.0F, false);
			yes_r19.setModelRendererName("yes_r19");
			this.registerModelRenderer(yes_r19);
			yes_r20 = new AnimatedModelRenderer(this);
			yes_r20.setRotationPoint(5.1025F, -1.8993F, -1.8958F);
			movy4.addChild(yes_r20);
			setRotationAngle(yes_r20, 0.0F, -0.4363F, -0.1745F);
			yes_r20.setTextureOffset(0, 45).addBox(-13.0674F, -6.4128F, -0.2731F, 6.0F, 25.0F, 9.0F, 0.0F, false);
			yes_r20.setModelRendererName("yes_r20");
			this.registerModelRenderer(yes_r20);
			yes_r21 = new AnimatedModelRenderer(this);
			yes_r21.setRotationPoint(-1.2034F, 0.3174F, -3.0291F);
			movy4.addChild(yes_r21);
			setRotationAngle(yes_r21, 0.0F, -0.7418F, -0.1745F);
			yes_r21.setTextureOffset(54, 0).addBox(-9.0819F, -7.2162F, -0.3676F, 4.0F, 25.0F, 9.0F, 0.0F, false);
			yes_r21.setModelRendererName("yes_r21");
			this.registerModelRenderer(yes_r21);
			bone2 = new AnimatedModelRenderer(this);
			bone2.setRotationPoint(0.0F, -165.4286F, -0.4286F);
			cara.addChild(bone2);
			bone2.setTextureOffset(80, 0).addBox(-3.0F, -6.0F, -0.5F, 6.0F, 18.0F, 8.0F, 0.0F, false);
			bone2.setModelRendererName("bone2");
			this.registerModelRenderer(bone2);
			bone5 = new AnimatedModelRenderer(this);
			bone5.setRotationPoint(0.0F, 13.0F, 2.5F);
			bone2.addChild(bone5);
			setRotationAngle(bone5, 0.3491F, 0.0F, 0.0F);
			bone5.setTextureOffset(28, 28).addBox(-3.0F, -16.1418F, -8.4095F, 6.0F, 12.0F, 14.0F, 0.0F, false);
			bone5.setModelRendererName("bone5");
			this.registerModelRenderer(bone5);
			bone6 = new AnimatedModelRenderer(this);
			bone6.setRotationPoint(0.0F, -0.1418F, 1.0905F);
			bone2.addChild(bone6);
			setRotationAngle(bone6, -0.0873F, 0.0F, 0.0F);
			bone6.setTextureOffset(86, 60).addBox(-3.0F, -5.0758F, -9.3298F, 6.0F, 14.0F, 8.0F, 0.0F, false);
			bone6.setModelRendererName("bone6");
			this.registerModelRenderer(bone6);
			reye = new AnimatedModelRenderer(this);
			reye.setRotationPoint(4.8839F, -155.9857F, -5.1776F);
			cara.addChild(reye);
			setRotationAngle(reye, 0.1745F, -0.7854F, 0.0F);
			reye.setTextureOffset(77, 60).addBox(-2.0F, -2.5F, -1.5F, 4.0F, 5.0F, 3.0F, 0.0F, false);
			reye.setModelRendererName("reye");
			this.registerModelRenderer(reye);
			leye = new AnimatedModelRenderer(this);
			leye.setRotationPoint(-4.8839F, -155.9857F, -5.1776F);
			cara.addChild(leye);
			setRotationAngle(leye, 0.1745F, 0.7854F, 0.0F);
			leye.setTextureOffset(71, 0).addBox(-2.0F, -2.5F, -1.5F, 4.0F, 5.0F, 3.0F, 0.0F, false);
			leye.setModelRendererName("leye");
			this.registerModelRenderer(leye);
			leftleg = new AnimatedModelRenderer(this);
			leftleg.setRotationPoint(6.0F, -18.0F, 0.0F);
			all.addChild(leftleg);
			leftleg.setModelRendererName("leftleg");
			this.registerModelRenderer(leftleg);
			upperleftleg = new AnimatedModelRenderer(this);
			upperleftleg.setRotationPoint(-6.9382F, 6.5098F, 0.8324F);
			leftleg.addChild(upperleftleg);
			setRotationAngle(upperleftleg, 0.0F, 0.0F, -0.0873F);
			upperleftleg.setTextureOffset(108, 0).addBox(2.8166F, -7.5098F, -2.0891F, 7.0F, 15.0F, 5.0F, 0.0F, false);
			upperleftleg.setTextureOffset(140, 26).addBox(2.3166F, -6.2598F, -1.5891F, 1.0F, 15.0F, 5.0F, 0.0F, false);
			upperleftleg.setTextureOffset(150, 139).addBox(3.9314F, -5.2598F, -2.7107F, 5.0F, 9.0F, 1.0F, 0.0F, false);
			upperleftleg.setTextureOffset(58, 147).addBox(2.0666F, -6.2598F, -1.3391F, 1.0F, 9.0F, 4.0F, 0.0F, false);
			upperleftleg.setTextureOffset(92, 111).addBox(9.5666F, -4.2598F, -1.3391F, 1.0F, 10.0F, 4.0F, 0.0F, false);
			upperleftleg.setTextureOffset(150, 150).addBox(3.9314F, -4.5098F, 3.2893F, 5.0F, 9.0F, 1.0F, 0.0F, false);
			upperleftleg.setTextureOffset(143, 93).addBox(3.4314F, -6.2598F, 2.7893F, 6.0F, 15.0F, 1.0F, 0.0F, false);
			upperleftleg.setTextureOffset(138, 140).addBox(9.3166F, -6.2598F, -1.5891F, 1.0F, 15.0F, 5.0F, 0.0F, false);
			upperleftleg.setTextureOffset(132, 47).addBox(2.8166F, 7.4902F, -2.5891F, 7.0F, 3.0F, 6.0F, 0.0F, false);
			upperleftleg.setTextureOffset(96, 150).addBox(3.9314F, -5.2598F, -2.7107F, 5.0F, 9.0F, 1.0F, 0.0F, false);
			upperleftleg.setModelRendererName("upperleftleg");
			this.registerModelRenderer(upperleftleg);
			leftlowerlegs = new AnimatedModelRenderer(this);
			leftlowerlegs.setRotationPoint(-5.9382F, 5.5098F, 0.8324F);
			leftleg.addChild(leftlowerlegs);
			leftlowerlegs.setTextureOffset(0, 33).addBox(2.8166F, 10.4902F, -2.5891F, 7.0F, 4.0F, 6.0F, 0.0F, false);
			leftlowerlegs.setModelRendererName("leftlowerlegs");
			this.registerModelRenderer(leftlowerlegs);
			lfoot = new AnimatedModelRenderer(this);
			lfoot.setRotationPoint(15.25F, 9.0F, 10.0F);
			leftleg.addChild(lfoot);
			lfoot.setTextureOffset(20, 33).addBox(-17.927F, 9.0F, -15.604F, 6.0F, 2.0F, 4.0F, 0.0F, false);
			lfoot.setTextureOffset(26, 39).addBox(-17.927F, 10.0F, -17.404F, 6.0F, 1.0F, 2.0F, 0.0F, false);
			lfoot.setTextureOffset(27, 3).addBox(-17.927F, 9.0F, -16.404F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			lfoot.setTextureOffset(7, 3).addBox(-17.927F, 10.0F, -18.0881F, 4.0F, 1.0F, 0.0F, 0.0F, false);
			lfoot.setModelRendererName("lfoot");
			this.registerModelRenderer(lfoot);
			bone4 = new AnimatedModelRenderer(this);
			bone4.setRotationPoint(-15.927F, 10.0F, -15.904F);
			lfoot.addChild(bone4);
			setRotationAngle(bone4, 0.0F, -0.3927F, 0.0F);
			bone4.setTextureOffset(0, 0).addBox(-0.1913F, -1.0F, -0.4882F, 2.0F, 2.0F, 0.0F, 0.0F, false);
			bone4.setModelRendererName("bone4");
			this.registerModelRenderer(bone4);
			lfoot_r9 = new AnimatedModelRenderer(this);
			lfoot_r9.setRotationPoint(11.1148F, 9.5F, -29.2701F);
			lfoot.addChild(lfoot_r9);
			setRotationAngle(lfoot_r9, 0.0F, -0.3491F, 0.0F);
			lfoot_r9.setTextureOffset(27, 13).addBox(-19.5932F, 0.5F, 19.0318F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			lfoot_r9.setModelRendererName("lfoot_r9");
			this.registerModelRenderer(lfoot_r9);
			lfoot_r10 = new AnimatedModelRenderer(this);
			lfoot_r10.setRotationPoint(-0.1352F, 6.5F, -26.2701F);
			lfoot.addChild(lfoot_r10);
			setRotationAngle(lfoot_r10, 0.5672F, 0.0F, 0.0F);
			lfoot_r10.setTextureOffset(46, 3).addBox(-17.7918F, 7.3479F, 5.0203F, 4.0F, 1.0F, 2.0F, 0.0F, false);
			lfoot_r10.setModelRendererName("lfoot_r10");
			this.registerModelRenderer(lfoot_r10);
			lfoot_r11 = new AnimatedModelRenderer(this);
			lfoot_r11.setRotationPoint(-9.1352F, 6.5F, -30.0F);
			lfoot.addChild(lfoot_r11);
			setRotationAngle(lfoot_r11, 0.5672F, -0.3491F, 0.0F);
			lfoot_r11.setTextureOffset(7, 0).addBox(-0.315F, 9.8243F, 8.9077F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			lfoot_r11.setModelRendererName("lfoot_r11");
			this.registerModelRenderer(lfoot_r11);
			lfoot_r12 = new AnimatedModelRenderer(this);
			lfoot_r12.setRotationPoint(-0.1352F, 6.5F, -24.7701F);
			lfoot.addChild(lfoot_r12);
			setRotationAngle(lfoot_r12, 0.5672F, 0.0F, 0.0F);
			lfoot_r12.setTextureOffset(27, 0).addBox(-12.7918F, 6.9095F, 4.3322F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			lfoot_r12.setModelRendererName("lfoot_r12");
			this.registerModelRenderer(lfoot_r12);
			rightleg = new AnimatedModelRenderer(this);
			rightleg.setRotationPoint(-6.0F, -18.0F, 0.0F);
			all.addChild(rightleg);
			rightleg.setModelRendererName("rightleg");
			this.registerModelRenderer(rightleg);
			upperrightleg = new AnimatedModelRenderer(this);
			upperrightleg.setRotationPoint(7.0618F, 6.5098F, 0.8324F);
			rightleg.addChild(upperrightleg);
			setRotationAngle(upperrightleg, 0.0F, 0.0F, 0.0873F);
			upperrightleg.setTextureOffset(22, 139).addBox(-10.6834F, -6.2598F, -1.5891F, 1.0F, 15.0F, 5.0F, 0.0F, false);
			upperrightleg.setTextureOffset(108, 133).addBox(-3.6834F, -6.2598F, -1.5891F, 1.0F, 15.0F, 5.0F, 0.0F, false);
			upperrightleg.setTextureOffset(86, 146).addBox(-3.4334F, -6.2598F, -1.3391F, 1.0F, 9.0F, 4.0F, 0.0F, false);
			upperrightleg.setTextureOffset(12, 150).addBox(-8.8186F, -5.2598F, -2.7107F, 4.0F, 11.0F, 1.0F, 0.0F, false);
			upperrightleg.setTextureOffset(0, 150).addBox(-9.0686F, -2.5098F, 3.2893F, 5.0F, 9.0F, 1.0F, 0.0F, false);
			upperrightleg.setTextureOffset(48, 144).addBox(-10.9334F, -3.2598F, -1.3391F, 1.0F, 9.0F, 4.0F, 0.0F, false);
			upperrightleg.setTextureOffset(72, 142).addBox(-9.5686F, -6.2598F, 2.7893F, 6.0F, 15.0F, 1.0F, 0.0F, false);
			upperrightleg.setTextureOffset(31, 136).addBox(-10.1834F, 7.4902F, -1.5891F, 7.0F, 3.0F, 5.0F, 0.0F, false);
			upperrightleg.setTextureOffset(103, 82).addBox(-10.1834F, -7.5098F, -2.0891F, 7.0F, 15.0F, 5.0F, 0.0F, false);
			upperrightleg.setModelRendererName("upperrightleg");
			this.registerModelRenderer(upperrightleg);
			rihgtlowerlegs = new AnimatedModelRenderer(this);
			rihgtlowerlegs.setRotationPoint(-6.9382F, 5.5098F, 0.8324F);
			rightleg.addChild(rihgtlowerlegs);
			rihgtlowerlegs.setTextureOffset(134, 62).addBox(2.8166F, 10.4902F, -1.5891F, 7.0F, 4.0F, 5.0F, 0.0F, false);
			rihgtlowerlegs.setModelRendererName("rihgtlowerlegs");
			this.registerModelRenderer(rihgtlowerlegs);
			rfoot = new AnimatedModelRenderer(this);
			rfoot.setRotationPoint(-15.5F, 9.0F, 10.0F);
			rightleg.addChild(rfoot);
			rfoot.setTextureOffset(138, 114).addBox(11.927F, 9.0F, -15.604F, 6.0F, 2.0F, 5.0F, 0.0F, false);
			rfoot.setTextureOffset(46, 0).addBox(11.927F, 10.0F, -17.404F, 6.0F, 1.0F, 2.0F, 0.0F, false);
			rfoot.setTextureOffset(0, 36).addBox(15.927F, 9.0F, -16.404F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			rfoot.setTextureOffset(7, 4).addBox(13.927F, 10.0F, -18.0881F, 4.0F, 1.0F, 0.0F, 0.0F, false);
			rfoot.setModelRendererName("rfoot");
			this.registerModelRenderer(rfoot);
			bone3 = new AnimatedModelRenderer(this);
			bone3.setRotationPoint(15.927F, 10.0F, -15.904F);
			rfoot.addChild(bone3);
			setRotationAngle(bone3, 0.0F, 0.3927F, 0.0F);
			bone3.setTextureOffset(0, 2).addBox(-1.9626F, -1.0F, -0.4882F, 2.0F, 2.0F, 0.0F, 0.0F, false);
			bone3.setModelRendererName("bone3");
			this.registerModelRenderer(bone3);
			lfoot_r5 = new AnimatedModelRenderer(this);
			lfoot_r5.setRotationPoint(-11.1148F, 9.5F, -29.2701F);
			rfoot.addChild(lfoot_r5);
			setRotationAngle(lfoot_r5, 0.0F, 0.3491F, 0.0F);
			lfoot_r5.setTextureOffset(33, 13).addBox(17.5932F, 0.5F, 19.0318F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			lfoot_r5.setModelRendererName("lfoot_r5");
			this.registerModelRenderer(lfoot_r5);
			lfoot_r6 = new AnimatedModelRenderer(this);
			lfoot_r6.setRotationPoint(0.1352F, 6.5F, -26.2701F);
			rfoot.addChild(lfoot_r6);
			setRotationAngle(lfoot_r6, 0.5672F, 0.0F, 0.0F);
			lfoot_r6.setTextureOffset(86, 82).addBox(13.7918F, 7.3479F, 5.0203F, 4.0F, 1.0F, 2.0F, 0.0F, false);
			lfoot_r6.setModelRendererName("lfoot_r6");
			this.registerModelRenderer(lfoot_r6);
			lfoot_r7 = new AnimatedModelRenderer(this);
			lfoot_r7.setRotationPoint(9.1352F, 6.5F, -30.0F);
			rfoot.addChild(lfoot_r7);
			setRotationAngle(lfoot_r7, 0.5672F, 0.3491F, 0.0F);
			lfoot_r7.setTextureOffset(0, 43).addBox(-1.685F, 9.8243F, 8.9077F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			lfoot_r7.setModelRendererName("lfoot_r7");
			this.registerModelRenderer(lfoot_r7);
			lfoot_r8 = new AnimatedModelRenderer(this);
			lfoot_r8.setRotationPoint(0.1352F, 6.5F, -24.7701F);
			rfoot.addChild(lfoot_r8);
			setRotationAngle(lfoot_r8, 0.5672F, 0.0F, 0.0F);
			lfoot_r8.setTextureOffset(0, 33).addBox(11.7918F, 6.9095F, 4.3322F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			lfoot_r8.setModelRendererName("lfoot_r8");
			this.registerModelRenderer(lfoot_r8);
			this.rootBones.add(all);
		}

		@Override
		public ResourceLocation getAnimationFileLocation() {
			return new ResourceLocation("my_titan", "animations/gluttonous.json");
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
		}
	}
}
