
package net.aot.mytitan.entity;

import software.bernie.geckolib.manager.EntityAnimationManager;
import software.bernie.geckolib.event.AnimationTestEvent;
import software.bernie.geckolib.entity.IAnimatedEntity;
import software.bernie.geckolib.animation.controller.EntityAnimationController;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.network.NetworkHooks;
import net.minecraftforge.fml.network.FMLPlayMessages;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.server.ServerBossInfo;
import net.minecraft.world.World;
import net.minecraft.world.BossInfo;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Hand;
import net.minecraft.util.DamageSource;
import net.minecraft.network.IPacket;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.entity.projectile.PotionEntity;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.Entity;
import net.minecraft.entity.CreatureAttribute;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.aot.mytitan.procedures.EntityControllableCartTitanOnInitialEntitySpawnProcedure;
import net.aot.mytitan.itemgroup.CreativeTabMyTitanItemGroup;
import net.aot.mytitan.MyTitanModElements;

import java.util.Map;
import java.util.HashMap;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@MyTitanModElements.ModElement.Tag
public class EntityControllableBeastTitanEntity extends MyTitanModElements.ModElement {
	public static EntityType entity = null;
	public EntityControllableBeastTitanEntity(MyTitanModElements instance) {
		super(instance, 21);
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@Override
	public void initElements() {
		entity = (EntityType.Builder.<CustomEntity>create(CustomEntity::new, EntityClassification.MONSTER).setShouldReceiveVelocityUpdates(true)
				.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CustomEntity::new).immuneToFire().size(3f, 16f))
						.build("entity_controllable_beast_titan").setRegistryName("entity_controllable_beast_titan");
		elements.entities.add(() -> entity);
		elements.items.add(() -> new SpawnEggItem(entity, -10079488, -3381760, new Item.Properties().group(CreativeTabMyTitanItemGroup.tab))
				.setRegistryName("entity_controllable_beast_titan_spawn_egg"));
	}

	@SubscribeEvent
	@OnlyIn(Dist.CLIENT)
	public void registerModels(ModelRegistryEvent event) {
		RenderingRegistry.registerEntityRenderingHandler(entity, renderManager -> {
			return new MobRenderer(renderManager, new Modelbeast_titan(), 2f) {
				@Override
				public ResourceLocation getEntityTexture(Entity entity) {
					return new ResourceLocation("my_titan:textures/beast_titan.png");
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
			enablePersistence();
		}

		@Override
		public IPacket<?> createSpawnPacket() {
			return NetworkHooks.getEntitySpawningPacket(this);
		}

		@Override
		protected void registerGoals() {
			super.registerGoals();
			this.goalSelector.addGoal(1, new SwimGoal(this));
		}

		@Override
		public CreatureAttribute getCreatureAttribute() {
			return CreatureAttribute.UNDEFINED;
		}

		@Override
		public boolean canDespawn(double distanceToClosestPlayer) {
			return false;
		}

		@Override
		public double getMountedYOffset() {
			return super.getMountedYOffset() + 5;
		}

		@Override
		public net.minecraft.util.SoundEvent getHurtSound(DamageSource ds) {
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt"));
		}

		@Override
		public net.minecraft.util.SoundEvent getDeathSound() {
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.death"));
		}

		@Override
		public boolean attackEntityFrom(DamageSource source, float amount) {
			if (source.getImmediateSource() instanceof ArrowEntity)
				return false;
			if (source.getImmediateSource() instanceof PlayerEntity)
				return false;
			if (source.getImmediateSource() instanceof PotionEntity)
				return false;
			if (source == DamageSource.FALL)
				return false;
			if (source == DamageSource.CACTUS)
				return false;
			if (source == DamageSource.DROWN)
				return false;
			if (source == DamageSource.LIGHTNING_BOLT)
				return false;
			return super.attackEntityFrom(source, amount);
		}

		@Override
		public boolean processInteract(PlayerEntity sourceentity, Hand hand) {
			ItemStack itemstack = sourceentity.getHeldItem(hand);
			boolean retval = true;
			super.processInteract(sourceentity, hand);
			sourceentity.startRiding(this);
			double x = this.getPosX();
			double y = this.getPosY();
			double z = this.getPosZ();
			Entity entity = this;
			return retval;
		}

		@Override
		public void onCollideWithPlayer(PlayerEntity sourceentity) {
			super.onCollideWithPlayer(sourceentity);
			Entity entity = this;
			double x = this.getPosX();
			double y = this.getPosY();
			double z = this.getPosZ();
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("sourceentity", sourceentity);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				EntityControllableCartTitanOnInitialEntitySpawnProcedure.executeProcedure($_dependencies);
			}
		}

		@Override
		protected void registerAttributes() {
			super.registerAttributes();
			if (this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED) != null)
				this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.3);
			if (this.getAttribute(SharedMonsterAttributes.MAX_HEALTH) != null)
				this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(200);
			if (this.getAttribute(SharedMonsterAttributes.ARMOR) != null)
				this.getAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(0);
			if (this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE) == null)
				this.getAttributes().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
			this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(5);
		}

