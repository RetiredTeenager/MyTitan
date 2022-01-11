package net.aot.mytitan.procedures;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.common.MinecraftForge;

import net.aot.mytitan.MyTitanModElements;

import java.util.Map;
import java.util.Collections;

@MyTitanModElements.ModElement.Tag
public class ProcedureOnGameLoadedProcedure extends MyTitanModElements.ModElement {
	public ProcedureOnGameLoadedProcedure(MyTitanModElements instance) {
		super(instance, 122);
		MinecraftForge.EVENT_BUS.register(this);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		this.executeProcedure(Collections.emptyMap());
	}
}
