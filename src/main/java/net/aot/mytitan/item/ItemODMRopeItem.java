
package net.aot.mytitan.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.aot.mytitan.itemgroup.CreativeTabMyTitanItemGroup;
import net.aot.mytitan.MyTitanModElements;

@MyTitanModElements.ModElement.Tag
public class ItemODMRopeItem extends MyTitanModElements.ModElement {
	@ObjectHolder("my_titan:item_odm_rope")
	public static final Item block = null;
	public ItemODMRopeItem(MyTitanModElements instance) {
		super(instance, 210);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(CreativeTabMyTitanItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("item_odm_rope");
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
			return 0F;
		}
	}
}