		@Override
		public boolean isNonBoss() {
			return false;
		}
		private final ServerBossInfo bossInfo = new ServerBossInfo(this.getDisplayName(), BossInfo.Color.GREEN, BossInfo.Overlay.PROGRESS);
		@Override
		public void addTrackingPlayer(ServerPlayerEntity player) {
			super.addTrackingPlayer(player);
			this.bossInfo.addPlayer(player);
		}

		@Override
		public void removeTrackingPlayer(ServerPlayerEntity player) {
			super.removeTrackingPlayer(player);
			this.bossInfo.removePlayer(player);
		}

		@Override
		public void updateAITasks() {
			super.updateAITasks();
			this.bossInfo.setPercent(this.getHealth() / this.getMaxHealth());
		}

		@Override
		public void travel(Vec3d dir) {
			Entity entity = this.getPassengers().isEmpty() ? null : (Entity) this.getPassengers().get(0);
			if (this.isBeingRidden()) {
				this.rotationYaw = entity.rotationYaw;
				this.prevRotationYaw = this.rotationYaw;
				this.rotationPitch = entity.rotationPitch * 0.5F;
				this.setRotation(this.rotationYaw, this.rotationPitch);
				this.jumpMovementFactor = this.getAIMoveSpeed() * 0.15F;
				this.renderYawOffset = entity.rotationYaw;
				this.rotationYawHead = entity.rotationYaw;
				this.stepHeight = 1.0F;
				if (entity instanceof LivingEntity) {
					this.setAIMoveSpeed((float) this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).getValue());
					float forward = ((LivingEntity) entity).moveForward;
					float strafe = ((LivingEntity) entity).moveStrafing;
					super.travel(new Vec3d(strafe, 0, forward));
				}
				this.prevLimbSwingAmount = this.limbSwingAmount;
				double d1 = this.getPosX() - this.prevPosX;
				double d0 = this.getPosZ() - this.prevPosZ;
				float f1 = MathHelper.sqrt(d1 * d1 + d0 * d0) * 4.0F;
				if (f1 > 1.0F)
					f1 = 1.0F;
				this.limbSwingAmount += (f1 - this.limbSwingAmount) * 0.4F;
				this.limbSwing += this.limbSwingAmount;
				return;
			}
			this.stepHeight = 0.5F;
			this.jumpMovementFactor = 0.02F;
			super.travel(dir);
		}
	}

	// Made with Blockbench 3.8.4
	// Exported for Minecraft version 1.15 - 1.16
	// Paste this class into your mod and generate all required imports
	public static class Modelbeast_titan extends EntityModel<Entity> {
		private final ModelRenderer root;
		private final ModelRenderer lowertorso;
		private final ModelRenderer uppertorso;
		private final ModelRenderer armtleft;
		private final ModelRenderer armbleft;
		private final ModelRenderer handleft;
		private final ModelRenderer cube_r1;
		private final ModelRenderer armtright;
		private final ModelRenderer armbright;
		private final ModelRenderer handright;
		private final ModelRenderer cube_r2;
		private final ModelRenderer neck;
		private final ModelRenderer cube_r3;
		private final ModelRenderer head;
		private final ModelRenderer cube_r4;
		private final ModelRenderer cube_r5;
		private final ModelRenderer hips;
		private final ModelRenderer legtleft;
		private final ModelRenderer legbleft;
		private final ModelRenderer legtright;
		private final ModelRenderer legbright;
		public Modelbeast_titan() {
			textureWidth = 512;
			textureHeight = 512;
			root = new ModelRenderer(this);
			root.setRotationPoint(0.0F, 24.0F, 0.0F);
			lowertorso = new ModelRenderer(this);
			lowertorso.setRotationPoint(0.0F, -132.0F, 0.0F);
			root.addChild(lowertorso);
			lowertorso.setTextureOffset(0, 152).addBox(-32.0F, -32.0F, -16.0F, 64.0F, 32.0F, 32.0F, 0.0F, false);
			uppertorso = new ModelRenderer(this);
			uppertorso.setRotationPoint(0.0F, -32.0F, 0.0F);
			lowertorso.addChild(uppertorso);
			uppertorso.setTextureOffset(0, 0).addBox(-40.0F, -56.0F, -16.0F, 80.0F, 56.0F, 32.0F, 0.0F, false);
			uppertorso.setTextureOffset(160, 88).addBox(-32.0F, -64.0F, -12.0F, 64.0F, 8.0F, 24.0F, 0.0F, false);
			armtleft = new ModelRenderer(this);
			armtleft.setRotationPoint(40.0F, -44.0F, 0.0F);
			uppertorso.addChild(armtleft);
			armtleft.setTextureOffset(180, 204).addBox(0.0F, -8.0F, -6.0F, 12.0F, 100.0F, 12.0F, 0.0F, false);
			armbleft = new ModelRenderer(this);
			armbleft.setRotationPoint(6.0F, 92.0F, 0.0F);
			armtleft.addChild(armbleft);
			armbleft.setTextureOffset(96, 216).addBox(-6.0F, 0.0F, -6.0F, 12.0F, 84.0F, 12.0F, 0.0F, false);
			handleft = new ModelRenderer(this);
			handleft.setRotationPoint(0.0F, 84.0F, 0.0F);
			armbleft.addChild(handleft);
			setRotationAngle(handleft, 0.0F, 0.0F, -0.2182F);
			handleft.setTextureOffset(228, 242).addBox(-2.9026F, -1.6404F, -5.9F, 8.0F, 20.0F, 12.0F, -0.1F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(-6.8026F, 2.4596F, -5.9F);
			handleft.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.0F, 0.0F, 0.4363F);
			cube_r1.setTextureOffset(0, 0).addBox(0.0F, -5.0F, 0.0F, 4.0F, 8.0F, 0.0F, 0.0F, false);
			armtright = new ModelRenderer(this);
			armtright.setRotationPoint(-40.0F, -44.0F, 0.0F);
			uppertorso.addChild(armtright);
			armtright.setTextureOffset(180, 206).addBox(-12.0F, -8.0F, -6.0F, 12.0F, 100.0F, 12.0F, 0.0F, true);
			armbright = new ModelRenderer(this);
			armbright.setRotationPoint(-6.0F, 92.0F, 0.0F);
			armtright.addChild(armbright);
			armbright.setTextureOffset(96, 216).addBox(-6.0F, 0.0F, -6.0F, 12.0F, 84.0F, 12.0F, 0.0F, true);
			handright = new ModelRenderer(this);
			handright.setRotationPoint(0.0F, 84.0F, 0.0F);
			armbright.addChild(handright);
			setRotationAngle(handright, 0.0F, 0.0F, 0.2182F);
			handright.setTextureOffset(228, 242).addBox(-5.2974F, -1.6404F, -5.9F, 8.0F, 20.0F, 12.0F, -0.1F, true);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(6.8026F, 2.4596F, -5.9F);
			handright.addChild(cube_r2);
			setRotationAngle(cube_r2, 0.0F, 0.0F, -0.4363F);
			cube_r2.setTextureOffset(0, 0).addBox(-4.0F, -5.0F, 0.0F, 4.0F, 8.0F, 0.0F, 0.0F, true);
			neck = new ModelRenderer(this);
			neck.setRotationPoint(0.0F, -58.0F, -6.0F);
			uppertorso.addChild(neck);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(0.0F, -2.0F, 6.0F);
			neck.addChild(cube_r3);
			setRotationAngle(cube_r3, 0.3927F, 0.0F, 0.0F);
			cube_r3.setTextureOffset(224, 40).addBox(-10.0F, -14.0F, -16.0F, 20.0F, 4.0F, 20.0F, 0.0F, false);
			cube_r3.setTextureOffset(224, 0).addBox(-12.0F, -10.0F, -18.0F, 24.0F, 16.0F, 24.0F, 0.0F, false);
			head = new ModelRenderer(this);
			head.setRotationPoint(4.5F, -10.0F, -3.0F);
			neck.addChild(head);
			head.setTextureOffset(228, 206).addBox(-12.5F, -18.0F, -10.0F, 16.0F, 20.0F, 16.0F, 0.0F, false);
			head.setTextureOffset(0, 0).addBox(-8.5F, -8.0F, -11.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(0, 0).addBox(-10.5F, -8.0F, -11.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(0, 0).addBox(-10.5F, -10.0F, -11.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(0, 0).addBox(-0.5F, -10.0F, -11.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(0, 0).addBox(-0.5F, -8.0F, -11.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(0, 0).addBox(-2.5F, -8.0F, -11.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(-13.5F, -8.0F, -3.5F);
			head.addChild(cube_r4);
			setRotationAngle(cube_r4, 0.0F, -0.3054F, 0.0F);
			cube_r4.setTextureOffset(0, 0).addBox(-0.5F, -3.5F, -4.0F, 1.0F, 7.0F, 11.0F, -0.5F, true);
			cube_r5 = new ModelRenderer(this);
			cube_r5.setRotationPoint(4.5F, -8.0F, -3.5F);
			head.addChild(cube_r5);
			setRotationAngle(cube_r5, 0.0F, 0.3054F, 0.0F);
			cube_r5.setTextureOffset(0, 0).addBox(-0.5F, -3.5F, -4.0F, 1.0F, 7.0F, 11.0F, -0.5F, false);
			hips = new ModelRenderer(this);
			hips.setRotationPoint(0.0F, -132.0F, 0.0F);
			root.addChild(hips);
			hips.setTextureOffset(0, 88).addBox(-32.0F, 0.0F, -16.0F, 64.0F, 32.0F, 32.0F, 0.0F, false);
			legtleft = new ModelRenderer(this);
			legtleft.setRotationPoint(-19.0F, 32.0F, 0.0F);
			hips.addChild(legtleft);
			legtleft.setTextureOffset(192, 120).addBox(-11.0F, 0.0F, -11.0F, 22.0F, 64.0F, 22.0F, 0.0F, true);
			legbleft = new ModelRenderer(this);
			legbleft.setRotationPoint(0.0F, 64.0F, 0.0F);
			legtleft.addChild(legbleft);
			legbleft.setTextureOffset(0, 216).addBox(-12.0F, 0.0F, -12.0F, 24.0F, 36.0F, 24.0F, 0.0F, true);
			legtright = new ModelRenderer(this);
			legtright.setRotationPoint(19.0F, 32.0F, 0.0F);
			hips.addChild(legtright);
			legtright.setTextureOffset(192, 120).addBox(-11.0F, 0.0F, -11.0F, 22.0F, 64.0F, 22.0F, 0.0F, false);
			legbright = new ModelRenderer(this);
			legbright.setRotationPoint(0.0F, 64.0F, 0.0F);
			legtright.addChild(legbright);
			legbright.setTextureOffset(0, 216).addBox(-12.0F, 0.0F, -12.0F, 24.0F, 36.0F, 24.0F, 0.0F, false);
		}

		@Override
		public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			// previously the render function, render code was moved to a method below
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			root.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}
	}
}
