package net.aot.mytitan.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.aot.mytitan.MyTitanModVariables;
import net.aot.mytitan.MyTitanModElements;
import net.aot.mytitan.MyTitanMod;

import java.util.Map;
import java.util.HashMap;

@MyTitanModElements.ModElement.Tag
public class KeyTitanPrimaryAttackOnKeyPressedProcedure extends MyTitanModElements.ModElement {
	public KeyTitanPrimaryAttackOnKeyPressedProcedure(MyTitanModElements instance) {
		super(instance, 80);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MyTitanMod.LOGGER.warn("Failed to load dependency entity for procedure KeyTitanPrimaryAttackOnKeyPressed!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				MyTitanMod.LOGGER.warn("Failed to load dependency world for procedure KeyTitanPrimaryAttackOnKeyPressed!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		IWorld world = (IWorld) dependencies.get("world");
		if ((((entity.getCapability(MyTitanModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new MyTitanModVariables.PlayerVariables())).isTransformed) == (true))) {
			if ((((entity.getCapability(MyTitanModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new MyTitanModVariables.PlayerVariables())).selectedTitan) == 1)) {
				if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
					((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("placeholder"), (false));
				}
			} else if ((((entity.getCapability(MyTitanModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new MyTitanModVariables.PlayerVariables())).selectedTitan) == 2)) {
				if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
					((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("placeholder"), (false));
				}
			} else if ((((entity.getCapability(MyTitanModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new MyTitanModVariables.PlayerVariables())).selectedTitan) == 3)) {
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					$_dependencies.put("world", world);
					ColossalTitanEnable2ndAbilityProcedure.executeProcedure($_dependencies);
				}
			} else if ((((entity.getCapability(MyTitanModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new MyTitanModVariables.PlayerVariables())).selectedTitan) == 4)) {
				if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
					((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("placeholder"), (false));
				}
			} else if ((((entity.getCapability(MyTitanModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new MyTitanModVariables.PlayerVariables())).selectedTitan) == 5)) {
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					ProcedureBeastTitanRockThrowMainProcedure.executeProcedure($_dependencies);
				}
			} else if ((((entity.getCapability(MyTitanModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new MyTitanModVariables.PlayerVariables())).selectedTitan) == 6)) {
				if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
					((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("placeholder"), (false));
				}
			} else if ((((entity.getCapability(MyTitanModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new MyTitanModVariables.PlayerVariables())).selectedTitan) == 7)) {
				if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
					((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("placeholder"), (false));
				}
			} else if ((((entity.getCapability(MyTitanModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new MyTitanModVariables.PlayerVariables())).selectedTitan) == 8)) {
				if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
					((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("placeholder"), (false));
				}
			} else if ((((entity.getCapability(MyTitanModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new MyTitanModVariables.PlayerVariables())).selectedTitan) == 9)) {
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					$_dependencies.put("world", world);
					ProcedureWarhammerSpikesAttackProcedure.executeProcedure($_dependencies);
				}
			}
		}
	}
}
