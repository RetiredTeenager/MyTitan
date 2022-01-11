package net.aot.mytitan.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.aot.mytitan.entity.EntityControllableBeastTitanEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class EntityControllableBeastTitanRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(EntityControllableBeastTitanEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelbeast_titan(), 2f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("my_titan:textures/beast_titan.png");
					}
				};
			});
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
