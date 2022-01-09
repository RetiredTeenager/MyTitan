package net.aot.mytitan.procedures;

import net.minecraft.util.text.StringTextComponent;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.aot.mytitan.potion.PotionRawTitanSerumPotion;
import net.aot.mytitan.MyTitanModElements;
import net.aot.mytitan.MyTitanMod;

import java.util.Map;

@MyTitanModElements.ModElement.Tag
public class PotionRawTitanSerumPotionStartedappliedProcedure extends MyTitanModElements.ModElement {
	public PotionRawTitanSerumPotionStartedappliedProcedure(MyTitanModElements instance) {
		super(instance, 205);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MyTitanMod.LOGGER.warn("Failed to load dependency entity for procedure PotionRawTitanSerumPotionStartedapplied!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(PotionRawTitanSerumPotion.potion, (int) 300, (int) 1));
		if (entity instanceof PlayerEntity && !entity.world.isRemote) {
			((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("You feel energetic"), (false));
		}
	}
}
