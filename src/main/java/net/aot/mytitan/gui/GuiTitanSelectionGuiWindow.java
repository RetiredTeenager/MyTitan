
package net.aot.mytitan.gui;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.client.Minecraft;

import net.aot.mytitan.procedures.ProcedureWarhammerTitanIconProcedure;
import net.aot.mytitan.procedures.ProcedureJawTitanIconProcedure;
import net.aot.mytitan.procedures.ProcedureFoundingTitanIconProcedure;
import net.aot.mytitan.procedures.ProcedureFemaleTitanIconProcedure;
import net.aot.mytitan.procedures.ProcedureColossalTitanIconProcedure;
import net.aot.mytitan.procedures.ProcedureCartItanIconProcedure;
import net.aot.mytitan.procedures.ProcedureBeastTitanIconProcedure;
import net.aot.mytitan.procedures.ProcedureAttackTitanIconProcedure;
import net.aot.mytitan.procedures.ProcedureArmoredTitanIconProcedure;
import net.aot.mytitan.MyTitanMod;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.matrix.MatrixStack;

import com.google.common.collect.ImmutableMap;

@OnlyIn(Dist.CLIENT)
public class GuiTitanSelectionGuiWindow extends ContainerScreen<GuiTitanSelectionGui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	public GuiTitanSelectionGuiWindow(GuiTitanSelectionGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 250;
		this.ySize = 200;
	}

	@Override
	public void render(MatrixStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderHoveredTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(MatrixStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.color4f(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("my_titan:textures/titans3.png"));
		this.blit(ms, this.guiLeft + 25, this.guiTop + 6, 0, 0, 32, 32, 32, 32);
		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("my_titan:textures/titans14.png"));
		this.blit(ms, this.guiLeft + 106, this.guiTop + 6, 0, 0, 32, 32, 32, 32);
		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("my_titan:textures/titans10.png"));
		this.blit(ms, this.guiLeft + 25, this.guiTop + 69, 0, 0, 32, 32, 32, 32);
		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("my_titan:textures/titans6.png"));
		this.blit(ms, this.guiLeft + 106, this.guiTop + 69, 0, 0, 32, 32, 32, 32);
		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("my_titan:textures/titans8.png"));
		this.blit(ms, this.guiLeft + 187, this.guiTop + 69, 0, 0, 32, 32, 32, 32);
		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("my_titan:textures/titans16.png"));
		this.blit(ms, this.guiLeft + 25, this.guiTop + 132, 0, 0, 32, 32, 32, 32);
		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("my_titan:textures/titans19.png"));
		this.blit(ms, this.guiLeft + 106, this.guiTop + 132, 0, 0, 32, 32, 32, 32);
		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("my_titan:textures/titans12.png"));
		this.blit(ms, this.guiLeft + 187, this.guiTop + 132, 0, 0, 32, 32, 32, 32);
		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("my_titan:textures/4_27_2021_12_04_40_pm.png"));
		this.blit(ms, this.guiLeft + 187, this.guiTop + 6, 0, 0, 32, 32, 32, 32);
		if (ProcedureAttackTitanIconProcedure.executeProcedure(ImmutableMap.of("entity", entity))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("my_titan:textures/titans2.png"));
			this.blit(ms, this.guiLeft + 25, this.guiTop + 6, 0, 0, 32, 32, 32, 32);
		}
		if (ProcedureFemaleTitanIconProcedure.executeProcedure(ImmutableMap.of("entity", entity))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("my_titan:textures/titans13.png"));
			this.blit(ms, this.guiLeft + 106, this.guiTop + 6, 0, 0, 32, 32, 32, 32);
		}
		if (ProcedureArmoredTitanIconProcedure.executeProcedure(ImmutableMap.of("entity", entity))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("my_titan:textures/titans.png"));
			this.blit(ms, this.guiLeft + 187, this.guiTop + 6, 0, 0, 32, 32, 32, 32);
		}
		if (ProcedureCartItanIconProcedure.executeProcedure(ImmutableMap.of("entity", entity))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("my_titan:textures/titans9.png"));
			this.blit(ms, this.guiLeft + 25, this.guiTop + 69, 0, 0, 32, 32, 32, 32);
		}
		if (ProcedureBeastTitanIconProcedure.executeProcedure(ImmutableMap.of("entity", entity))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("my_titan:textures/titans5.png"));
			this.blit(ms, this.guiLeft + 106, this.guiTop + 69, 0, 0, 32, 32, 32, 32);
		}
		if (ProcedureColossalTitanIconProcedure.executeProcedure(ImmutableMap.of("entity", entity))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("my_titan:textures/titans7.png"));
			this.blit(ms, this.guiLeft + 187, this.guiTop + 69, 0, 0, 32, 32, 32, 32);
		}
		if (ProcedureJawTitanIconProcedure.executeProcedure(ImmutableMap.of("entity", entity))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("my_titan:textures/titans15.png"));
			this.blit(ms, this.guiLeft + 25, this.guiTop + 132, 0, 0, 32, 32, 32, 32);
		}
		if (ProcedureWarhammerTitanIconProcedure.executeProcedure(ImmutableMap.of("entity", entity))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("my_titan:textures/titans18.png"));
			this.blit(ms, this.guiLeft + 106, this.guiTop + 132, 0, 0, 32, 32, 32, 32);
		}
		if (ProcedureFoundingTitanIconProcedure.executeProcedure(ImmutableMap.of("entity", entity))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("my_titan:textures/titans11.png"));
			this.blit(ms, this.guiLeft + 187, this.guiTop + 132, 0, 0, 32, 32, 32, 32);
		}
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeScreen();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void tick() {
		super.tick();
	}

	@Override
	protected void drawGuiContainerForegroundLayer(MatrixStack ms, int mouseX, int mouseY) {
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardListener.enableRepeatEvents(false);
	}

	@Override
	public void init(Minecraft minecraft, int width, int height) {
		super.init(minecraft, width, height);
		minecraft.keyboardListener.enableRepeatEvents(true);
		this.addButton(new Button(this.guiLeft + 16, this.guiTop + 42, 50, 20, new StringTextComponent("Morph"), e -> {
			if (true) {
				MyTitanMod.PACKET_HANDLER.sendToServer(new GuiTitanSelectionGui.ButtonPressedMessage(0, x, y, z));
				GuiTitanSelectionGui.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 97, this.guiTop + 42, 50, 20, new StringTextComponent("Morph"), e -> {
			if (true) {
				MyTitanMod.PACKET_HANDLER.sendToServer(new GuiTitanSelectionGui.ButtonPressedMessage(1, x, y, z));
				GuiTitanSelectionGui.handleButtonAction(entity, 1, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 178, this.guiTop + 42, 50, 20, new StringTextComponent("Morph"), e -> {
			if (true) {
				MyTitanMod.PACKET_HANDLER.sendToServer(new GuiTitanSelectionGui.ButtonPressedMessage(2, x, y, z));
				GuiTitanSelectionGui.handleButtonAction(entity, 2, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 16, this.guiTop + 105, 50, 20, new StringTextComponent("Morph"), e -> {
			if (true) {
				MyTitanMod.PACKET_HANDLER.sendToServer(new GuiTitanSelectionGui.ButtonPressedMessage(3, x, y, z));
				GuiTitanSelectionGui.handleButtonAction(entity, 3, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 97, this.guiTop + 105, 50, 20, new StringTextComponent("Morph"), e -> {
			if (true) {
				MyTitanMod.PACKET_HANDLER.sendToServer(new GuiTitanSelectionGui.ButtonPressedMessage(4, x, y, z));
				GuiTitanSelectionGui.handleButtonAction(entity, 4, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 178, this.guiTop + 105, 50, 20, new StringTextComponent("Morph"), e -> {
			if (true) {
				MyTitanMod.PACKET_HANDLER.sendToServer(new GuiTitanSelectionGui.ButtonPressedMessage(5, x, y, z));
				GuiTitanSelectionGui.handleButtonAction(entity, 5, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 16, this.guiTop + 168, 50, 20, new StringTextComponent("Morph"), e -> {
			if (true) {
				MyTitanMod.PACKET_HANDLER.sendToServer(new GuiTitanSelectionGui.ButtonPressedMessage(6, x, y, z));
				GuiTitanSelectionGui.handleButtonAction(entity, 6, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 97, this.guiTop + 168, 50, 20, new StringTextComponent("Morph"), e -> {
			if (true) {
				MyTitanMod.PACKET_HANDLER.sendToServer(new GuiTitanSelectionGui.ButtonPressedMessage(7, x, y, z));
				GuiTitanSelectionGui.handleButtonAction(entity, 7, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 178, this.guiTop + 168, 50, 20, new StringTextComponent("Morph"), e -> {
			if (true) {
				MyTitanMod.PACKET_HANDLER.sendToServer(new GuiTitanSelectionGui.ButtonPressedMessage(8, x, y, z));
				GuiTitanSelectionGui.handleButtonAction(entity, 8, x, y, z);
			}
		}));
	}
}
