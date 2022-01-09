
package net.aot.mytitan.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ArmorItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.BipedModel;

import net.aot.mytitan.procedures.ArmorODMLeggingsTickEventProcedure;
import net.aot.mytitan.itemgroup.CreativeTabMyTitanItemGroup;
import net.aot.mytitan.MyTitanModElements;

import java.util.Map;
import java.util.List;
import java.util.HashMap;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@MyTitanModElements.ModElement.Tag
public class ArmorODMItem extends MyTitanModElements.ModElement {
	@ObjectHolder("my_titan:armor_odm_helmet")
	public static final Item helmet = null;
	@ObjectHolder("my_titan:armor_odm_chestplate")
	public static final Item body = null;
	@ObjectHolder("my_titan:armor_odm_leggings")
	public static final Item legs = null;
	@ObjectHolder("my_titan:armor_odm_boots")
	public static final Item boots = null;
	public ArmorODMItem(MyTitanModElements instance) {
		super(instance, 207);
	}

	@Override
	public void initElements() {
		IArmorMaterial armormaterial = new IArmorMaterial() {
			public int getDurability(EquipmentSlotType slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 25;
			}

			public int getDamageReductionAmount(EquipmentSlotType slot) {
				return new int[]{2, 5, 6, 2}[slot.getIndex()];
			}

			public int getEnchantability() {
				return 9;
			}

			public net.minecraft.util.SoundEvent getSoundEvent() {
				return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("my_titan:inventorysfxcarttitan"));
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}

			@OnlyIn(Dist.CLIENT)
			public String getName() {
				return "armor_odm";
			}

			public float getToughness() {
				return 0f;
			}
		};
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.LEGS, new Item.Properties().group(CreativeTabMyTitanItemGroup.tab)) {
			@Override
			@OnlyIn(Dist.CLIENT)
			public BipedModel getArmorModel(LivingEntity living, ItemStack stack, EquipmentSlotType slot, BipedModel defaultModel) {
				BipedModel armorModel = new BipedModel(1);
				armorModel.bipedLeftLeg = new ModelGearODM().odm;
				armorModel.bipedRightLeg = new ModelGearODM().odm;
				armorModel.isSneak = living.isSneaking();
				armorModel.isSitting = defaultModel.isSitting;
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
				super.addInformation(itemstack, world, list, flag);
				list.add(new StringTextComponent("Three Dimensional Manuever Gear"));
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "my_titan:textures/layer_2.png";
			}

			@Override
			public void onArmorTick(ItemStack itemstack, World world, PlayerEntity entity) {
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					ArmorODMLeggingsTickEventProcedure.executeProcedure($_dependencies);
				}
			}
		}.setRegistryName("armor_odm_leggings"));
	}
	// Made with Blockbench 3.8.4
	// Exported for Minecraft version 1.15 - 1.16
	// Paste this class into your mod and generate all required imports
	public static class ModelGearODM extends EntityModel<Entity> {
		private final ModelRenderer odm;
		private final ModelRenderer mainodm;
		private final ModelRenderer thing;
		private final ModelRenderer thing2;
		private final ModelRenderer thing3;
		private final ModelRenderer thing4;
		private final ModelRenderer thing5;
		private final ModelRenderer thing6;
		private final ModelRenderer rgasblades;
		private final ModelRenderer boneoi6;
		private final ModelRenderer boneoi7;
		private final ModelRenderer boneoi8;
		private final ModelRenderer boneoi9;
		private final ModelRenderer boneoi10;
		private final ModelRenderer lgasblades;
		private final ModelRenderer boneoi2;
		private final ModelRenderer boneoi3;
		private final ModelRenderer boneoi4;
		private final ModelRenderer boneoi5;
		private final ModelRenderer boneoi11;
		private final ModelRenderer bone;
		public ModelGearODM() {
			textureWidth = 64;
			textureHeight = 64;
			odm = new ModelRenderer(this);
			odm.setRotationPoint(0.0F, 24.0F, 5.0F);
			mainodm = new ModelRenderer(this);
			mainodm.setRotationPoint(0.0F, -3.0F, -3.0F);
			odm.addChild(mainodm);
			thing = new ModelRenderer(this);
			thing.setRotationPoint(-0.5F, -1.5F, 2.75F);
			mainodm.addChild(thing);
			setRotationAngle(thing, -0.4363F, 0.0F, 0.0F);
			thing.setTextureOffset(21, 27).addBox(-1.0F, 0.0435F, -1.0741F, 3.0F, 2.0F, 7.0F, 0.0F, false);
			thing2 = new ModelRenderer(this);
			thing2.setRotationPoint(-0.5F, -1.5F, 2.75F);
			mainodm.addChild(thing2);
			setRotationAngle(thing2, -0.4363F, 0.0F, 0.0F);
			thing2.setTextureOffset(28, 0).addBox(-1.5F, -0.9717F, -1.6329F, 4.0F, 1.0F, 4.0F, 0.0F, false);
			thing3 = new ModelRenderer(this);
			thing3.setRotationPoint(0.5F, -1.25F, 2.25F);
			mainodm.addChild(thing3);
			setRotationAngle(thing3, 0.0F, 0.0F, 1.1781F);
			thing3.setTextureOffset(0, 16).addBox(0.3521F, -3.0356F, 0.4392F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			thing4 = new ModelRenderer(this);
			thing4.setRotationPoint(-0.5F, -1.25F, 2.25F);
			mainodm.addChild(thing4);
			setRotationAngle(thing4, 0.0F, 0.0F, -1.1781F);
			thing4.setTextureOffset(18, 6).addBox(-2.3521F, -2.0356F, 1.4392F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			thing5 = new ModelRenderer(this);
			thing5.setRotationPoint(-0.5F, -1.25F, 2.25F);
			mainodm.addChild(thing5);
			setRotationAngle(thing5, 0.0F, 0.0F, -1.1781F);
			thing5.setTextureOffset(0, 7).addBox(-3.3521F, -3.0356F, 0.4392F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			thing6 = new ModelRenderer(this);
			thing6.setRotationPoint(0.5F, -1.25F, 2.25F);
			mainodm.addChild(thing6);
			setRotationAngle(thing6, 0.0F, 0.0F, 1.1781F);
			thing6.setTextureOffset(8, 20).addBox(1.3521F, -2.0356F, 1.4392F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			rgasblades = new ModelRenderer(this);
			rgasblades.setRotationPoint(0.0F, -2.0F, -3.0F);
			odm.addChild(rgasblades);
			boneoi6 = new ModelRenderer(this);
			boneoi6.setRotationPoint(-3.0F, 3.25F, 2.0F);
			rgasblades.addChild(boneoi6);
			setRotationAngle(boneoi6, -0.2182F, 0.0F, 0.0F);
			boneoi6.setTextureOffset(0, 0).addBox(-3.75F, -2.0F, -6.0F, 2.0F, 4.0F, 12.0F, 0.0F, false);
			boneoi7 = new ModelRenderer(this);
			boneoi7.setRotationPoint(-3.5F, 3.5F, 2.5F);
			rgasblades.addChild(boneoi7);
			setRotationAngle(boneoi7, -0.2182F, 0.0F, 0.0F);
			boneoi7.setTextureOffset(16, 16).addBox(-2.75F, -3.1359F, -4.5423F, 1.0F, 1.0F, 10.0F, 0.0F, false);
			boneoi8 = new ModelRenderer(this);
			boneoi8.setRotationPoint(-3.5F, 3.0F, 1.75F);
			rgasblades.addChild(boneoi8);
			setRotationAngle(boneoi8, -0.2182F, 0.0F, 0.0F);
			boneoi8.setTextureOffset(28, 5).addBox(-3.75F, -2.1359F, -5.5423F, 3.0F, 4.0F, 1.0F, 0.0F, false);
			boneoi9 = new ModelRenderer(this);
			boneoi9.setRotationPoint(-3.5F, 4.0F, 5.75F);
			rgasblades.addChild(boneoi9);
			setRotationAngle(boneoi9, -0.2182F, 0.0F, 0.0F);
			boneoi9.setTextureOffset(16, 16).addBox(-3.75F, -3.1359F, -5.5423F, 3.0F, 5.0F, 1.0F, 0.0F, false);
			boneoi10 = new ModelRenderer(this);
			boneoi10.setRotationPoint(-3.5F, 5.0F, 10.75F);
			rgasblades.addChild(boneoi10);
			setRotationAngle(boneoi10, -0.2182F, 0.0F, 0.0F);
			boneoi10.setTextureOffset(0, 0).addBox(-3.75F, -3.1359F, -5.5423F, 3.0F, 5.0F, 1.0F, 0.0F, false);
			lgasblades = new ModelRenderer(this);
			lgasblades.setRotationPoint(0.0F, -2.0F, -3.0F);
			odm.addChild(lgasblades);
			boneoi2 = new ModelRenderer(this);
			boneoi2.setRotationPoint(3.0F, 3.25F, 2.0F);
			lgasblades.addChild(boneoi2);
			setRotationAngle(boneoi2, -0.2182F, 0.0F, 0.0F);
			boneoi2.setTextureOffset(0, 0).addBox(1.75F, -2.0F, -6.0F, 2.0F, 4.0F, 12.0F, 0.0F, true);
			boneoi3 = new ModelRenderer(this);
			boneoi3.setRotationPoint(3.5F, 3.5F, 2.5F);
			lgasblades.addChild(boneoi3);
			setRotationAngle(boneoi3, -0.2182F, 0.0F, 0.0F);
			boneoi3.setTextureOffset(16, 16).addBox(1.75F, -3.1359F, -4.5423F, 1.0F, 1.0F, 10.0F, 0.0F, true);
			boneoi4 = new ModelRenderer(this);
			boneoi4.setRotationPoint(3.5F, 3.0F, 1.75F);
			lgasblades.addChild(boneoi4);
			setRotationAngle(boneoi4, -0.2182F, 0.0F, 0.0F);
			boneoi4.setTextureOffset(28, 5).addBox(0.75F, -2.1359F, -5.5423F, 3.0F, 4.0F, 1.0F, 0.0F, true);
			boneoi5 = new ModelRenderer(this);
			boneoi5.setRotationPoint(3.5F, 4.0F, 5.75F);
			lgasblades.addChild(boneoi5);
			setRotationAngle(boneoi5, -0.2182F, 0.0F, 0.0F);
			boneoi5.setTextureOffset(16, 16).addBox(0.75F, -3.1359F, -5.5423F, 3.0F, 5.0F, 1.0F, 0.0F, true);
			boneoi11 = new ModelRenderer(this);
			boneoi11.setRotationPoint(3.5F, 5.0F, 10.75F);
			lgasblades.addChild(boneoi11);
			setRotationAngle(boneoi11, -0.2182F, 0.0F, 0.0F);
			boneoi11.setTextureOffset(0, 0).addBox(0.75F, -3.1359F, -5.5423F, 3.0F, 5.0F, 1.0F, 0.0F, true);
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, 0.0F, 0.0F);
			odm.addChild(bone);
			bone.setTextureOffset(60, 62).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		}

		@Override
		public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			// previously the render function, render code was moved to a method below
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			odm.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}
	}
}
