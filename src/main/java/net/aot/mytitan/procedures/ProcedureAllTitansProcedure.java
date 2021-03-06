package net.aot.mytitan.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.server.MinecraftServer;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.aot.mytitan.MyTitanModVariables;
import net.aot.mytitan.MyTitanModElements;
import net.aot.mytitan.MyTitanMod;

import java.util.Map;
import java.util.Iterator;
import java.util.HashMap;

@MyTitanModElements.ModElement.Tag
public class ProcedureAllTitansProcedure extends MyTitanModElements.ModElement {
	public ProcedureAllTitansProcedure(MyTitanModElements instance) {
		super(instance, 202);
		MinecraftForge.EVENT_BUS.register(this);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MyTitanMod.LOGGER.warn("Failed to load dependency entity for procedure ProcedureAllTitans!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((((((entity.getCapability(MyTitanModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new MyTitanModVariables.PlayerVariables())).hasTitanAttack)
				&& ((entity.getCapability(MyTitanModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new MyTitanModVariables.PlayerVariables())).hasTitanColossus))
				&& (((entity.getCapability(MyTitanModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new MyTitanModVariables.PlayerVariables())).hasTitanFemale)
						&& ((entity.getCapability(MyTitanModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new MyTitanModVariables.PlayerVariables())).hasTitanArmored)))
				&& ((((entity.getCapability(MyTitanModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new MyTitanModVariables.PlayerVariables())).hasTitanCart)
						&& ((entity.getCapability(MyTitanModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new MyTitanModVariables.PlayerVariables())).hasTitanBeast))
						&& (((entity.getCapability(MyTitanModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new MyTitanModVariables.PlayerVariables())).hasTitanWarHammer)
								&& ((entity.getCapability(MyTitanModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new MyTitanModVariables.PlayerVariables())).hasTitanJaw))))
				&& (((entity.getCapability(MyTitanModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new MyTitanModVariables.PlayerVariables())).hasTitanFounding)
						&& ((entity.getCapability(MyTitanModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new MyTitanModVariables.PlayerVariables())).hasTitanFounding)))) {
			if (entity instanceof ServerPlayerEntity) {
				Advancement _adv = ((MinecraftServer) ((ServerPlayerEntity) entity).server).getAdvancementManager()
						.getAdvancement(new ResourceLocation("my_titan:advancement_all_titans"));
				AdvancementProgress _ap = ((ServerPlayerEntity) entity).getAdvancements().getProgress(_adv);
				if (!_ap.isDone()) {
					Iterator _iterator = _ap.getRemaningCriteria().iterator();
					while (_iterator.hasNext()) {
						String _criterion = (String) _iterator.next();
						((ServerPlayerEntity) entity).getAdvancements().grantCriterion(_adv, _criterion);
					}
				}
			}
		}
	}

	@SubscribeEvent
	public void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			Entity entity = event.player;
			World world = entity.world;
			double i = entity.getPosX();
			double j = entity.getPosY();
			double k = entity.getPosZ();
			Map<String, Object> dependencies = new HashMap<>();
			dependencies.put("x", i);
			dependencies.put("y", j);
			dependencies.put("z", k);
			dependencies.put("world", world);
			dependencies.put("entity", entity);
			dependencies.put("event", event);
			this.executeProcedure(dependencies);
		}
	}
}
