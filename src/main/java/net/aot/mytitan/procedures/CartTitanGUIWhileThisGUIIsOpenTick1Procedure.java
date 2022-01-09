package net.aot.mytitan.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.container.Slot;
import net.minecraft.inventory.container.Container;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.Entity;

import net.aot.mytitan.item.WeaponCartTitanMinigunItem;
import net.aot.mytitan.MyTitanModVariables;
import net.aot.mytitan.MyTitanModElements;
import net.aot.mytitan.MyTitanMod;

import java.util.function.Supplier;
import java.util.Map;

@MyTitanModElements.ModElement.Tag
public class CartTitanGUIWhileThisGUIIsOpenTick1Procedure extends MyTitanModElements.ModElement {
	public CartTitanGUIWhileThisGUIIsOpenTick1Procedure(MyTitanModElements instance) {
		super(instance, 120);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MyTitanMod.LOGGER.warn("Failed to load dependency entity for procedure CartTitanGUIWhileThisGUIIsOpenTick1!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				MyTitanMod.LOGGER.warn("Failed to load dependency world for procedure CartTitanGUIWhileThisGUIIsOpenTick1!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		IWorld world = (IWorld) dependencies.get("world");
		if (((new Object() {
			public ItemStack getItemStack(int sltid) {
				Entity _ent = entity;
				if (_ent instanceof ServerPlayerEntity) {
					Container _current = ((ServerPlayerEntity) _ent).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							return ((Slot) ((Map) invobj).get(sltid)).getStack();
						}
					}
				}
				return ItemStack.EMPTY;
			}
		}.getItemStack((int) (65))).getItem() == new ItemStack(WeaponCartTitanMinigunItem.block, (int) (1)).getItem())) {
			MyTitanModVariables.WorldVariables.get(world).isCartMinigunOn = (boolean) (true);
			MyTitanModVariables.WorldVariables.get(world).syncData(world);
		} else {
			MyTitanModVariables.WorldVariables.get(world).isCartMinigunOn = (boolean) (false);
			MyTitanModVariables.WorldVariables.get(world).syncData(world);
		}
	}
}
