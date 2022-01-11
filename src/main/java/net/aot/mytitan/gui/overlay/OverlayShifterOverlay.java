
package net.aot.mytitan.gui.overlay;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.Minecraft;

import net.aot.mytitan.procedures.OverlayifTitanProcedure;
import net.aot.mytitan.procedures.KillmeProcedure;
import net.aot.mytitan.procedures.Killme9Procedure;
import net.aot.mytitan.procedures.Killme8Procedure;
import net.aot.mytitan.procedures.Killme7Procedure;
import net.aot.mytitan.procedures.Killme6Procedure;
import net.aot.mytitan.procedures.Killme5Procedure;
import net.aot.mytitan.procedures.Killme50Procedure;
import net.aot.mytitan.procedures.Killme4Procedure;
import net.aot.mytitan.procedures.Killme49Procedure;
import net.aot.mytitan.procedures.Killme48Procedure;
import net.aot.mytitan.procedures.Killme47Procedure;
import net.aot.mytitan.procedures.Killme46Procedure;
import net.aot.mytitan.procedures.Killme45Procedure;
import net.aot.mytitan.procedures.Killme44Procedure;
import net.aot.mytitan.procedures.Killme43Procedure;
import net.aot.mytitan.procedures.Killme42Procedure;
import net.aot.mytitan.procedures.Killme41Procedure;
import net.aot.mytitan.procedures.Killme40Procedure;
import net.aot.mytitan.procedures.Killme3Procedure;
import net.aot.mytitan.procedures.Killme39Procedure;
import net.aot.mytitan.procedures.Killme38Procedure;
import net.aot.mytitan.procedures.Killme37Procedure;
import net.aot.mytitan.procedures.Killme36Procedure;
import net.aot.mytitan.procedures.Killme35Procedure;
import net.aot.mytitan.procedures.Killme34Procedure;
import net.aot.mytitan.procedures.Killme33Procedure;
import net.aot.mytitan.procedures.Killme32Procedure;
import net.aot.mytitan.procedures.Killme31Procedure;
import net.aot.mytitan.procedures.Killme30Procedure;
import net.aot.mytitan.procedures.Killme2Procedure;
import net.aot.mytitan.procedures.Killme29Procedure;
import net.aot.mytitan.procedures.Killme28Procedure;
import net.aot.mytitan.procedures.Killme27Procedure;
import net.aot.mytitan.procedures.Killme26Procedure;
import net.aot.mytitan.procedures.Killme25Procedure;
import net.aot.mytitan.procedures.Killme24Procedure;
import net.aot.mytitan.procedures.Killme23Procedure;
import net.aot.mytitan.procedures.Killme22Procedure;
import net.aot.mytitan.procedures.Killme21Procedure;
import net.aot.mytitan.procedures.Killme20Procedure;
import net.aot.mytitan.procedures.Killme19Procedure;
import net.aot.mytitan.procedures.Killme18Procedure;
import net.aot.mytitan.procedures.Killme17Procedure;
import net.aot.mytitan.procedures.Killme16Procedure;
import net.aot.mytitan.procedures.Killme15Procedure;
import net.aot.mytitan.procedures.Killme14Procedure;
import net.aot.mytitan.procedures.Killme13Procedure;
import net.aot.mytitan.procedures.Killme12Procedure;
import net.aot.mytitan.procedures.Killme11Procedure;
import net.aot.mytitan.procedures.Killme10Procedure;
import net.aot.mytitan.MyTitanModElements;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

import com.google.common.collect.ImmutableMap;

@MyTitanModElements.ModElement.Tag
public class OverlayShifterOverlay extends MyTitanModElements.ModElement {
	public OverlayShifterOverlay(MyTitanModElements instance) {
		super(instance, 127);
	}

