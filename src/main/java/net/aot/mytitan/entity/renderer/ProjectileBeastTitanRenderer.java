package net.aot.mytitan.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.math.vector.Vector3f;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.IRenderTypeBuffer;

import net.aot.mytitan.item.ProjectileBeastTitanItem;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class ProjectileBeastTitanRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(ProjectileBeastTitanItem.arrow, renderManager -> new CustomRender(renderManager));
		}
	}

	@OnlyIn(Dist.CLIENT)
	public static class CustomRender extends EntityRenderer<ProjectileBeastTitanItem.ArrowCustomEntity> {
		private static final ResourceLocation texture = new ResourceLocation("my_titan:textures/rock.png");
		public CustomRender(EntityRendererManager renderManager) {
			super(renderManager);
		}

		@Override
		public void render(ProjectileBeastTitanItem.ArrowCustomEntity entityIn, float entityYaw, float partialTicks, MatrixStack matrixStackIn,
				IRenderTypeBuffer bufferIn, int packedLightIn) {
			IVertexBuilder vb = bufferIn.getBuffer(RenderType.getEntityCutout(this.getEntityTexture(entityIn)));
			matrixStackIn.push();
			matrixStackIn.rotate(Vector3f.YP.rotationDegrees(MathHelper.lerp(partialTicks, entityIn.prevRotationYaw, entityIn.rotationYaw) - 90));
			matrixStackIn.rotate(Vector3f.ZP.rotationDegrees(90 + MathHelper.lerp(partialTicks, entityIn.prevRotationPitch, entityIn.rotationPitch)));
			EntityModel model = new ModelRock();
			model.render(matrixStackIn, vb, packedLightIn, OverlayTexture.NO_OVERLAY, 1, 1, 1, 0.0625f);
			matrixStackIn.pop();
			super.render(entityIn, entityYaw, partialTicks, matrixStackIn, bufferIn, packedLightIn);
		}

		@Override
		public ResourceLocation getEntityTexture(ProjectileBeastTitanItem.ArrowCustomEntity entity) {
			return texture;
		}
	}

	// Made with Blockbench 3.6.6
	public static class ModelRock extends AnimatedEntityModel {
		private final AnimatedModelRenderer rock;
		public ModelRock() {
			textureWidth = 336;
			textureHeight = 336;
			rock = new AnimatedModelRenderer(this);
			rock.setRotationPoint(0.0F, -0.125F, -0.125F);
			rock.setTextureOffset(0, 96).addBox(-21.0F, -19.875F, -26.875F, 41.0F, 40.0F, 54.0F, 0.0F, false);
			rock.setTextureOffset(0, 0).addBox(-24.0F, -23.875F, -23.875F, 48.0F, 48.0F, 48.0F, 0.0F, false);
			rock.setTextureOffset(148, 148).addBox(-26.0F, -20.875F, -19.875F, 52.0F, 41.0F, 42.0F, 0.0F, false);
			rock.setTextureOffset(151, 55).addBox(-21.0F, -25.875F, -21.875F, 43.0F, 52.0F, 41.0F, 0.0F, false);
			rock.setModelRendererName("rock");
			this.registerModelRenderer(rock);
			this.rootBones.add(rock);
		}

		@Override
		public ResourceLocation getAnimationFileLocation() {
			return new ResourceLocation("my_titan", "animations/brrrrrrrrrrrrr.json");
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
		}
	}
}
