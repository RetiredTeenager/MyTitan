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

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
	}
}