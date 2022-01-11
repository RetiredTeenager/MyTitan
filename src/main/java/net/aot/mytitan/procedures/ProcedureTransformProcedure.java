package net.aot.mytitan.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.aot.mytitan.MyTitanModVariables;
import net.aot.mytitan.MyTitanModElements;
import net.aot.mytitan.MyTitanMod;

import java.util.Map;
import java.util.HashMap;

@MyTitanModElements.ModElement.Tag
public class ProcedureTransformProcedure extends MyTitanModElements.ModElement {
	public ProcedureTransformProcedure(MyTitanModElements instance) {
		super(instance, 35);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MyTitanMod.LOGGER.warn("Failed to load dependency entity for procedure ProcedureTransform!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				MyTitanMod.LOGGER.warn("Failed to load dependency x for procedure ProcedureTransform!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				MyTitanMod.LOGGER.warn("Failed to load dependency y for procedure ProcedureTransform!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				MyTitanMod.LOGGER.warn("Failed to load dependency z for procedure ProcedureTransform!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				MyTitanMod.LOGGER.warn("Failed to load dependency world for procedure ProcedureTransform!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		{
			boolean _setval = (boolean) (false);
			entity.getCapability(MyTitanModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.isTransformAnimationOn = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getTotalArmorValue() : 0) == 0)) {
			if ((((entity.getCapability(MyTitanModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new MyTitanModVariables.PlayerVariables())).isTransformed) == (false))) {
				if ((((entity.getCapability(MyTitanModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new MyTitanModVariables.PlayerVariables())).selectedTitan) == 0)) {
					if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
						((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("You don't hold any titans."), (true));
					}
				} else {
					if ((20 <= ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHealth() : -1))) {
						{
							boolean _setval = (boolean) (true);
							entity.getCapability(MyTitanModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.isTransformed = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						if ((((entity.getCapability(MyTitanModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new MyTitanModVariables.PlayerVariables())).selectedTitan) == 1)) {
							{
								Map<String, Object> $_dependencies = new HashMap<>();
								$_dependencies.put("entity", entity);
								$_dependencies.put("x", x);
								$_dependencies.put("y", y);
								$_dependencies.put("z", z);
								$_dependencies.put("world", world);
								AttackTitanTransformProcedure.executeProcedure($_dependencies);
							}
						} else if ((((entity.getCapability(MyTitanModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new MyTitanModVariables.PlayerVariables())).selectedTitan) == 2)) {
							{
								Map<String, Object> $_dependencies = new HashMap<>();
								$_dependencies.put("entity", entity);
								$_dependencies.put("x", x);
								$_dependencies.put("y", y);
								$_dependencies.put("z", z);
								$_dependencies.put("world", world);
								FemaleTitanTransformProcedure.executeProcedure($_dependencies);
							}
						} else if ((((entity.getCapability(MyTitanModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new MyTitanModVariables.PlayerVariables())).selectedTitan) == 3)) {
							{
								Map<String, Object> $_dependencies = new HashMap<>();
								$_dependencies.put("entity", entity);
								$_dependencies.put("x", x);
								$_dependencies.put("y", y);
								$_dependencies.put("z", z);
								$_dependencies.put("world", world);
								ColossalTitanTransformProcedure.executeProcedure($_dependencies);
							}
						} else if ((((entity.getCapability(MyTitanModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new MyTitanModVariables.PlayerVariables())).selectedTitan) == 4)) {
							{
								Map<String, Object> $_dependencies = new HashMap<>();
								$_dependencies.put("entity", entity);
								$_dependencies.put("x", x);
								$_dependencies.put("y", y);
								$_dependencies.put("z", z);
								$_dependencies.put("world", world);
								ArmoredTitanTransformProcedure.executeProcedure($_dependencies);
							}
						} else if ((((entity.getCapability(MyTitanModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new MyTitanModVariables.PlayerVariables())).selectedTitan) == 5)) {
							{
								Map<String, Object> $_dependencies = new HashMap<>();
								$_dependencies.put("entity", entity);
								$_dependencies.put("x", x);
								$_dependencies.put("y", y);
								$_dependencies.put("z", z);
								$_dependencies.put("world", world);
								BeastTitanTransformProcedure.executeProcedure($_dependencies);
							}
						} else if ((((entity.getCapability(MyTitanModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new MyTitanModVariables.PlayerVariables())).selectedTitan) == 6)) {
							{
								Map<String, Object> $_dependencies = new HashMap<>();
								$_dependencies.put("entity", entity);
								$_dependencies.put("x", x);
								$_dependencies.put("y", y);
								$_dependencies.put("z", z);
								$_dependencies.put("world", world);
								CartTitanTransformProcedure.executeProcedure($_dependencies);
							}
						} else if ((((entity.getCapability(MyTitanModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new MyTitanModVariables.PlayerVariables())).selectedTitan) == 7)) {
							{
								Map<String, Object> $_dependencies = new HashMap<>();
								JawTitanTransformProcedure.executeProcedure($_dependencies);
							}
						} else if ((((entity.getCapability(MyTitanModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new MyTitanModVariables.PlayerVariables())).selectedTitan) == 8)) {
							{
								Map<String, Object> $_dependencies = new HashMap<>();
								FoundingTitanTransformProcedure.executeProcedure($_dependencies);
							}
						} else if ((((entity.getCapability(MyTitanModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new MyTitanModVariables.PlayerVariables())).selectedTitan) == 9)) {
							{
								Map<String, Object> $_dependencies = new HashMap<>();
								$_dependencies.put("x", x);
								$_dependencies.put("y", y);
								$_dependencies.put("z", z);
								$_dependencies.put("world", world);
								WarHammerTransformProcedure.executeProcedure($_dependencies);
							}
						}
					} else {
						if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
							((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("You must have full health to transform."), (true));
						}
					}
				}
			}
		} else {
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("You must not be wearing armor to transform"), (true));
			}
		}
	}
}
