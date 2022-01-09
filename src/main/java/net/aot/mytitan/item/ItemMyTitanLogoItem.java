
package net.aot.mytitan.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.aot.mytitan.MyTitanModElements;

@MyTitanModElements.ModElement.Tag
public class ItemMyTitanLogoItem extends MyTitanModElements.ModElement {
	@ObjectHolder("my_titan:item_my_titan_logo")
	public static final Item block = null;
	public ItemMyTitanLogoItem(MyTitanModElements instance) {
		super(instance, 116);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(null).maxStackSize(1).rarity(Rarity.EPIC));
			setRegistryName("item_my_titan_logo");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