	@Override
	public void initElements() {
		MinecraftForge.EVENT_BUS.register(this);
	}

	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public void eventHandler(RenderGameOverlayEvent event) {
		if (!event.isCancelable() && event.getType() == RenderGameOverlayEvent.ElementType.HELMET) {
			int posX = (event.getWindow().getScaledWidth()) / 2;
			int posY = (event.getWindow().getScaledHeight()) / 2;
			PlayerEntity entity = Minecraft.getInstance().player;
			World world = entity.world;
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();
			RenderSystem.disableDepthTest();
			RenderSystem.depthMask(false);
			RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA,
					GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
			RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
			RenderSystem.disableAlphaTest();
			if (OverlayifTitanProcedure.executeProcedure(ImmutableMap.of("entity", entity))) {
				if (KillmeProcedure.executeProcedure(ImmutableMap.of("entity", entity))) {
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("my_titan:textures/1.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -18, posY + 68, 0, 0, 52, 15, 52, 15);
				}
				if (Killme2Procedure.executeProcedure(ImmutableMap.of("entity", entity))) {
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("my_titan:textures/2.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -18, posY + 68, 0, 0, 52, 15, 52, 15);
				}
				if (Killme3Procedure.executeProcedure(ImmutableMap.of("entity", entity))) {
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("my_titan:textures/3.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -18, posY + 68, 0, 0, 52, 15, 52, 15);
				}
				if (Killme4Procedure.executeProcedure(ImmutableMap.of("entity", entity))) {
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("my_titan:textures/4.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -18, posY + 68, 0, 0, 52, 15, 52, 15);
				}
				if (Killme5Procedure.executeProcedure(ImmutableMap.of("entity", entity))) {
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("my_titan:textures/5.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -18, posY + 68, 0, 0, 52, 15, 52, 15);
				}
				if (Killme6Procedure.executeProcedure(ImmutableMap.of("entity", entity))) {
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("my_titan:textures/6.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -18, posY + 68, 0, 0, 52, 15, 52, 15);
				}
				if (Killme7Procedure.executeProcedure(ImmutableMap.of("entity", entity))) {
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("my_titan:textures/7.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -18, posY + 68, 0, 0, 52, 15, 52, 15);
				}
				if (Killme8Procedure.executeProcedure(ImmutableMap.of("entity", entity))) {
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("my_titan:textures/8.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -18, posY + 68, 0, 0, 52, 15, 52, 15);
				}
				if (Killme9Procedure.executeProcedure(ImmutableMap.of("entity", entity))) {
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("my_titan:textures/9.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -18, posY + 68, 0, 0, 52, 15, 52, 15);
				}
				if (Killme10Procedure.executeProcedure(ImmutableMap.of("entity", entity))) {
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("my_titan:textures/10.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -18, posY + 68, 0, 0, 52, 15, 52, 15);
				}
				if (Killme11Procedure.executeProcedure(ImmutableMap.of("entity", entity))) {
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("my_titan:textures/11.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -18, posY + 68, 0, 0, 52, 15, 52, 15);
				}
				if (Killme12Procedure.executeProcedure(ImmutableMap.of("entity", entity))) {
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("my_titan:textures/12.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -18, posY + 68, 0, 0, 52, 15, 52, 15);
				}
				if (Killme13Procedure.executeProcedure(ImmutableMap.of("entity", entity))) {
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("my_titan:textures/13.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -18, posY + 68, 0, 0, 52, 15, 52, 15);
				}
				if (Killme14Procedure.executeProcedure(ImmutableMap.of("entity", entity))) {
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("my_titan:textures/14.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -18, posY + 68, 0, 0, 52, 15, 52, 15);
				}
				if (Killme15Procedure.executeProcedure(ImmutableMap.of("entity", entity))) {
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("my_titan:textures/15.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -18, posY + 68, 0, 0, 52, 15, 52, 15);
				}
				if (Killme16Procedure.executeProcedure(ImmutableMap.of("entity", entity))) {
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("my_titan:textures/16.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -18, posY + 68, 0, 0, 52, 15, 52, 15);
				}
				if (Killme17Procedure.executeProcedure(ImmutableMap.of("entity", entity))) {
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("my_titan:textures/17.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -18, posY + 68, 0, 0, 52, 15, 52, 15);
				}
				if (Killme18Procedure.executeProcedure(ImmutableMap.of("entity", entity))) {
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("my_titan:textures/18.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -18, posY + 68, 0, 0, 52, 15, 52, 15);
				}
				if (Killme19Procedure.executeProcedure(ImmutableMap.of("entity", entity))) {
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("my_titan:textures/19.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -18, posY + 68, 0, 0, 52, 15, 52, 15);
				}
				if (Killme20Procedure.executeProcedure(ImmutableMap.of("entity", entity))) {
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("my_titan:textures/20.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -18, posY + 68, 0, 0, 52, 15, 52, 15);
				}
				if (Killme21Procedure.executeProcedure(ImmutableMap.of("entity", entity))) {
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("my_titan:textures/21.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -18, posY + 68, 0, 0, 52, 15, 52, 15);
				}
				if (Killme22Procedure.executeProcedure(ImmutableMap.of("entity", entity))) {
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("my_titan:textures/22.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -18, posY + 68, 0, 0, 52, 15, 52, 15);
				}
				if (Killme23Procedure.executeProcedure(ImmutableMap.of("entity", entity))) {
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("my_titan:textures/23.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -18, posY + 68, 0, 0, 52, 15, 52, 15);
				}
				if (Killme24Procedure.executeProcedure(ImmutableMap.of("entity", entity))) {
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("my_titan:textures/24.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -18, posY + 68, 0, 0, 52, 15, 52, 15);
				}
				if (Killme25Procedure.executeProcedure(ImmutableMap.of("entity", entity))) {
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("my_titan:textures/25.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -18, posY + 68, 0, 0, 52, 15, 52, 15);
				}
				if (Killme26Procedure.executeProcedure(ImmutableMap.of("entity", entity))) {
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("my_titan:textures/26.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -18, posY + 68, 0, 0, 52, 15, 52, 15);
				}
				if (Killme27Procedure.executeProcedure(ImmutableMap.of("entity", entity))) {
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("my_titan:textures/27.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -18, posY + 68, 0, 0, 52, 15, 52, 15);
				}
				if (Killme28Procedure.executeProcedure(ImmutableMap.of("entity", entity))) {
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("my_titan:textures/28.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -18, posY + 68, 0, 0, 52, 15, 52, 15);
				}
				if (Killme29Procedure.executeProcedure(ImmutableMap.of("entity", entity))) {
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("my_titan:textures/29.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -18, posY + 68, 0, 0, 52, 15, 52, 15);
				}
				if (Killme30Procedure.executeProcedure(ImmutableMap.of("entity", entity))) {
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("my_titan:textures/30.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -18, posY + 68, 0, 0, 52, 15, 52, 15);
				}
				if (Killme31Procedure.executeProcedure(ImmutableMap.of("entity", entity))) {
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("my_titan:textures/31.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -18, posY + 68, 0, 0, 52, 15, 52, 15);
				}
				if (Killme32Procedure.executeProcedure(ImmutableMap.of("entity", entity))) {
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("my_titan:textures/32.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -18, posY + 68, 0, 0, 52, 15, 52, 15);
				}
				if (Killme33Procedure.executeProcedure(ImmutableMap.of("entity", entity))) {
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("my_titan:textures/33.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -18, posY + 68, 0, 0, 52, 15, 52, 15);
				}
				if (Killme34Procedure.executeProcedure(ImmutableMap.of("entity", entity))) {
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("my_titan:textures/34.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -18, posY + 68, 0, 0, 52, 15, 52, 15);
				}
				if (Killme35Procedure.executeProcedure(ImmutableMap.of("entity", entity))) {
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("my_titan:textures/35.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -18, posY + 68, 0, 0, 52, 15, 52, 15);
				}
				if (Killme36Procedure.executeProcedure(ImmutableMap.of("entity", entity))) {
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("my_titan:textures/36.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -18, posY + 68, 0, 0, 52, 15, 52, 15);
				}
				if (Killme37Procedure.executeProcedure(ImmutableMap.of("entity", entity))) {
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("my_titan:textures/37.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -18, posY + 68, 0, 0, 52, 15, 52, 15);
				}
				if (Killme38Procedure.executeProcedure(ImmutableMap.of("entity", entity))) {
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("my_titan:textures/38.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -18, posY + 68, 0, 0, 52, 15, 52, 15);
				}
				if (Killme39Procedure.executeProcedure(ImmutableMap.of("entity", entity))) {
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("my_titan:textures/39.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -18, posY + 68, 0, 0, 52, 15, 52, 15);
				}
				if (Killme40Procedure.executeProcedure(ImmutableMap.of("entity", entity))) {
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("my_titan:textures/40.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -18, posY + 68, 0, 0, 52, 15, 52, 15);
				}
				if (Killme41Procedure.executeProcedure(ImmutableMap.of("entity", entity))) {
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("my_titan:textures/41.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -18, posY + 68, 0, 0, 52, 15, 52, 15);
				}
				if (Killme42Procedure.executeProcedure(ImmutableMap.of("entity", entity))) {
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("my_titan:textures/42.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -18, posY + 68, 0, 0, 52, 15, 52, 15);
				}
				if (Killme43Procedure.executeProcedure(ImmutableMap.of("entity", entity))) {
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("my_titan:textures/43.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -18, posY + 68, 0, 0, 52, 15, 52, 15);
				}
				if (Killme44Procedure.executeProcedure(ImmutableMap.of("entity", entity))) {
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("my_titan:textures/44.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -18, posY + 68, 0, 0, 52, 15, 52, 15);
				}
				if (Killme45Procedure.executeProcedure(ImmutableMap.of("entity", entity))) {
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("my_titan:textures/45.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -18, posY + 68, 0, 0, 52, 15, 52, 15);
				}
				if (Killme46Procedure.executeProcedure(ImmutableMap.of("entity", entity))) {
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("my_titan:textures/46.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -18, posY + 68, 0, 0, 52, 15, 52, 15);
				}
				if (Killme47Procedure.executeProcedure(ImmutableMap.of("entity", entity))) {
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("my_titan:textures/47.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -18, posY + 68, 0, 0, 52, 15, 52, 15);
				}
				if (Killme48Procedure.executeProcedure(ImmutableMap.of("entity", entity))) {
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("my_titan:textures/48.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -18, posY + 68, 0, 0, 52, 15, 52, 15);
				}
				if (Killme49Procedure.executeProcedure(ImmutableMap.of("entity", entity))) {
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("my_titan:textures/49.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -18, posY + 68, 0, 0, 52, 15, 52, 15);
				}
				if (Killme50Procedure.executeProcedure(ImmutableMap.of("entity", entity))) {
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("my_titan:textures/50.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -18, posY + 68, 0, 0, 52, 15, 52, 15);
				}
			}
			RenderSystem.depthMask(true);
			RenderSystem.enableDepthTest();
			RenderSystem.enableAlphaTest();
			RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
		}
	}
}
