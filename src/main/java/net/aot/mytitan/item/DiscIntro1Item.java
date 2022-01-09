
package net.aot.mytitan.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.Item;

import net.aot.mytitan.itemgroup.CreativeTabMyTitanItemGroup;
import net.aot.mytitan.MyTitanModElements;

@MyTitanModElements.ModElement.Tag
public class DiscIntro1Item extends MyTitanModElements.ModElement {
	@ObjectHolder("my_titan:disc_intro_1")
	public static final Item block = null;
	public DiscIntro1Item(MyTitanModElements instance) {
		super(instance, 10);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, MyTitanModElements.sounds.get(new ResourceLocation("my_titan:s1intro1")),
					new Item.Properties().group(CreativeTabMyTitanItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("disc_intro_1");
		}
	}
}
