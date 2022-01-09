
package net.aot.mytitan.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.aot.mytitan.item.ItemMyTitanLogoItem;
import net.aot.mytitan.MyTitanModElements;

@MyTitanModElements.ModElement.Tag
public class CreativeTabMyTitanItemGroup extends MyTitanModElements.ModElement {
	public CreativeTabMyTitanItemGroup(MyTitanModElements instance) {
		super(instance, 38);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabcreative_tab_my_titan") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(ItemMyTitanLogoItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
