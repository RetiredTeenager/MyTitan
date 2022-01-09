package net.aot.mytitan.procedures;

import net.minecraft.entity.Entity;

import net.aot.mytitan.MyTitanModVariables;
import net.aot.mytitan.MyTitanModElements;
import net.aot.mytitan.MyTitanMod;

import java.util.Map;

@MyTitanModElements.ModElement.Tag
public class PotionRawTitanSerumOnPotionActiveTickProcedure extends MyTitanModElements.ModElement {
	public PotionRawTitanSerumOnPotionActiveTickProcedure(MyTitanModElements instance) {
		super(instance, 206);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MyTitanMod.LOGGER.warn("Failed to load dependency entity for procedure PotionRawTitanSerumOnPotionActiveTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		{
			double _setval = (double) (((entity.getCapability(MyTitanModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new MyTitanModVariables.PlayerVariables())).energyPoints) + 0.025);
			entity.getCapability(MyTitanModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.selectedTitan = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
