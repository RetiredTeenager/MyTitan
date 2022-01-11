package net.aot.mytitan.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.aot.mytitan.entity.EntityShifterErenEntity;

@OnlyIn(Dist.CLIENT)
public class EntityShifterErenRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(EntityShifterErenEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modeleren(), 0.5f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("my_titan:textures/eren-yeager-attack-on-titan-s4-1-8-on-planetminecraft-com.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.6.6
	public static class Modeleren extends AnimatedEntityModel {
		private final AnimatedModelRenderer Head;
		private final AnimatedModelRenderer Body;
		private final AnimatedModelRenderer RightArm;
		private final AnimatedModelRenderer LeftArm;
		private final AnimatedModelRenderer RightLeg;
		private final AnimatedModelRenderer LeftLeg;
		public Modeleren() {
			textureWidth = 64;
			textureHeight = 64;
			Head = new AnimatedModelRenderer(this);
			Head.setRotationPoint(0.0F, 0.0F, 0.0F);
			setRotationAngle(Head, -0.1047F, 0.0873F, 0.0F);
			Head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			Head.setTextureOffset(32, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.5F, false);
			Head.setModelRendererName("Head");
			this.registerModelRenderer(Head);
			Body = new AnimatedModelRenderer(this);
			Body.setRotationPoint(0.0F, 0.0F, 0.0F);
			Body.setTextureOffset(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
			Body.setTextureOffset(16, 32).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.25F, false);
			Body.setModelRendererName("Body");
			this.registerModelRenderer(Body);
			RightArm = new AnimatedModelRenderer(this);
			RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
			setRotationAngle(RightArm, -0.1745F, 0.0F, 0.0F);
			RightArm.setTextureOffset(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			RightArm.setTextureOffset(40, 32).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);
			RightArm.setModelRendererName("RightArm");
			this.registerModelRenderer(RightArm);
			LeftArm = new AnimatedModelRenderer(this);
			LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
			setRotationAngle(LeftArm, 0.2094F, 0.0F, 0.0F);
			LeftArm.setTextureOffset(32, 48).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			LeftArm.setTextureOffset(48, 48).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);
			LeftArm.setModelRendererName("LeftArm");
			this.registerModelRenderer(LeftArm);
			RightLeg = new AnimatedModelRenderer(this);
			RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
			setRotationAngle(RightLeg, 0.192F, 0.0F, 0.0349F);
			RightLeg.setTextureOffset(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			RightLeg.setTextureOffset(0, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);
			RightLeg.setModelRendererName("RightLeg");
			this.registerModelRenderer(RightLeg);
			LeftLeg = new AnimatedModelRenderer(this);
			LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
			setRotationAngle(LeftLeg, -0.1745F, 0.0F, -0.0349F);
			LeftLeg.setTextureOffset(16, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			LeftLeg.setTextureOffset(0, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);
			LeftLeg.setModelRendererName("LeftLeg");
			this.registerModelRenderer(LeftLeg);
			this.rootBones.add(Head);
			this.rootBones.add(Body);
			this.rootBones.add(RightArm);
			this.rootBones.add(LeftArm);
			this.rootBones.add(RightLeg);
			this.rootBones.add(LeftLeg);
		}

		@Override
		public ResourceLocation getAnimationFileLocation() {
			return new ResourceLocation("MyTitan", "animations/biting.animation.json");
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
		}
	}
}
