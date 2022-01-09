package net.aot.mytitan.procedures;

import net.minecraftforge.fml.loading.FMLPaths;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.common.MinecraftForge;

import net.aot.mytitan.MyTitanModElements;

import java.util.Map;
import java.util.Collections;

import java.io.IOException;
import java.io.File;

@MyTitanModElements.ModElement.Tag
public class ProcedureOnGameLoadedProcedure extends MyTitanModElements.ModElement {
	public ProcedureOnGameLoadedProcedure(MyTitanModElements instance) {
		super(instance, 122);
		MinecraftForge.EVENT_BUS.register(this);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		File MyTitanConfig = new File(FMLPaths.GAMEDIR.get().toString(), File.separator + "mytitan.json");
		if (!MyTitanConfig.exists()) {
			try {
				MyTitanConfig.createNewFile();
			} catch (IOException exception) {
				exception.printStackTrace();
			}
		}
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		this.executeProcedure(Collections.emptyMap());
	}
}
