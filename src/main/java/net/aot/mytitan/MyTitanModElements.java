/*
 *    MCreator note:
 *
 *    This file is autogenerated to connect all MCreator mod elements together.
 *
 */
package net.aot.mytitan;

import net.minecraftforge.forgespi.language.ModFileScanData;
import net.minecraftforge.fml.network.NetworkEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.tags.Tag;
import net.minecraft.network.PacketBuffer;
import net.minecraft.item.Item;
import net.minecraft.entity.EntityType;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.block.Block;

import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.BiConsumer;
import java.util.Set;
import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.Collections;
import java.util.ArrayList;

import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;

public class MyTitanModElements {
	public final List<ModElement> elements = new ArrayList<>();
	public final List<Supplier<Block>> blocks = new ArrayList<>();
	public final List<Supplier<Item>> items = new ArrayList<>();
	public final List<Supplier<EntityType<?>>> entities = new ArrayList<>();
	public final List<Supplier<Enchantment>> enchantments = new ArrayList<>();
	public static Map<ResourceLocation, net.minecraft.util.SoundEvent> sounds = new HashMap<>();
	public MyTitanModElements() {
		sounds.put(new ResourceLocation("my_titan", "s2intro"), new net.minecraft.util.SoundEvent(new ResourceLocation("my_titan", "s2intro")));
		sounds.put(new ResourceLocation("my_titan", "s1intro2"), new net.minecraft.util.SoundEvent(new ResourceLocation("my_titan", "s1intro2")));
		sounds.put(new ResourceLocation("my_titan", "s1intro1"), new net.minecraft.util.SoundEvent(new ResourceLocation("my_titan", "s1intro1")));
		sounds.put(new ResourceLocation("my_titan", "s3intro1"), new net.minecraft.util.SoundEvent(new ResourceLocation("my_titan", "s3intro1")));
		sounds.put(new ResourceLocation("my_titan", "s3intro2"), new net.minecraft.util.SoundEvent(new ResourceLocation("my_titan", "s3intro2")));
		sounds.put(new ResourceLocation("my_titan", "attacktitanerentransform"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("my_titan", "attacktitanerentransform")));
		sounds.put(new ResourceLocation("my_titan", "titalselectionsmusic"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("my_titan", "titalselectionsmusic")));
		sounds.put(new ResourceLocation("my_titan", "heartbeat"), new net.minecraft.util.SoundEvent(new ResourceLocation("my_titan", "heartbeat")));
		sounds.put(new ResourceLocation("my_titan", "femaletitanroar"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("my_titan", "femaletitanroar")));
		sounds.put(new ResourceLocation("my_titan", "healingsfx"), new net.minecraft.util.SoundEvent(new ResourceLocation("my_titan", "healingsfx")));
		sounds.put(new ResourceLocation("my_titan", "colossaltitanroar"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("my_titan", "colossaltitanroar")));
		sounds.put(new ResourceLocation("my_titan", "useebiggirl"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("my_titan", "useebiggirl")));
		sounds.put(new ResourceLocation("my_titan", "armoredtitantransform"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("my_titan", "armoredtitantransform")));
		sounds.put(new ResourceLocation("my_titan", "inventorysfxcarttitan"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("my_titan", "inventorysfxcarttitan")));
		sounds.put(new ResourceLocation("my_titan", "titanfootsteps"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("my_titan", "titanfootsteps")));
		sounds.put(new ResourceLocation("my_titan", "ashesonthefire"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("my_titan", "ashesonthefire")));
		sounds.put(new ResourceLocation("my_titan", "s4intro"), new net.minecraft.util.SoundEvent(new ResourceLocation("my_titan", "s4intro")));
		sounds.put(new ResourceLocation("my_titan", "aotsong"), new net.minecraft.util.SoundEvent(new ResourceLocation("my_titan", "aotsong")));
		sounds.put(new ResourceLocation("my_titan", "minigun"), new net.minecraft.util.SoundEvent(new ResourceLocation("my_titan", "minigun")));
		sounds.put(new ResourceLocation("my_titan", "beasttitanroar"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("my_titan", "beasttitanroar")));
		sounds.put(new ResourceLocation("my_titan", "electricity"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("my_titan", "electricity")));
		sounds.put(new ResourceLocation("my_titan", "rocks"), new net.minecraft.util.SoundEvent(new ResourceLocation("my_titan", "rocks")));
		sounds.put(new ResourceLocation("my_titan", "sasageyo"), new net.minecraft.util.SoundEvent(new ResourceLocation("my_titan", "sasageyo")));
		sounds.put(new ResourceLocation("my_titan", "generictransform"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("my_titan", "generictransform")));
		sounds.put(new ResourceLocation("my_titan", "sword"), new net.minecraft.util.SoundEvent(new ResourceLocation("my_titan", "sword")));
		sounds.put(new ResourceLocation("my_titan", "mauser"), new net.minecraft.util.SoundEvent(new ResourceLocation("my_titan", "mauser")));
		sounds.put(new ResourceLocation("my_titan", "disk7"), new net.minecraft.util.SoundEvent(new ResourceLocation("my_titan", "disk7")));
		try {
			ModFileScanData modFileInfo = ModList.get().getModFileById("my_titan").getFile().getScanResult();
			Set<ModFileScanData.AnnotationData> annotations = modFileInfo.getAnnotations();
			for (ModFileScanData.AnnotationData annotationData : annotations) {
				if (annotationData.getAnnotationType().getClassName().equals(ModElement.Tag.class.getName())) {
					Class<?> clazz = Class.forName(annotationData.getClassType().getClassName());
					if (clazz.getSuperclass() == MyTitanModElements.ModElement.class)
						elements.add((MyTitanModElements.ModElement) clazz.getConstructor(this.getClass()).newInstance(this));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		Collections.sort(elements);
		elements.forEach(MyTitanModElements.ModElement::initElements);
		MinecraftForge.EVENT_BUS.register(new MyTitanModVariables(this));
	}

	public void registerSounds(RegistryEvent.Register<net.minecraft.util.SoundEvent> event) {
		for (Map.Entry<ResourceLocation, net.minecraft.util.SoundEvent> sound : sounds.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}
	private int messageID = 0;
	public <T> void addNetworkMessage(Class<T> messageType, BiConsumer<T, PacketBuffer> encoder, Function<PacketBuffer, T> decoder,
			BiConsumer<T, Supplier<NetworkEvent.Context>> messageConsumer) {
		MyTitanMod.PACKET_HANDLER.registerMessage(messageID, messageType, encoder, decoder, messageConsumer);
		messageID++;
	}

	public List<ModElement> getElements() {
		return elements;
	}

	public List<Supplier<Block>> getBlocks() {
		return blocks;
	}

	public List<Supplier<Item>> getItems() {
		return items;
	}

	public List<Supplier<EntityType<?>>> getEntities() {
		return entities;
	}

	public List<Supplier<Enchantment>> getEnchantments() {
		return enchantments;
	}
	public static class ModElement implements Comparable<ModElement> {
		@Retention(RetentionPolicy.RUNTIME)
		public @interface Tag {
		}
		protected final MyTitanModElements elements;
		protected final int sortid;
		public ModElement(MyTitanModElements elements, int sortid) {
			this.elements = elements;
			this.sortid = sortid;
		}

		public void initElements() {
		}

		public void init(FMLCommonSetupEvent event) {
		}

		public void serverLoad(FMLServerStartingEvent event) {
		}

		@OnlyIn(Dist.CLIENT)
		public void clientLoad(FMLClientSetupEvent event) {
		}

		@Override
		public int compareTo(ModElement other) {
			return this.sortid - other.sortid;
		}
	}
}
