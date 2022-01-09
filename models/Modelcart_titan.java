// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class Modelcart_titan extends EntityModel<Entity> {
	private final ModelRenderer mainbody;
	private final ModelRenderer leftleg;
	private final ModelRenderer upperleftleg;
	private final ModelRenderer leftlowerlegs;
	private final ModelRenderer lfoot;
	private final ModelRenderer lfoot3;
	private final ModelRenderer rightleg;
	private final ModelRenderer upperrightleg;
	private final ModelRenderer rightlowerlegs;
	private final ModelRenderer lfoot2;
	private final ModelRenderer lfoot4;
	private final ModelRenderer lfoot_r5;
	private final ModelRenderer lfoot_r6;
	private final ModelRenderer lfoot_r7;
	private final ModelRenderer lfoot_r8;
	private final ModelRenderer torso;
	private final ModelRenderer movy;
	private final ModelRenderer movy_r1;
	private final ModelRenderer movy_r2;
	private final ModelRenderer yes_r1;
	private final ModelRenderer yes_r2;
	private final ModelRenderer yes_r3;
	private final ModelRenderer yes_r4;
	private final ModelRenderer yes_r5;
	private final ModelRenderer yes_r6;
	private final ModelRenderer yes_r7;
	private final ModelRenderer yes_r8;
	private final ModelRenderer movy2;
	private final ModelRenderer movy_r3;
	private final ModelRenderer movy_r4;
	private final ModelRenderer yes_r9;
	private final ModelRenderer yes_r10;
	private final ModelRenderer yes_r11;
	private final ModelRenderer yes_r12;
	private final ModelRenderer yes_r13;
	private final ModelRenderer yes_r14;
	private final ModelRenderer yes_r15;
	private final ModelRenderer yes_r16;
	private final ModelRenderer yesr_17;
	private final ModelRenderer shoulders;
	private final ModelRenderer shouldermomento;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r20;
	private final ModelRenderer cube_r13_r1;
	private final ModelRenderer cube_r12_r1;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r20_r1;
	private final ModelRenderer cube_r20_r2;
	private final ModelRenderer cube_r19_r1;
	private final ModelRenderer cube_r18_r1;
	private final ModelRenderer cube_r17_r1;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r21_r1;
	private final ModelRenderer cube_r21_r2;
	private final ModelRenderer cube_r20_r3;
	private final ModelRenderer cube_r20_r4;
	private final ModelRenderer cube_r19_r2;
	private final ModelRenderer cube_r18_r2;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r22_r1;
	private final ModelRenderer cube_r22_r2;
	private final ModelRenderer cube_r21_r4;
	private final ModelRenderer cube_r20_r5;
	private final ModelRenderer cube_r19_r3;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r22_r4;
	private final ModelRenderer cube_r22_r5;
	private final ModelRenderer cube_r21_r3;
	private final ModelRenderer cube_r20_r7;
	private final ModelRenderer cube_r19_r4;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r22_r6;
	private final ModelRenderer cube_r22_r7;
	private final ModelRenderer cube_r21_r6;
	private final ModelRenderer cube_r20_r8;
	private final ModelRenderer cube_r19_r5;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r22_r8;
	private final ModelRenderer cube_r22_r9;
	private final ModelRenderer cube_r21_r7;
	private final ModelRenderer cube_r20_r9;
	private final ModelRenderer cube_r19_r6;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r23_r1;
	private final ModelRenderer cube_r23_r2;
	private final ModelRenderer cube_r22_r3;
	private final ModelRenderer cube_r21_r5;
	private final ModelRenderer cube_r20_r6;
	private final ModelRenderer arms;
	private final ModelRenderer rarm;
	private final ModelRenderer rshoulderarm;
	private final ModelRenderer rshoulderarea;
	private final ModelRenderer rforearm;
	private final ModelRenderer rforearm2;
	private final ModelRenderer larm;
	private final ModelRenderer lshoulderarm;
	private final ModelRenderer lshoulderarm2;
	private final ModelRenderer lforearm;
	private final ModelRenderer lforearm_r3;
	private final ModelRenderer head;
	private final ModelRenderer tophead;
	private final ModelRenderer bone;
	private final ModelRenderer bone2;
	private final ModelRenderer bone3;
	private final ModelRenderer bone6;
	private final ModelRenderer bone7;
	private final ModelRenderer bone8;
	private final ModelRenderer bone9;
	private final ModelRenderer bone10;
	private final ModelRenderer bone11;
	private final ModelRenderer bone15;
	private final ModelRenderer bone16;
	private final ModelRenderer bone19;
	private final ModelRenderer bone20;
	private final ModelRenderer bone21;
	private final ModelRenderer bone22;
	private final ModelRenderer bone23;
	private final ModelRenderer bone24;
	private final ModelRenderer bone4;
	private final ModelRenderer bone25;
	private final ModelRenderer bone28;
	private final ModelRenderer bone29;
	private final ModelRenderer bone17;
	private final ModelRenderer bone30;
	private final ModelRenderer bone32;
	private final ModelRenderer bone5;
	private final ModelRenderer bone33;
	private final ModelRenderer bone34;
	private final ModelRenderer bone35;
	private final ModelRenderer bone36;
	private final ModelRenderer bone37;
	private final ModelRenderer bone38;
	private final ModelRenderer bone39;
	private final ModelRenderer bone42;
	private final ModelRenderer bone43;
	private final ModelRenderer bone44;
	private final ModelRenderer bone49;
	private final ModelRenderer bone50;
	private final ModelRenderer bone51;
	private final ModelRenderer bone52;
	private final ModelRenderer bone53;
	private final ModelRenderer bone54;
	private final ModelRenderer bone55;
	private final ModelRenderer bone56;
	private final ModelRenderer bottomhead;
	private final ModelRenderer bone60;
	private final ModelRenderer bone61;
	private final ModelRenderer bone62;
	private final ModelRenderer bone63;
	private final ModelRenderer bone64;
	private final ModelRenderer bone65;
	private final ModelRenderer bone66;
	private final ModelRenderer bone74;
	private final ModelRenderer bone72;
	private final ModelRenderer bone73;
	private final ModelRenderer bone71;
	private final ModelRenderer bone70;
	private final ModelRenderer bone69;
	private final ModelRenderer bone68;
	private final ModelRenderer bone67;

	public Modelcart_titan() {
		textureWidth = 1024;
		textureHeight = 1024;

		mainbody = new ModelRenderer(this);
		mainbody.setRotationPoint(0.0F, -50.0F, 31.0F);

		leftleg = new ModelRenderer(this);
		leftleg.setRotationPoint(15.0F, 10.0F, 80.0F);
		mainbody.addChild(leftleg);
		setRotationAngle(leftleg, -0.48F, 0.0F, 0.0F);

		upperleftleg = new ModelRenderer(this);
		upperleftleg.setRotationPoint(-10.076F, -24.2467F, -1.0194F);
		leftleg.addChild(upperleftleg);
		setRotationAngle(upperleftleg, 0.0F, 0.0F, -0.0873F);
		upperleftleg.setTextureOffset(84, 216).addBox(-0.7888F, 12.867F, -5.3148F, 21.0F, 45.0F, 15.0F, 0.0F, false);
		upperleftleg.setTextureOffset(36, 417).addBox(-2.2888F, 17.0857F, -3.8148F, 3.0F, 45.0F, 15.0F, 0.0F, false);
		upperleftleg.setTextureOffset(296, 523).addBox(2.5556F, 20.4607F, -7.1796F, 15.0F, 25.0F, 3.0F, 0.0F, false);
		upperleftleg.setTextureOffset(370, 499).addBox(-3.0388F, 17.0857F, -3.0648F, 3.0F, 25.0F, 14.0F, 0.0F, false);
		upperleftleg.setTextureOffset(117, 511).addBox(19.4515F, 36.5652F, -2.3148F, 3.0F, 25.0F, 12.0F, 0.0F, false);
		upperleftleg.setTextureOffset(260, 523).addBox(2.5556F, 22.9919F, 10.8204F, 15.0F, 25.0F, 3.0F, 0.0F, false);
		upperleftleg.setTextureOffset(271, 451).addBox(1.0556F, 17.0857F, 9.3204F, 18.0F, 45.0F, 3.0F, 0.0F, false);
		upperleftleg.setTextureOffset(0, 417).addBox(18.7112F, 17.0857F, -3.8148F, 3.0F, 45.0F, 15.0F, 0.0F, false);
		upperleftleg.setTextureOffset(140, 389).addBox(-0.7888F, 52.492F, -4.8148F, 21.0F, 12.0F, 16.0F, 0.0F, false);
		upperleftleg.setTextureOffset(224, 523).addBox(2.5556F, 20.4607F, -7.1796F, 15.0F, 25.0F, 3.0F, 0.0F, false);

		leftlowerlegs = new ModelRenderer(this);
		leftlowerlegs.setRotationPoint(3.5F, 32.4192F, 14.0887F);
		leftleg.addChild(leftlowerlegs);
		setRotationAngle(leftlowerlegs, 1.5708F, 0.0F, 0.0F);
		leftlowerlegs.setTextureOffset(392, 455).addBox(-12.8648F, -4.0625F, -2.2296F, 3.0F, 29.0F, 15.0F, 0.0F, false);
		leftlowerlegs.setTextureOffset(72, 451).addBox(8.1352F, -5.75F, -2.2296F, 3.0F, 33.0F, 15.0F, 0.0F, false);
		leftlowerlegs.setTextureOffset(498, 270).addBox(8.8852F, 2.125F, -2.2296F, 3.0F, 20.0F, 15.0F, 0.0F, false);
		leftlowerlegs.setTextureOffset(177, 533).addBox(-8.0204F, -1.8125F, 12.3852F, 15.0F, 20.0F, 3.0F, 0.0F, false);
		leftlowerlegs.setTextureOffset(531, 96).addBox(-8.0204F, 1.0F, -4.8648F, 15.0F, 20.0F, 3.0F, 0.0F, false);
		leftlowerlegs.setTextureOffset(147, 526).addBox(-13.6148F, 0.4375F, -0.7296F, 3.0F, 20.0F, 12.0F, 0.0F, false);
		leftlowerlegs.setTextureOffset(492, 194).addBox(-9.5204F, -4.0625F, -3.3648F, 18.0F, 29.0F, 3.0F, 0.0F, false);
		leftlowerlegs.setTextureOffset(420, 240).addBox(-11.3648F, -8.0F, -2.2701F, 21.0F, 6.0F, 15.0F, 0.0F, false);
		leftlowerlegs.setTextureOffset(348, 282).addBox(-11.3648F, -17.0F, -5.2701F, 21.0F, 9.0F, 18.0F, 0.0F, false);
		leftlowerlegs.setTextureOffset(333, 39).addBox(-11.3648F, -1.25F, -2.2701F, 21.0F, 20.0F, 15.0F, 0.0F, false);

		lfoot = new ModelRenderer(this);
		lfoot.setRotationPoint(0.0F, 56.0F, 3.0F);
		leftlowerlegs.addChild(lfoot);
		lfoot.setTextureOffset(360, 0).addBox(-10.6352F, -37.0F, -5.2701F, 21.0F, 18.0F, 15.0F, 0.0F, false);
		lfoot.setTextureOffset(276, 382).addBox(-10.6352F, -25.75F, -12.5333F, 21.0F, 6.0F, 7.0F, 0.0F, false);

		lfoot3 = new ModelRenderer(this);
		lfoot3.setRotationPoint(-0.1352F, -30.956F, -17.0807F);
		lfoot.addChild(lfoot3);
		setRotationAngle(lfoot3, -0.7854F, 0.0F, 0.0F);
		lfoot3.setTextureOffset(363, 102).addBox(-10.5F, -2.7736F, -6.5926F, 21.0F, 8.0F, 18.0F, 0.0F, false);
		lfoot3.setTextureOffset(156, 363).addBox(-10.5F, -2.7736F, -6.5926F, 21.0F, 8.0F, 18.0F, 0.0F, false);

		rightleg = new ModelRenderer(this);
		rightleg.setRotationPoint(-15.0F, 10.0F, 80.0F);
		mainbody.addChild(rightleg);
		setRotationAngle(rightleg, -0.48F, 0.0F, 0.0F);

		upperrightleg = new ModelRenderer(this);
		upperrightleg.setRotationPoint(10.076F, -24.2467F, -1.0194F);
		rightleg.addChild(upperrightleg);
		setRotationAngle(upperrightleg, 0.0F, 0.0F, 0.0873F);
		upperrightleg.setTextureOffset(196, 196).addBox(-20.2112F, 12.867F, -5.3148F, 21.0F, 45.0F, 15.0F, 0.0F, false);
		upperrightleg.setTextureOffset(235, 412).addBox(-0.7112F, 17.0857F, -3.8148F, 3.0F, 45.0F, 15.0F, 0.0F, false);
		upperrightleg.setTextureOffset(522, 27).addBox(-17.5556F, 20.4607F, -7.1796F, 15.0F, 25.0F, 3.0F, 0.0F, false);
		upperrightleg.setTextureOffset(486, 497).addBox(0.0388F, 17.0857F, -3.0648F, 3.0F, 25.0F, 14.0F, 0.0F, false);
		upperrightleg.setTextureOffset(216, 256).addBox(-22.4515F, 36.5652F, -2.3148F, 3.0F, 25.0F, 12.0F, 0.0F, false);
		upperrightleg.setTextureOffset(520, 520).addBox(-17.5556F, 22.9919F, 10.8204F, 15.0F, 25.0F, 3.0F, 0.0F, false);
		upperrightleg.setTextureOffset(146, 417).addBox(-19.0556F, 17.0857F, 9.3204F, 18.0F, 45.0F, 3.0F, 0.0F, false);
		upperrightleg.setTextureOffset(199, 412).addBox(-21.7112F, 17.0857F, -3.8148F, 3.0F, 45.0F, 15.0F, 0.0F, false);
		upperrightleg.setTextureOffset(0, 389).addBox(-20.2112F, 52.492F, -4.8148F, 21.0F, 12.0F, 16.0F, 0.0F, false);
		upperrightleg.setTextureOffset(116, 276).addBox(-17.5556F, 20.4607F, -7.1796F, 15.0F, 25.0F, 3.0F, 0.0F, false);

		rightlowerlegs = new ModelRenderer(this);
		rightlowerlegs.setRotationPoint(-3.5F, 32.4192F, 14.0887F);
		rightleg.addChild(rightlowerlegs);
		setRotationAngle(rightlowerlegs, 1.5708F, 0.0F, 0.0F);
		rightlowerlegs.setTextureOffset(356, 455).addBox(9.8648F, -4.0625F, -2.2296F, 3.0F, 29.0F, 15.0F, 0.0F, false);
		rightlowerlegs.setTextureOffset(320, 444).addBox(-11.1352F, -5.75F, -2.2296F, 3.0F, 33.0F, 15.0F, 0.0F, false);
		rightlowerlegs.setTextureOffset(497, 360).addBox(-11.8852F, 2.125F, -2.2296F, 3.0F, 20.0F, 15.0F, 0.0F, false);
		rightlowerlegs.setTextureOffset(332, 529).addBox(-6.9796F, -1.8125F, 12.3852F, 15.0F, 20.0F, 3.0F, 0.0F, false);
		rightlowerlegs.setTextureOffset(319, 340).addBox(-6.9796F, 1.0F, -4.8648F, 15.0F, 20.0F, 3.0F, 0.0F, false);
		rightlowerlegs.setTextureOffset(87, 523).addBox(10.6148F, 0.4375F, -0.7296F, 3.0F, 20.0F, 12.0F, 0.0F, false);
		rightlowerlegs.setTextureOffset(491, 451).addBox(-8.4796F, -4.0625F, -3.3648F, 18.0F, 29.0F, 3.0F, 0.0F, false);
		rightlowerlegs.setTextureOffset(413, 360).addBox(-9.6352F, -8.0F, -2.2701F, 21.0F, 6.0F, 15.0F, 0.0F, false);
		rightlowerlegs.setTextureOffset(348, 75).addBox(-9.6352F, -17.0F, -5.2701F, 21.0F, 9.0F, 18.0F, 0.0F, false);
		rightlowerlegs.setTextureOffset(331, 187).addBox(-9.6352F, -1.25F, -2.2701F, 21.0F, 20.0F, 15.0F, 0.0F, false);

		lfoot2 = new ModelRenderer(this);
		lfoot2.setRotationPoint(0.0F, 56.0F, 3.0F);
		rightlowerlegs.addChild(lfoot2);
		lfoot2.setTextureOffset(156, 106).addBox(-10.6352F, -25.75F, -12.5333F, 21.0F, 6.0F, 7.0F, 0.0F, false);
		lfoot2.setTextureOffset(227, 348).addBox(-10.3648F, -37.0F, -5.2701F, 21.0F, 18.0F, 15.0F, 0.0F, false);

		lfoot4 = new ModelRenderer(this);
		lfoot4.setRotationPoint(36.8648F, -30.956F, -17.0807F);
		lfoot2.addChild(lfoot4);
		setRotationAngle(lfoot4, -0.7854F, 0.0F, 0.0F);
		lfoot4.setTextureOffset(360, 248).addBox(-47.5F, -2.7736F, -6.5926F, 21.0F, 8.0F, 18.0F, 0.0F, false);
		lfoot4.setTextureOffset(354, 222).addBox(-47.5F, -2.7736F, -6.5926F, 21.0F, 8.0F, 18.0F, 0.0F, false);

		lfoot_r5 = new ModelRenderer(this);
		lfoot_r5.setRotationPoint(-11.1148F, 9.5F, -29.2701F);
		lfoot2.addChild(lfoot_r5);
		setRotationAngle(lfoot_r5, 0.0F, 0.3491F, 0.0F);

		lfoot_r6 = new ModelRenderer(this);
		lfoot_r6.setRotationPoint(0.1352F, 6.5F, -26.2701F);
		lfoot2.addChild(lfoot_r6);
		setRotationAngle(lfoot_r6, 0.5672F, 0.0F, 0.0F);

		lfoot_r7 = new ModelRenderer(this);
		lfoot_r7.setRotationPoint(9.1352F, 6.5F, -52.0F);
		lfoot2.addChild(lfoot_r7);
		setRotationAngle(lfoot_r7, 0.2182F, 0.3491F, 0.0F);

		lfoot_r8 = new ModelRenderer(this);
		lfoot_r8.setRotationPoint(0.1352F, 6.5F, -24.7701F);
		lfoot2.addChild(lfoot_r8);
		setRotationAngle(lfoot_r8, 0.5672F, 0.0F, 0.0F);

		torso = new ModelRenderer(this);
		torso.setRotationPoint(0.0F, 10.0F, 80.0F);
		mainbody.addChild(torso);
		setRotationAngle(torso, 1.5708F, 0.0F, 0.0F);
		torso.setTextureOffset(0, 0).addBox(-37.5F, -97.0F, -6.0F, 75.0F, 49.0F, 21.0F, 0.0F, false);
		torso.setTextureOffset(0, 70).addBox(-28.5F, -48.0F, -6.0F, 57.0F, 48.0F, 21.0F, 0.0F, false);

		movy = new ModelRenderer(this);
		movy.setRotationPoint(-3.0F, 71.5F, -4.75F);
		torso.addChild(movy);
		movy.setTextureOffset(0, 178).addBox(-14.25F, -168.5F, -7.25F, 36.0F, 49.0F, 6.0F, 0.0F, false);
		movy.setTextureOffset(110, 407).addBox(-1.3963F, -122.0305F, 16.75F, 8.0F, 50.0F, 10.0F, 0.0F, false);
		movy.setTextureOffset(74, 391).addBox(-1.5F, -122.5F, -8.25F, 9.0F, 51.0F, 9.0F, 0.0F, false);

		movy_r1 = new ModelRenderer(this);
		movy_r1.setRotationPoint(29.25F, -143.5F, 0.25F);
		movy.addChild(movy_r1);
		setRotationAngle(movy_r1, 0.0F, -0.2618F, 0.0F);
		movy_r1.setTextureOffset(54, 333).addBox(-10.5F, -25.0F, -4.5F, 21.0F, 49.0F, 6.0F, 0.0F, false);

		movy_r2 = new ModelRenderer(this);
		movy_r2.setRotationPoint(-23.25F, -143.5F, 0.25F);
		movy.addChild(movy_r2);
		setRotationAngle(movy_r2, 0.0F, 0.2618F, 0.0F);
		movy_r2.setTextureOffset(323, 132).addBox(-10.5F, -25.0F, -4.5F, 21.0F, 49.0F, 6.0F, 0.0F, false);

		yes_r1 = new ModelRenderer(this);
		yes_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		movy.addChild(yes_r1);
		setRotationAngle(yes_r1, 0.0F, 0.1309F, -0.1745F);
		yes_r1.setTextureOffset(335, 397).addBox(-4.018F, -120.9001F, -4.9741F, 24.0F, 45.0F, 2.0F, 0.0F, false);

		yes_r2 = new ModelRenderer(this);
		yes_r2.setRotationPoint(4.75F, -0.25F, 0.0F);
		movy.addChild(yes_r2);
		setRotationAngle(yes_r2, 0.0F, -0.1309F, 0.1745F);
		yes_r2.setTextureOffset(108, 343).addBox(-17.6818F, -120.5182F, -3.7865F, 15.0F, 48.0F, 9.0F, 0.0F, false);
		yes_r2.setTextureOffset(253, 154).addBox(-19.4347F, -120.8709F, -5.7626F, 26.0F, 46.0F, 9.0F, 0.0F, false);

		yes_r3 = new ModelRenderer(this);
		yes_r3.setRotationPoint(5.75F, -1.25F, 6.25F);
		movy.addChild(yes_r3);
		setRotationAngle(yes_r3, 0.0F, 0.0F, 0.1745F);
		yes_r3.setTextureOffset(156, 235).addBox(4.9109F, -122.5182F, -7.5F, 9.0F, 48.0F, 21.0F, 0.0F, false);

		yes_r4 = new ModelRenderer(this);
		yes_r4.setRotationPoint(10.75F, 0.0F, 1.25F);
		movy.addChild(yes_r4);
		setRotationAngle(yes_r4, 0.0F, -0.2618F, 0.1745F);

		yes_r5 = new ModelRenderer(this);
		yes_r5.setRotationPoint(-4.75F, 0.0F, 1.25F);
		movy.addChild(yes_r5);
		setRotationAngle(yes_r5, 0.0F, 0.2618F, -0.1745F);

		yes_r6 = new ModelRenderer(this);
		yes_r6.setRotationPoint(-4.75F, -0.25F, 6.25F);
		movy.addChild(yes_r6);
		setRotationAngle(yes_r6, 0.0F, 0.0F, -0.1745F);
		yes_r6.setTextureOffset(0, 233).addBox(-8.5637F, -122.4878F, -7.5F, 9.0F, 48.0F, 21.0F, 0.0F, false);

		yes_r7 = new ModelRenderer(this);
		yes_r7.setRotationPoint(8.0F, 7.5F, 2.75F);
		movy.addChild(yes_r7);
		setRotationAngle(yes_r7, 0.0F, -0.2618F, 0.0F);
		yes_r7.setTextureOffset(450, 34).addBox(-3.5F, -85.0F, -8.5F, 27.0F, 6.0F, 9.0F, 0.0F, false);

		yes_r8 = new ModelRenderer(this);
		yes_r8.setRotationPoint(-2.0F, 7.5F, 2.75F);
		movy.addChild(yes_r8);
		setRotationAngle(yes_r8, 0.0F, 0.2618F, 0.0F);
		yes_r8.setTextureOffset(450, 19).addBox(-23.5F, -85.0F, -8.5F, 27.0F, 6.0F, 9.0F, 0.0F, false);

		movy2 = new ModelRenderer(this);
		movy2.setRotationPoint(15.0F, 71.5F, 37.25F);
		torso.addChild(movy2);
		setRotationAngle(movy2, 0.0F, 3.1416F, 0.0F);
		movy2.setTextureOffset(112, 161).addBox(-2.25F, -168.5F, 16.75F, 36.0F, 49.0F, 6.0F, 0.0F, false);
		movy2.setTextureOffset(462, 49).addBox(10.5F, -77.3713F, 40.799F, 9.0F, 6.0F, 9.0F, 0.0F, false);
		movy2.setTextureOffset(446, 511).addBox(10.5F, -122.3713F, 40.049F, 9.0F, 24.0F, 9.0F, 0.0F, false);

		movy_r3 = new ModelRenderer(this);
		movy_r3.setRotationPoint(41.25F, -143.5F, 24.25F);
		movy2.addChild(movy_r3);
		setRotationAngle(movy_r3, 0.0F, -0.2618F, 0.0F);
		movy_r3.setTextureOffset(306, 245).addBox(-10.5F, -25.0F, -4.5F, 21.0F, 49.0F, 6.0F, 0.0F, false);

		movy_r4 = new ModelRenderer(this);
		movy_r4.setRotationPoint(-11.25F, -143.5F, 24.25F);
		movy2.addChild(movy_r4);
		setRotationAngle(movy_r4, 0.0F, 0.2618F, 0.0F);
		movy_r4.setTextureOffset(188, 304).addBox(-10.5F, -25.0F, -4.5F, 21.0F, 49.0F, 6.0F, 0.0F, false);

		yes_r9 = new ModelRenderer(this);
		yes_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
		movy2.addChild(yes_r9);
		setRotationAngle(yes_r9, 0.0F, 0.1309F, -0.1745F);
		yes_r9.setTextureOffset(414, 188).addBox(16.1864F, -118.0758F, 19.0255F, 13.0F, 44.0F, 8.0F, 0.0F, false);

		yes_r10 = new ModelRenderer(this);
		yes_r10.setRotationPoint(4.75F, -0.25F, 0.0F);
		movy2.addChild(yes_r10);
		setRotationAngle(yes_r10, 0.0F, -0.1309F, 0.1745F);
		yes_r10.setTextureOffset(291, 396).addBox(-4.7259F, -122.4739F, 15.5813F, 14.0F, 47.0F, 8.0F, 0.0F, false);

		yes_r11 = new ModelRenderer(this);
		yes_r11.setRotationPoint(5.75F, -1.25F, 6.25F);
		movy2.addChild(yes_r11);
		setRotationAngle(yes_r11, 0.0F, 0.0F, 0.1745F);
		yes_r11.setTextureOffset(231, 85).addBox(16.5637F, -124.4878F, 16.5F, 9.0F, 48.0F, 21.0F, 0.0F, false);

		yes_r12 = new ModelRenderer(this);
		yes_r12.setRotationPoint(10.75F, 0.0F, 1.25F);
		movy2.addChild(yes_r12);
		setRotationAngle(yes_r12, 0.0F, -0.2618F, 0.1745F);
		yes_r12.setTextureOffset(60, 276).addBox(5.0049F, -124.9435F, 15.3564F, 20.0F, 49.0F, 8.0F, 0.0F, false);

		yes_r13 = new ModelRenderer(this);
		yes_r13.setRotationPoint(-4.75F, 0.0F, 1.25F);
		movy2.addChild(yes_r13);
		setRotationAngle(yes_r13, 0.0F, 0.2618F, -0.1745F);
		yes_r13.setTextureOffset(0, 302).addBox(-2.43F, -120.7768F, 21.4737F, 20.0F, 48.0F, 7.0F, 0.0F, false);

		yes_r14 = new ModelRenderer(this);
		yes_r14.setRotationPoint(-4.75F, -0.25F, 6.25F);
		movy2.addChild(yes_r14);
		setRotationAngle(yes_r14, 0.0F, 0.0F, -0.1745F);
		yes_r14.setTextureOffset(248, 248).addBox(3.7527F, -120.3445F, 16.5F, 9.0F, 48.0F, 20.0F, 0.0F, false);

		yes_r15 = new ModelRenderer(this);
		yes_r15.setRotationPoint(8.0F, 7.5F, 2.75F);
		movy2.addChild(yes_r15);
		setRotationAngle(yes_r15, 0.0F, -0.2618F, 0.0F);
		yes_r15.setTextureOffset(483, 226).addBox(14.1347F, -85.0F, 8.7199F, 19.0F, 6.0F, 9.0F, 0.0F, false);

		yes_r16 = new ModelRenderer(this);
		yes_r16.setRotationPoint(-2.0F, 7.5F, 2.75F);
		movy2.addChild(yes_r16);
		setRotationAngle(yes_r16, 0.0F, 0.2618F, 0.0F);
		yes_r16.setTextureOffset(282, 39).addBox(-11.5F, -85.0F, 14.9046F, 20.0F, 6.0F, 9.0F, 0.0F, false);

		yesr_17 = new ModelRenderer(this);
		yesr_17.setRotationPoint(23.0F, -69.5F, 28.75F);
		movy2.addChild(yesr_17);

		shoulders = new ModelRenderer(this);
		shoulders.setRotationPoint(0.0F, 80.0F, 0.0F);
		torso.addChild(shoulders);

		shouldermomento = new ModelRenderer(this);
		shouldermomento.setRotationPoint(0.0F, -180.0F, 0.0F);
		shoulders.addChild(shouldermomento);
		shouldermomento.setTextureOffset(192, 36).addBox(-18.75F, -6.5F, -6.0F, 36.0F, 3.0F, 18.0F, 0.0F, false);
		shouldermomento.setTextureOffset(387, 397).addBox(-7.75F, -26.6736F, -5.0152F, 15.0F, 23.0F, 15.0F, 0.0F,
				false);
		shouldermomento.setTextureOffset(486, 49).addBox(-11.6552F, -7.821F, -5.6149F, 6.0F, 17.0F, 15.0F, 0.0F, false);
		shouldermomento.setTextureOffset(470, 343).addBox(5.6552F, -8.571F, -5.6149F, 6.0F, 17.0F, 15.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(26.25F, -0.5F, 3.0F);
		shouldermomento.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.48F);
		cube_r1.setTextureOffset(390, 33).addBox(-10.5F, -1.5F, -9.0F, 21.0F, 3.0F, 18.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-27.75F, -0.5F, 3.0F);
		shouldermomento.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.48F);
		cube_r2.setTextureOffset(383, 339).addBox(-10.5F, -1.5F, -9.0F, 21.0F, 3.0F, 18.0F, 0.0F, false);

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(-2.4F, 105.975F, 6.15F);
		shouldermomento.addChild(cube_r20);
		setRotationAngle(cube_r20, -2.3126F, 0.0F, 0.0F);

		cube_r13_r1 = new ModelRenderer(this);
		cube_r13_r1.setRotationPoint(3.6F, -280.597F, 113.735F);
		cube_r20.addChild(cube_r13_r1);
		setRotationAngle(cube_r13_r1, 1.7453F, 0.0F, 0.0F);
		cube_r13_r1.setTextureOffset(408, 75).addBox(-18.75F, -249.5206F, -326.4897F, 36.0F, 12.0F, 3.0F, 0.0F, false);

		cube_r12_r1 = new ModelRenderer(this);
		cube_r12_r1.setRotationPoint(1.2F, -307.3075F, 104.5539F);
		cube_r20.addChild(cube_r12_r1);
		setRotationAngle(cube_r12_r1, -0.1745F, 0.0F, 0.0F);
		cube_r12_r1.setTextureOffset(76, 139).addBox(-18.0F, 393.6891F, -122.9028F, 36.0F, 12.0F, 3.0F, 0.0F, false);
		cube_r12_r1.setTextureOffset(76, 154).addBox(-6.55F, 395.2434F, -122.9721F, 15.0F, 18.0F, 3.0F, 0.0F, false);
		cube_r12_r1.setTextureOffset(234, 57).addBox(-9.05F, 391.3474F, -105.3988F, 23.0F, 14.0F, 3.0F, 0.0F, false);

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-8.2634F, 144.5247F, 5.2993F);
		shouldermomento.addChild(cube_r13);

		cube_r20_r1 = new ModelRenderer(this);
		cube_r20_r1.setRotationPoint(-14.1062F, -143.2409F, -10.2907F);
		cube_r13.addChild(cube_r20_r1);
		setRotationAngle(cube_r20_r1, -0.4363F, 0.2618F, 0.0F);

		cube_r20_r2 = new ModelRenderer(this);
		cube_r20_r2.setRotationPoint(-23.8562F, -137.2409F, -10.2907F);
		cube_r13.addChild(cube_r20_r2);
		setRotationAngle(cube_r20_r2, -0.4363F, 0.2618F, 0.0F);

		cube_r19_r1 = new ModelRenderer(this);
		cube_r19_r1.setRotationPoint(-14.8562F, -143.2409F, -9.5407F);
		cube_r13.addChild(cube_r19_r1);
		setRotationAngle(cube_r19_r1, -0.4363F, 0.2618F, 0.0F);

		cube_r18_r1 = new ModelRenderer(this);
		cube_r18_r1.setRotationPoint(-12.6062F, -143.9909F, -10.2907F);
		cube_r13.addChild(cube_r18_r1);
		setRotationAngle(cube_r18_r1, -0.4363F, 0.2618F, 0.0F);

		cube_r17_r1 = new ModelRenderer(this);
		cube_r17_r1.setRotationPoint(-14.1062F, -142.4909F, -10.2907F);
		cube_r13.addChild(cube_r17_r1);
		setRotationAngle(cube_r17_r1, -0.4363F, 0.2618F, 0.0F);

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(8.2634F, 144.5247F, 5.2993F);
		shouldermomento.addChild(cube_r11);

		cube_r21_r1 = new ModelRenderer(this);
		cube_r21_r1.setRotationPoint(13.3562F, -143.2409F, -9.5407F);
		cube_r11.addChild(cube_r21_r1);
		setRotationAngle(cube_r21_r1, -0.4363F, -0.2618F, 0.0F);
		cube_r21_r1.setTextureOffset(190, 9).addBox(-7.5508F, -6.1685F, -2.623F, 6.0F, 3.0F, 3.0F, 0.0F, false);

		cube_r21_r2 = new ModelRenderer(this);
		cube_r21_r2.setRotationPoint(23.8562F, -137.2409F, -10.2907F);
		cube_r11.addChild(cube_r21_r2);
		setRotationAngle(cube_r21_r2, -0.4363F, -0.2618F, 0.0F);

		cube_r20_r3 = new ModelRenderer(this);
		cube_r20_r3.setRotationPoint(13.3562F, -143.2409F, -10.2907F);
		cube_r11.addChild(cube_r20_r3);
		setRotationAngle(cube_r20_r3, -0.4363F, -0.2618F, 0.0F);

		cube_r20_r4 = new ModelRenderer(this);
		cube_r20_r4.setRotationPoint(14.1062F, -143.2409F, -9.5407F);
		cube_r11.addChild(cube_r20_r4);
		setRotationAngle(cube_r20_r4, -0.4363F, -0.2618F, 0.0F);

		cube_r19_r2 = new ModelRenderer(this);
		cube_r19_r2.setRotationPoint(12.6062F, -143.9909F, -10.2907F);
		cube_r11.addChild(cube_r19_r2);
		setRotationAngle(cube_r19_r2, -0.4363F, -0.2618F, 0.0F);

		cube_r18_r2 = new ModelRenderer(this);
		cube_r18_r2.setRotationPoint(13.3562F, -142.4909F, -10.2907F);
		cube_r11.addChild(cube_r18_r2);
		setRotationAngle(cube_r18_r2, -0.4363F, -0.2618F, 0.0F);

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(7.4914F, 146.8996F, 4.0022F);
		shouldermomento.addChild(cube_r12);

		cube_r22_r1 = new ModelRenderer(this);
		cube_r22_r1.setRotationPoint(14.1282F, -145.6158F, 6.9893F);
		cube_r12.addChild(cube_r22_r1);
		setRotationAngle(cube_r22_r1, 0.4363F, 0.2618F, 0.0F);
		cube_r22_r1.setTextureOffset(209, 130).addBox(-5.5508F, -6.1685F, -0.377F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		cube_r22_r1.setTextureOffset(196, 206).addBox(-5.5508F, -6.1685F, -0.377F, 3.0F, 1.0F, 3.0F, 0.0F, false);

		cube_r22_r2 = new ModelRenderer(this);
		cube_r22_r2.setRotationPoint(24.6282F, -139.6158F, 6.9893F);
		cube_r12.addChild(cube_r22_r2);
		setRotationAngle(cube_r22_r2, 0.4363F, 0.2618F, 0.0F);
		cube_r22_r2.setTextureOffset(96, 205).addBox(-8.0868F, -8.4553F, -0.3608F, 3.0F, 7.0F, 3.0F, 0.0F, false);
		cube_r22_r2.setTextureOffset(84, 205).addBox(-8.0868F, -8.4553F, -0.3608F, 3.0F, 7.0F, 3.0F, 0.0F, false);

		cube_r21_r4 = new ModelRenderer(this);
		cube_r21_r4.setRotationPoint(17.8782F, -145.6158F, 6.2393F);
		cube_r12.addChild(cube_r21_r4);
		setRotationAngle(cube_r21_r4, 0.4363F, 0.2618F, 0.0F);
		cube_r21_r4.setTextureOffset(141, 216).addBox(-5.4677F, -3.7164F, -0.425F, 4.0F, 4.0F, 3.0F, 0.0F, false);
		cube_r21_r4.setTextureOffset(84, 215).addBox(-5.4677F, -3.7164F, -0.425F, 4.0F, 4.0F, 3.0F, 0.0F, false);

		cube_r20_r5 = new ModelRenderer(this);
		cube_r20_r5.setRotationPoint(14.1282F, -146.3658F, 6.9893F);
		cube_r12.addChild(cube_r20_r5);
		setRotationAngle(cube_r20_r5, 0.4363F, 0.2618F, 0.0F);
		cube_r20_r5.setTextureOffset(153, 70).addBox(-6.4677F, -3.9664F, -0.425F, 7.0F, 7.0F, 3.0F, 0.0F, false);
		cube_r20_r5.setTextureOffset(0, 80).addBox(-6.4677F, -3.9664F, -0.425F, 7.0F, 7.0F, 3.0F, 0.0F, false);

		cube_r19_r3 = new ModelRenderer(this);
		cube_r19_r3.setRotationPoint(14.8782F, -144.1158F, 6.9893F);
		cube_r12.addChild(cube_r19_r3);
		setRotationAngle(cube_r19_r3, 0.4363F, 0.2618F, 0.0F);
		cube_r19_r3.setTextureOffset(413, 381).addBox(-6.7119F, -1.4984F, -0.2111F, 14.0F, 6.0F, 3.0F, 0.0F, false);
		cube_r19_r3.setTextureOffset(256, 412).addBox(-6.7119F, -1.4984F, -0.2111F, 14.0F, 6.0F, 3.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-7.4914F, 146.8996F, 4.0022F);
		shouldermomento.addChild(cube_r3);

		cube_r22_r4 = new ModelRenderer(this);
		cube_r22_r4.setRotationPoint(-14.1282F, -145.6158F, 6.9893F);
		cube_r3.addChild(cube_r22_r4);
		setRotationAngle(cube_r22_r4, 0.4363F, -0.2618F, 0.0F);
		cube_r22_r4.setTextureOffset(201, 66).addBox(1.8008F, -6.1685F, -0.377F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		cube_r22_r4.setTextureOffset(192, 65).addBox(1.8008F, -6.1685F, -0.377F, 3.0F, 1.0F, 3.0F, 0.0F, false);

		cube_r22_r5 = new ModelRenderer(this);
		cube_r22_r5.setRotationPoint(-24.6282F, -139.6158F, 6.9893F);
		cube_r3.addChild(cube_r22_r5);
		setRotationAngle(cube_r22_r5, 0.4363F, -0.2618F, 0.0F);
		cube_r22_r5.setTextureOffset(196, 175).addBox(5.0868F, -8.4553F, -0.3608F, 3.0F, 7.0F, 3.0F, 0.0F, false);
		cube_r22_r5.setTextureOffset(196, 165).addBox(5.0868F, -8.4553F, -0.3608F, 3.0F, 7.0F, 3.0F, 0.0F, false);

		cube_r21_r3 = new ModelRenderer(this);
		cube_r21_r3.setRotationPoint(-17.8782F, -145.6158F, 6.2393F);
		cube_r3.addChild(cube_r21_r3);
		setRotationAngle(cube_r21_r3, 0.4363F, -0.2618F, 0.0F);
		cube_r21_r3.setTextureOffset(209, 123).addBox(1.2177F, -3.7164F, -0.425F, 4.0F, 4.0F, 3.0F, 0.0F, false);
		cube_r21_r3.setTextureOffset(208, 179).addBox(1.2177F, -3.7164F, -0.425F, 4.0F, 4.0F, 3.0F, 0.0F, false);

		cube_r20_r7 = new ModelRenderer(this);
		cube_r20_r7.setRotationPoint(-14.1282F, -146.3658F, 6.9893F);
		cube_r3.addChild(cube_r20_r7);
		setRotationAngle(cube_r20_r7, 0.4363F, -0.2618F, 0.0F);
		cube_r20_r7.setTextureOffset(0, 70).addBox(-0.5323F, -3.9664F, -0.425F, 7.0F, 7.0F, 3.0F, 0.0F, false);
		cube_r20_r7.setTextureOffset(0, 10).addBox(-0.5323F, -3.9664F, -0.425F, 7.0F, 7.0F, 3.0F, 0.0F, false);

		cube_r19_r4 = new ModelRenderer(this);
		cube_r19_r4.setRotationPoint(-14.8782F, -144.1158F, 6.9893F);
		cube_r3.addChild(cube_r19_r4);
		setRotationAngle(cube_r19_r4, 0.4363F, -0.2618F, 0.0F);
		cube_r19_r4.setTextureOffset(234, 74).addBox(-8.7881F, -1.4984F, -0.2111F, 15.0F, 6.0F, 3.0F, 0.0F, false);
		cube_r19_r4.setTextureOffset(363, 309).addBox(-7.7881F, -1.4984F, -0.2111F, 14.0F, 6.0F, 3.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-7.4914F, 146.8996F, 2.4978F);
		shouldermomento.addChild(cube_r4);

		cube_r22_r6 = new ModelRenderer(this);
		cube_r22_r6.setRotationPoint(-14.1282F, -145.6158F, -6.9893F);
		cube_r4.addChild(cube_r22_r6);
		setRotationAngle(cube_r22_r6, -0.4363F, 0.2618F, 0.0F);
		cube_r22_r6.setTextureOffset(192, 50).addBox(1.8008F, -6.1685F, -2.873F, 3.0F, 1.0F, 3.0F, 0.0F, false);

		cube_r22_r7 = new ModelRenderer(this);
		cube_r22_r7.setRotationPoint(-24.6282F, -139.6158F, -6.9893F);
		cube_r4.addChild(cube_r22_r7);
		setRotationAngle(cube_r22_r7, -0.4363F, 0.2618F, 0.0F);
		cube_r22_r7.setTextureOffset(196, 196).addBox(5.0868F, -8.4553F, -2.8892F, 3.0F, 7.0F, 3.0F, 0.0F, false);
		cube_r22_r7.setTextureOffset(97, 193).addBox(5.0868F, -8.4553F, -2.8892F, 3.0F, 7.0F, 3.0F, 0.0F, false);

		cube_r21_r6 = new ModelRenderer(this);
		cube_r21_r6.setRotationPoint(-17.8782F, -145.6158F, -6.2393F);
		cube_r4.addChild(cube_r21_r6);
		setRotationAngle(cube_r21_r6, -0.4363F, 0.2618F, 0.0F);
		cube_r21_r6.setTextureOffset(196, 143).addBox(1.2177F, -4.7164F, -2.575F, 7.0F, 5.0F, 3.0F, 0.0F, false);
		cube_r21_r6.setTextureOffset(208, 172).addBox(1.2177F, -3.7164F, -2.575F, 4.0F, 4.0F, 3.0F, 0.0F, false);

		cube_r20_r8 = new ModelRenderer(this);
		cube_r20_r8.setRotationPoint(-14.1282F, -146.3658F, -6.9893F);
		cube_r4.addChild(cube_r20_r8);
		setRotationAngle(cube_r20_r8, -0.4363F, 0.2618F, 0.0F);
		cube_r20_r8.setTextureOffset(192, 43).addBox(-0.5323F, -0.9664F, -2.575F, 6.0F, 4.0F, 3.0F, 0.0F, false);

		cube_r19_r5 = new ModelRenderer(this);
		cube_r19_r5.setRotationPoint(-14.8782F, -144.1158F, -6.9893F);
		cube_r4.addChild(cube_r19_r5);
		setRotationAngle(cube_r19_r5, -0.4363F, 0.2618F, 0.0F);
		cube_r19_r5.setTextureOffset(434, 132).addBox(-9.5381F, -1.4984F, -3.2889F, 16.0F, 5.0F, 3.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(7.4914F, 146.8996F, 1.9978F);
		shouldermomento.addChild(cube_r5);

		cube_r22_r8 = new ModelRenderer(this);
		cube_r22_r8.setRotationPoint(14.1282F, -145.6158F, -6.9893F);
		cube_r5.addChild(cube_r22_r8);
		setRotationAngle(cube_r22_r8, -0.4363F, -0.2618F, 0.0F);
		cube_r22_r8.setTextureOffset(171, 10).addBox(-5.5508F, -5.2622F, -2.4504F, 3.0F, 1.0F, 3.0F, 0.0F, false);

		cube_r22_r9 = new ModelRenderer(this);
		cube_r22_r9.setRotationPoint(24.6282F, -139.6158F, -6.9893F);
		cube_r5.addChild(cube_r22_r9);
		setRotationAngle(cube_r22_r9, -0.4363F, -0.2618F, 0.0F);
		cube_r22_r9.setTextureOffset(171, 0).addBox(-8.0868F, -7.549F, -2.4666F, 3.0F, 7.0F, 3.0F, 0.0F, false);
		cube_r22_r9.setTextureOffset(0, 151).addBox(-8.0868F, -7.549F, -2.4666F, 3.0F, 7.0F, 3.0F, 0.0F, false);

		cube_r21_r7 = new ModelRenderer(this);
		cube_r21_r7.setRotationPoint(17.8782F, -145.6158F, -6.2393F);
		cube_r5.addChild(cube_r21_r7);
		setRotationAngle(cube_r21_r7, -0.4363F, -0.2618F, 0.0F);
		cube_r21_r7.setTextureOffset(196, 135).addBox(-8.4677F, -3.8101F, -2.1524F, 7.0F, 5.0F, 3.0F, 0.0F, false);
		cube_r21_r7.setTextureOffset(208, 165).addBox(-5.4677F, -2.8101F, -2.1524F, 4.0F, 4.0F, 3.0F, 0.0F, false);

		cube_r20_r9 = new ModelRenderer(this);
		cube_r20_r9.setRotationPoint(14.1282F, -146.3658F, -6.9893F);
		cube_r5.addChild(cube_r20_r9);
		setRotationAngle(cube_r20_r9, -0.4363F, -0.2618F, 0.0F);
		cube_r20_r9.setTextureOffset(192, 36).addBox(-5.4677F, -0.0601F, -2.1524F, 6.0F, 4.0F, 3.0F, 0.0F, false);

		cube_r19_r6 = new ModelRenderer(this);
		cube_r19_r6.setRotationPoint(14.8782F, -144.1158F, -6.9893F);
		cube_r5.addChild(cube_r19_r6);
		setRotationAngle(cube_r19_r6, -0.4363F, -0.2618F, 0.0F);
		cube_r19_r6.setTextureOffset(360, 274).addBox(-6.7119F, -0.5921F, -2.8663F, 16.0F, 5.0F, 3.0F, 0.0F, false);

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-8.2634F, 144.5247F, -3.0493F);
		shouldermomento.addChild(cube_r14);

		cube_r23_r1 = new ModelRenderer(this);
		cube_r23_r1.setRotationPoint(-14.1062F, -143.2409F, 14.7907F);
		cube_r14.addChild(cube_r23_r1);
		setRotationAngle(cube_r23_r1, 0.4363F, -0.2618F, 0.0F);

		cube_r23_r2 = new ModelRenderer(this);
		cube_r23_r2.setRotationPoint(-23.8562F, -137.2409F, 14.7907F);
		cube_r14.addChild(cube_r23_r2);
		setRotationAngle(cube_r23_r2, 0.4363F, -0.2618F, 0.0F);

		cube_r22_r3 = new ModelRenderer(this);
		cube_r22_r3.setRotationPoint(-14.8562F, -143.2409F, 14.0407F);
		cube_r14.addChild(cube_r22_r3);
		setRotationAngle(cube_r22_r3, 0.4363F, -0.2618F, 0.0F);

		cube_r21_r5 = new ModelRenderer(this);
		cube_r21_r5.setRotationPoint(-12.6062F, -143.9909F, 14.7907F);
		cube_r14.addChild(cube_r21_r5);
		setRotationAngle(cube_r21_r5, 0.4363F, -0.2618F, 0.0F);

		cube_r20_r6 = new ModelRenderer(this);
		cube_r20_r6.setRotationPoint(-14.1062F, -142.4909F, 14.7907F);
		cube_r14.addChild(cube_r20_r6);
		setRotationAngle(cube_r20_r6, 0.4363F, -0.2618F, 0.0F);

		arms = new ModelRenderer(this);
		arms.setRotationPoint(0.0F, 31.0F, 0.0F);
		shoulders.addChild(arms);

		rarm = new ModelRenderer(this);
		rarm.setRotationPoint(43.0F, -211.0F, -16.0F);
		arms.addChild(rarm);
		setRotationAngle(rarm, -2.0508F, 0.0F, 0.0F);

		rshoulderarm = new ModelRenderer(this);
		rshoulderarm.setRotationPoint(9.6882F, 140.5427F, 1.1545F);
		rarm.addChild(rshoulderarm);
		setRotationAngle(rshoulderarm, 0.0F, 0.0F, -0.0873F);
		rshoulderarm.setTextureOffset(298, 484).addBox(0.251F, -137.7556F, -3.1025F, 3.0F, 24.0F, 15.0F, 0.0F, false);
		rshoulderarm.setTextureOffset(245, 484).addBox(0.251F, -137.7556F, -3.1025F, 3.0F, 24.0F, 15.0F, 0.0F, false);
		rshoulderarm.setTextureOffset(93, 484).addBox(21.251F, -137.7556F, -3.1025F, 3.0F, 24.0F, 15.0F, 0.0F, false);
		rshoulderarm.setTextureOffset(477, 246).addBox(21.251F, -137.7556F, -3.1025F, 3.0F, 24.0F, 15.0F, 0.0F, false);
		rshoulderarm.setTextureOffset(516, 127).addBox(22.001F, -138.8806F, -2.3525F, 3.0F, 15.0F, 14.0F, 0.0F, false);
		rshoulderarm.setTextureOffset(513, 0).addBox(3.5954F, -137.7556F, 10.0327F, 18.0F, 24.0F, 3.0F, 0.0F, false);
		rshoulderarm.setTextureOffset(404, 511).addBox(3.5954F, -137.7556F, 10.0327F, 18.0F, 24.0F, 3.0F, 0.0F, false);
		rshoulderarm.setTextureOffset(447, 401).addBox(1.751F, -114.5525F, -3.1025F, 21.0F, 4.0F, 15.0F, 0.0F, false);
		rshoulderarm.setTextureOffset(445, 143).addBox(1.751F, -114.5525F, -3.1025F, 21.0F, 4.0F, 15.0F, 0.0F, false);
		rshoulderarm.setTextureOffset(116, 304).addBox(1.751F, -139.865F, -4.6025F, 21.0F, 24.0F, 15.0F, 0.0F, false);
		rshoulderarm.setTextureOffset(291, 301).addBox(1.751F, -139.865F, -4.6025F, 21.0F, 24.0F, 15.0F, 0.0F, false);
		rshoulderarm.setTextureOffset(270, 57).addBox(0.6437F, -158.47F, -4.9281F, 23.0F, 19.0F, 17.0F, 0.0F, false);

		rshoulderarea = new ModelRenderer(this);
		rshoulderarea.setRotationPoint(13.3133F, -162.3335F, 3.353F);
		rshoulderarm.addChild(rshoulderarea);
		setRotationAngle(rshoulderarea, 0.1309F, 0.0F, 0.1745F);
		rshoulderarea.setTextureOffset(192, 0).addBox(-16.5F, -8.5F, -9.5F, 30.0F, 18.0F, 18.0F, 0.0F, false);

		rforearm = new ModelRenderer(this);
		rforearm.setRotationPoint(10.4826F, 27.0296F, 7.0922F);
		rarm.addChild(rforearm);
		setRotationAngle(rforearm, -0.6981F, 0.0F, 0.0F);
		rforearm.setTextureOffset(188, 496).addBox(11.3822F, 0.7742F, -7.5843F, 3.0F, 22.0F, 15.0F, 0.0F, false);
		rforearm.setTextureOffset(495, 81).addBox(11.3822F, 0.7742F, -7.5843F, 3.0F, 22.0F, 15.0F, 0.0F, false);
		rforearm.setTextureOffset(36, 477).addBox(-9.6178F, 0.6335F, -7.5843F, 3.0F, 24.0F, 15.0F, 0.0F, false);
		rforearm.setTextureOffset(0, 477).addBox(-9.6178F, 0.6335F, -7.5843F, 3.0F, 24.0F, 15.0F, 0.0F, false);
		rforearm.setTextureOffset(30, 529).addBox(12.1322F, 4.1492F, -6.0843F, 3.0F, 15.0F, 12.0F, 0.0F, false);
		rforearm.setTextureOffset(516, 417).addBox(-6.9622F, 0.7742F, -8.7195F, 18.0F, 22.0F, 3.0F, 0.0F, false);
		rforearm.setTextureOffset(0, 516).addBox(-6.9622F, 0.7742F, -8.7195F, 18.0F, 22.0F, 3.0F, 0.0F, false);
		rforearm.setTextureOffset(443, 324).addBox(-8.1178F, -1.054F, -7.6248F, 21.0F, 4.0F, 15.0F, 0.0F, false);
		rforearm.setTextureOffset(440, 295).addBox(-8.1178F, -1.054F, -7.6248F, 21.0F, 4.0F, 15.0F, 0.0F, false);
		rforearm.setTextureOffset(388, 158).addBox(-8.1178F, 2.8835F, -7.6248F, 21.0F, 15.0F, 15.0F, 0.0F, false);
		rforearm.setTextureOffset(383, 309).addBox(-8.1178F, 2.8835F, -7.6248F, 21.0F, 15.0F, 15.0F, 0.0F, false);
		rforearm.setTextureOffset(57, 508).addBox(6.9026F, 29.2229F, -7.6248F, 6.0F, 12.0F, 15.0F, 0.0F, false);
		rforearm.setTextureOffset(372, 436).addBox(-8.0974F, 24.4729F, -7.6248F, 21.0F, 4.0F, 15.0F, 0.0F, false);
		rforearm.setTextureOffset(408, 274).addBox(-8.0974F, 18.4729F, -7.6248F, 21.0F, 6.0F, 15.0F, 0.0F, false);

		rforearm2 = new ModelRenderer(this);
		rforearm2.setRotationPoint(-10.6178F, 45.4435F, -0.1248F);
		rforearm.addChild(rforearm2);
		setRotationAngle(rforearm2, 0.0F, 0.0F, 1.0036F);
		rforearm2.setTextureOffset(429, 451).addBox(-11.1447F, -23.4551F, -7.7309F, 16.0F, 6.0F, 15.0F, 0.0F, false);
		rforearm2.setTextureOffset(504, 395).addBox(-16.2035F, -26.785F, -7.6237F, 8.0F, 4.0F, 15.0F, 0.0F, false);

		larm = new ModelRenderer(this);
		larm.setRotationPoint(-43.0F, -211.0F, -16.0F);
		arms.addChild(larm);
		setRotationAngle(larm, -2.0508F, 0.0F, 0.0F);

		lshoulderarm = new ModelRenderer(this);
		lshoulderarm.setRotationPoint(-9.6882F, 140.5427F, 1.1545F);
		larm.addChild(lshoulderarm);
		setRotationAngle(lshoulderarm, 0.0F, 0.0F, 0.0873F);
		lshoulderarm.setTextureOffset(464, 472).addBox(-3.251F, -137.7556F, -3.1025F, 3.0F, 24.0F, 15.0F, 0.0F, false);
		lshoulderarm.setTextureOffset(428, 472).addBox(-3.251F, -137.7556F, -3.1025F, 3.0F, 24.0F, 15.0F, 0.0F, false);
		lshoulderarm.setTextureOffset(209, 472).addBox(-24.251F, -137.7556F, -3.1025F, 3.0F, 24.0F, 15.0F, 0.0F, false);
		lshoulderarm.setTextureOffset(131, 465).addBox(-24.251F, -137.7556F, -3.1025F, 3.0F, 24.0F, 15.0F, 0.0F, false);
		lshoulderarm.setTextureOffset(516, 67).addBox(-25.001F, -138.8806F, -2.3525F, 3.0F, 15.0F, 14.0F, 0.0F, false);
		lshoulderarm.setTextureOffset(510, 162).addBox(-21.5954F, -137.7556F, 10.0327F, 18.0F, 24.0F, 3.0F, 0.0F,
				false);
		lshoulderarm.setTextureOffset(506, 483).addBox(-21.5954F, -137.7556F, 10.0327F, 18.0F, 24.0F, 3.0F, 0.0F,
				false);
		lshoulderarm.setTextureOffset(434, 113).addBox(-22.751F, -114.5525F, -3.1025F, 21.0F, 4.0F, 15.0F, 0.0F, false);
		lshoulderarm.setTextureOffset(432, 382).addBox(-22.751F, -114.5525F, -3.1025F, 21.0F, 4.0F, 15.0F, 0.0F, false);
		lshoulderarm.setTextureOffset(291, 93).addBox(-22.751F, -139.865F, -4.6025F, 21.0F, 24.0F, 15.0F, 0.0F, false);
		lshoulderarm.setTextureOffset(288, 0).addBox(-22.751F, -139.865F, -4.6025F, 21.0F, 24.0F, 15.0F, 0.0F, false);
		lshoulderarm.setTextureOffset(268, 209).addBox(-23.6437F, -158.47F, -4.9281F, 23.0F, 19.0F, 17.0F, 0.0F, false);

		lshoulderarm2 = new ModelRenderer(this);
		lshoulderarm2.setRotationPoint(-13.3133F, -162.3335F, 3.353F);
		lshoulderarm.addChild(lshoulderarm2);
		setRotationAngle(lshoulderarm2, 0.1309F, 0.0F, -0.1745F);
		lshoulderarm2.setTextureOffset(156, 70).addBox(-13.5F, -8.5F, -9.5F, 30.0F, 18.0F, 18.0F, 0.0F, false);

		lforearm = new ModelRenderer(this);
		lforearm.setRotationPoint(-10.4826F, 27.0296F, 7.0922F);
		larm.addChild(lforearm);
		setRotationAngle(lforearm, -0.6981F, 0.0F, 0.0F);
		lforearm.setTextureOffset(334, 492).addBox(-14.3822F, 0.7742F, -7.5843F, 3.0F, 22.0F, 15.0F, 0.0F, false);
		lforearm.setTextureOffset(152, 489).addBox(-14.3822F, 0.7742F, -7.5843F, 3.0F, 22.0F, 15.0F, 0.0F, false);
		lforearm.setTextureOffset(173, 457).addBox(6.6178F, 0.6335F, -7.5843F, 3.0F, 24.0F, 15.0F, 0.0F, false);
		lforearm.setTextureOffset(456, 194).addBox(6.6178F, 0.6335F, -7.5843F, 3.0F, 24.0F, 15.0F, 0.0F, false);
		lforearm.setTextureOffset(527, 293).addBox(-15.1322F, 4.1492F, -6.0843F, 3.0F, 15.0F, 12.0F, 0.0F, false);
		lforearm.setTextureOffset(515, 332).addBox(-11.0378F, 0.7742F, -8.7195F, 18.0F, 22.0F, 3.0F, 0.0F, false);
		lforearm.setTextureOffset(513, 241).addBox(-11.0378F, 0.7742F, -8.7195F, 18.0F, 22.0F, 3.0F, 0.0F, false);
		lforearm.setTextureOffset(432, 0).addBox(-12.8822F, -1.054F, -7.6248F, 21.0F, 4.0F, 15.0F, 0.0F, false);
		lforearm.setTextureOffset(432, 432).addBox(-12.8822F, -1.054F, -7.6248F, 21.0F, 4.0F, 15.0F, 0.0F, false);
		lforearm.setTextureOffset(219, 382).addBox(-12.8822F, 2.8835F, -7.6248F, 21.0F, 15.0F, 15.0F, 0.0F, false);
		lforearm.setTextureOffset(377, 128).addBox(-12.8822F, 2.8835F, -7.6248F, 21.0F, 15.0F, 15.0F, 0.0F, false);
		lforearm.setTextureOffset(500, 305).addBox(-12.9026F, 29.2229F, -7.6248F, 6.0F, 12.0F, 15.0F, 0.0F, false);
		lforearm.setTextureOffset(423, 90).addBox(-12.9026F, 24.4729F, -7.6248F, 21.0F, 4.0F, 15.0F, 0.0F, false);
		lforearm.setTextureOffset(405, 54).addBox(-12.9026F, 18.4729F, -7.6248F, 21.0F, 6.0F, 15.0F, 0.0F, false);

		lforearm_r3 = new ModelRenderer(this);
		lforearm_r3.setRotationPoint(10.6178F, 45.4435F, -0.1248F);
		lforearm.addChild(lforearm_r3);
		setRotationAngle(lforearm_r3, 0.0F, 0.0F, -1.0036F);
		lforearm_r3.setTextureOffset(448, 173).addBox(-5.8116F, -23.4551F, -7.7309F, 16.0F, 6.0F, 15.0F, 0.0F, false);
		lforearm_r3.setTextureOffset(156, 344).addBox(8.2035F, -26.785F, -7.6237F, 8.0F, 4.0F, 15.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 132.0F, -13.0F);
		mainbody.addChild(head);

		tophead = new ModelRenderer(this);
		tophead.setRotationPoint(0.0F, 2.3944F, 0.7008F);
		head.addChild(tophead);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-0.0437F, -134.3982F, -62.0206F);
		tophead.addChild(bone);
		setRotationAngle(bone, 0.3491F, 0.0F, 0.0F);
		bone.setTextureOffset(48, 1018).addBox(5.6509F, -6.783F, -2.8462F, 4.0F, 4.0F, 2.0F, 0.0F, false);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0437F, -134.3982F, -62.0206F);
		tophead.addChild(bone2);
		setRotationAngle(bone2, 0.3491F, 0.0F, 0.0F);
		bone2.setTextureOffset(48, 1018).addBox(-9.7251F, -6.783F, -2.8462F, 4.0F, 4.0F, 2.0F, 0.0F, true);

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.0437F, -134.3982F, -62.0206F);
		tophead.addChild(bone3);
		setRotationAngle(bone3, 0.3491F, 0.0F, 0.0F);
		bone3.setTextureOffset(196, 189).addBox(-16.0013F, -8.5569F, 0.9338F, 32.0F, 13.0F, -2.0F, 0.0F, false);

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(-6.571F, -120.8913F, -92.0566F);
		tophead.addChild(bone6);
		setRotationAngle(bone6, -0.48F, 0.0F, -0.4363F);
		bone6.setTextureOffset(135, 87).addBox(-5.8917F, 0.6628F, -0.108F, 11.0F, 2.0F, 1.0F, 0.0F, false);

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(6.571F, -120.8913F, -92.0566F);
		tophead.addChild(bone7);
		setRotationAngle(bone7, -0.48F, 0.0F, 0.4363F);
		bone7.setTextureOffset(135, 89).addBox(-5.1083F, 0.6628F, -0.108F, 11.0F, 2.0F, 1.0F, 0.0F, false);

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(20.596F, -137.9827F, -54.0859F);
		tophead.addChild(bone8);
		setRotationAngle(bone8, 0.4363F, 0.48F, 0.2182F);
		bone8.setTextureOffset(84, 175).addBox(-0.607F, -8.4134F, -10.7552F, 1.0F, 15.0F, 21.0F, 0.0F, true);

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(-20.596F, -137.9827F, -54.0859F);
		tophead.addChild(bone9);
		setRotationAngle(bone9, 0.4363F, -0.48F, -0.2182F);
		bone9.setTextureOffset(84, 175).addBox(-0.393F, -8.4134F, -10.7552F, 1.0F, 15.0F, 21.0F, 0.0F, false);

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(29.0478F, -119.4866F, -57.6349F);
		tophead.addChild(bone10);
		setRotationAngle(bone10, 0.4363F, -0.5236F, -0.2182F);
		bone10.setTextureOffset(84, 167).addBox(6.3387F, -24.506F, 17.6498F, 1.0F, 15.0F, 20.0F, 0.0F, true);

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(-29.0478F, -119.4866F, -57.6349F);
		tophead.addChild(bone11);
		setRotationAngle(bone11, 0.4363F, 0.5236F, 0.2182F);
		bone11.setTextureOffset(84, 167).addBox(-7.5528F, -24.506F, 17.6498F, 1.0F, 15.0F, 20.0F, 0.0F, false);

		bone15 = new ModelRenderer(this);
		bone15.setRotationPoint(-0.9812F, -136.2575F, -67.4054F);
		tophead.addChild(bone15);
		setRotationAngle(bone15, 0.4363F, 0.0873F, 0.2618F);
		bone15.setTextureOffset(135, 70).addBox(2.5002F, 0.8249F, -6.2565F, 1.0F, 1.0F, 31.0F, 0.0F, false);

		bone16 = new ModelRenderer(this);
		bone16.setRotationPoint(-0.9812F, -136.2575F, -67.4054F);
		tophead.addChild(bone16);
		setRotationAngle(bone16, 0.4363F, 0.0873F, 0.2618F);
		bone16.setTextureOffset(484, 118).addBox(4.0878F, 0.8249F, -17.5965F, 1.0F, 1.0F, 43.0F, 0.0F, false);

		bone19 = new ModelRenderer(this);
		bone19.setRotationPoint(-0.2914F, -106.1388F, -88.5086F);
		tophead.addChild(bone19);
		setRotationAngle(bone19, 0.3927F, 0.3491F, 0.1745F);
		bone19.setTextureOffset(270, 93).addBox(-15.3328F, -10.4562F, -5.4869F, 14.0F, 1.0F, 15.0F, 0.0F, false);

		bone20 = new ModelRenderer(this);
		bone20.setRotationPoint(-8.3554F, -121.0119F, -91.1868F);
		tophead.addChild(bone20);
		setRotationAngle(bone20, 1.0908F, 0.3491F, 0.1745F);
		bone20.setTextureOffset(216, 106).addBox(4.2953F, 0.0699F, -6.2522F, 3.0F, 1.0F, 7.0F, 0.0F, false);

		bone21 = new ModelRenderer(this);
		bone21.setRotationPoint(8.3554F, -121.0119F, -91.1868F);
		tophead.addChild(bone21);
		setRotationAngle(bone21, 1.0908F, -0.3491F, -0.1745F);
		bone21.setTextureOffset(0, 161).addBox(-7.6106F, -0.0362F, -6.4001F, 3.0F, 1.0F, 7.0F, 0.0F, false);

		bone22 = new ModelRenderer(this);
		bone22.setRotationPoint(8.3554F, -121.0119F, -91.1868F);
		tophead.addChild(bone22);
		setRotationAngle(bone22, 1.0908F, -0.3491F, -0.1745F);
		bone22.setTextureOffset(18, 156).addBox(-4.2953F, 0.0699F, -6.1647F, 1.0F, 1.0F, 5.0F, 0.0F, false);

		bone23 = new ModelRenderer(this);
		bone23.setRotationPoint(-8.3554F, -121.0119F, -91.1868F);
		tophead.addChild(bone23);
		setRotationAngle(bone23, 1.0908F, 0.3491F, 0.1745F);
		bone23.setTextureOffset(18, 151).addBox(2.7077F, 0.0699F, -6.2522F, 1.0F, 1.0F, 5.0F, 0.0F, false);

		bone24 = new ModelRenderer(this);
		bone24.setRotationPoint(-8.3554F, -121.0119F, -91.1868F);
		tophead.addChild(bone24);
		setRotationAngle(bone24, 1.0908F, 0.3491F, 0.1745F);
		bone24.setTextureOffset(0, 10).addBox(-3.6427F, 0.0699F, -4.6697F, 1.0F, 1.0F, -2.0F, 0.0F, false);

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(8.3554F, -121.0119F, -91.1868F);
		tophead.addChild(bone4);
		setRotationAngle(bone4, 1.0908F, -0.3491F, -0.1745F);
		bone4.setTextureOffset(0, 10).addBox(2.0551F, 0.0699F, -4.6697F, 1.0F, 1.0F, -2.0F, 0.0F, true);

		bone25 = new ModelRenderer(this);
		bone25.setRotationPoint(8.3554F, -121.0119F, -91.1868F);
		tophead.addChild(bone25);
		setRotationAngle(bone25, 1.0908F, -0.3491F, -0.1745F);
		bone25.setTextureOffset(112, 154).addBox(-2.7077F, 0.0699F, -6.1647F, 1.0F, 1.0F, 4.0F, 0.0F, false);

		bone28 = new ModelRenderer(this);
		bone28.setRotationPoint(-8.3554F, -121.0119F, -91.1868F);
		tophead.addChild(bone28);
		setRotationAngle(bone28, 1.0908F, 0.3491F, 0.1745F);
		bone28.setTextureOffset(143, 77).addBox(1.1201F, 0.0699F, -6.2522F, 1.0F, 1.0F, 4.0F, 0.0F, false);

		bone29 = new ModelRenderer(this);
		bone29.setRotationPoint(-8.3554F, -121.0119F, -91.1868F);
		tophead.addChild(bone29);
		setRotationAngle(bone29, 1.0908F, 0.3491F, 0.1745F);
		bone29.setTextureOffset(135, 73).addBox(-0.4675F, 0.0699F, -6.2522F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		bone17 = new ModelRenderer(this);
		bone17.setRotationPoint(1.1225F, -117.7248F, -94.8235F);
		tophead.addChild(bone17);
		setRotationAngle(bone17, 1.0908F, -0.1309F, -0.2182F);
		bone17.setTextureOffset(0, 15).addBox(-0.3761F, 0.0034F, -4.012F, 0.0F, 1.0F, 6.0F, 0.0F, false);

		bone30 = new ModelRenderer(this);
		bone30.setRotationPoint(8.3554F, -121.0119F, -91.1868F);
		tophead.addChild(bone30);
		setRotationAngle(bone30, 1.0908F, -0.3491F, -0.1745F);
		bone30.setTextureOffset(135, 77).addBox(-1.1201F, 0.0699F, -6.1647F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		bone32 = new ModelRenderer(this);
		bone32.setRotationPoint(-8.3554F, -121.0119F, -91.1868F);
		tophead.addChild(bone32);
		setRotationAngle(bone32, 1.0908F, 0.3491F, 0.1745F);
		bone32.setTextureOffset(15, 3).addBox(-2.0551F, 0.0699F, -6.2522F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(8.3554F, -121.0119F, -91.1868F);
		tophead.addChild(bone5);
		setRotationAngle(bone5, 1.0908F, -0.3491F, -0.1745F);
		bone5.setTextureOffset(15, 3).addBox(0.4675F, 0.0699F, -6.2522F, 1.0F, 1.0F, 2.0F, 0.0F, true);

		bone33 = new ModelRenderer(this);
		bone33.setRotationPoint(-0.9812F, -136.2575F, -67.4054F);
		tophead.addChild(bone33);
		setRotationAngle(bone33, 0.4363F, 0.0873F, 0.2618F);
		bone33.setTextureOffset(196, 127).addBox(5.6754F, 0.8249F, -27.0465F, 2.0F, 1.0F, 52.0F, 0.0F, false);

		bone34 = new ModelRenderer(this);
		bone34.setRotationPoint(14.2884F, -123.3544F, -21.4908F);
		tophead.addChild(bone34);
		setRotationAngle(bone34, 0.3927F, 0.0F, 0.0F);
		bone34.setTextureOffset(0, 139).addBox(-29.1644F, -20.79F, -66.15F, 29.0F, 5.0F, 68.0F, 0.0F, false);

		bone35 = new ModelRenderer(this);
		bone35.setRotationPoint(14.2884F, -123.3544F, -21.4908F);
		tophead.addChild(bone35);
		setRotationAngle(bone35, 0.3927F, 0.0F, 0.0F);
		bone35.setTextureOffset(192, 57).addBox(-30.1644F, -34.02F, 0.0F, 31.0F, 13.0F, 1.0F, 0.0F, false);

		bone36 = new ModelRenderer(this);
		bone36.setRotationPoint(0.0F, -136.3728F, -59.3119F);
		tophead.addChild(bone36);
		setRotationAngle(bone36, 0.4363F, 0.0F, 0.0F);
		bone36.setTextureOffset(0, 139).addBox(-1.5876F, -1.9674F, -35.3377F, 3.0F, 0.0F, 53.0F, 0.0F, false);

		bone37 = new ModelRenderer(this);
		bone37.setRotationPoint(0.0F, -136.3728F, -59.3119F);
		tophead.addChild(bone37);
		setRotationAngle(bone37, 0.4363F, 0.0F, 0.0F);
		bone37.setTextureOffset(190, 0).addBox(-1.5876F, -3.8574F, -20.2177F, 3.0F, 2.0F, 15.0F, 0.0F, false);

		bone38 = new ModelRenderer(this);
		bone38.setRotationPoint(15.5473F, -123.2496F, -20.8421F);
		tophead.addChild(bone38);
		setRotationAngle(bone38, 0.3927F, 0.0F, 0.0F);
		bone38.setTextureOffset(153, 80).addBox(-18.6071F, -20.7472F, -73.5344F, 6.0F, 1.0F, 9.0F, 0.0F, false);

		bone39 = new ModelRenderer(this);
		bone39.setRotationPoint(0.0682F, -117.7248F, -94.8235F);
		tophead.addChild(bone39);
		setRotationAngle(bone39, 1.0908F, 0.0F, 0.0F);
		bone39.setTextureOffset(135, 70).addBox(-1.5876F, -0.052F, -3.9778F, 3.0F, 1.0F, 10.0F, 0.0F, false);

		bone42 = new ModelRenderer(this);
		bone42.setRotationPoint(-1.1225F, -117.7248F, -94.8235F);
		tophead.addChild(bone42);
		setRotationAngle(bone42, 1.0908F, 0.1309F, 0.2182F);
		bone42.setTextureOffset(135, 80).addBox(-1.2636F, 0.1375F, -4.0602F, 0.0F, 1.0F, 6.0F, 0.0F, false);

		bone43 = new ModelRenderer(this);
		bone43.setRotationPoint(-1.1225F, -117.7248F, -94.8235F);
		tophead.addChild(bone43);
		setRotationAngle(bone43, 1.0908F, 0.1309F, 0.2182F);
		bone43.setTextureOffset(135, 79).addBox(-0.3646F, 0.1375F, -4.0602F, 0.0F, 1.0F, 6.0F, 0.0F, false);

		bone44 = new ModelRenderer(this);
		bone44.setRotationPoint(1.1225F, -117.7248F, -94.8235F);
		tophead.addChild(bone44);
		setRotationAngle(bone44, 1.0908F, -0.1309F, -0.2182F);
		bone44.setTextureOffset(10, 85).addBox(0.3646F, 0.0068F, -4.2171F, 0.0F, 1.0F, 7.0F, 0.0F, false);

		bone49 = new ModelRenderer(this);
		bone49.setRotationPoint(0.2914F, -106.1388F, -88.5086F);
		tophead.addChild(bone49);
		setRotationAngle(bone49, 0.3927F, -0.3491F, -0.1745F);
		bone49.setTextureOffset(234, 256).addBox(1.0444F, -10.4562F, -5.4869F, 14.0F, 1.0F, 15.0F, 0.0F, false);

		bone50 = new ModelRenderer(this);
		bone50.setRotationPoint(-6.0688F, -118.6648F, -58.4925F);
		tophead.addChild(bone50);
		setRotationAngle(bone50, 0.3927F, -0.1745F, -0.0436F);
		bone50.setTextureOffset(366, 369).addBox(-15.876F, -10.395F, -29.295F, 15.0F, 1.0F, 52.0F, 0.0F, false);

		bone51 = new ModelRenderer(this);
		bone51.setRotationPoint(6.0688F, -118.6648F, -58.4925F);
		tophead.addChild(bone51);
		setRotationAngle(bone51, 0.3927F, 0.1745F, 0.0436F);
		bone51.setTextureOffset(319, 368).addBox(0.0F, -10.395F, -29.295F, 15.0F, 1.0F, 52.0F, 0.0F, false);

		bone52 = new ModelRenderer(this);
		bone52.setRotationPoint(13.6201F, -129.9434F, -67.7086F);
		tophead.addChild(bone52);
		setRotationAngle(bone52, 0.4363F, 0.0F, 0.4363F);
		bone52.setTextureOffset(0, 361).addBox(-7.7807F, 0.2026F, -26.4943F, 15.0F, 1.0F, 52.0F, 0.0F, false);

		bone53 = new ModelRenderer(this);
		bone53.setRotationPoint(-3.7682F, -127.1523F, -61.4024F);
		tophead.addChild(bone53);
		setRotationAngle(bone53, 0.4363F, 0.0F, -0.4363F);
		bone53.setTextureOffset(272, 354).addBox(-15.8446F, -8.5286F, -29.381F, 15.0F, 1.0F, 52.0F, 0.0F, false);

		bone54 = new ModelRenderer(this);
		bone54.setRotationPoint(0.9812F, -136.2575F, -67.4054F);
		tophead.addChild(bone54);
		setRotationAngle(bone54, 0.4363F, -0.0873F, -0.2618F);
		bone54.setTextureOffset(196, 161).addBox(-8.4537F, 0.8249F, -27.0465F, 2.0F, 1.0F, 52.0F, 0.0F, false);

		bone55 = new ModelRenderer(this);
		bone55.setRotationPoint(0.9812F, -136.2575F, -67.4054F);
		tophead.addChild(bone55);
		setRotationAngle(bone55, 0.4363F, -0.0873F, -0.2618F);
		bone55.setTextureOffset(489, 420).addBox(-5.6754F, 0.8249F, -17.5965F, 1.0F, 1.0F, 43.0F, 0.0F, false);

		bone56 = new ModelRenderer(this);
		bone56.setRotationPoint(0.9812F, -136.2575F, -67.4054F);
		tophead.addChild(bone56);
		setRotationAngle(bone56, 0.4363F, -0.0873F, -0.2618F);
		bone56.setTextureOffset(0, 151).addBox(-4.0878F, 0.8249F, -6.2565F, 1.0F, 1.0F, 31.0F, 0.0F, false);

		bottomhead = new ModelRenderer(this);
		bottomhead.setRotationPoint(0.0F, 2.3944F, 0.7008F);
		head.addChild(bottomhead);

		bone60 = new ModelRenderer(this);
		bone60.setRotationPoint(-29.9009F, -119.3561F, -57.0023F);
		bottomhead.addChild(bone60);
		setRotationAngle(bone60, 0.4363F, 0.5236F, 0.2182F);
		bone60.setTextureOffset(156, 216).addBox(-6.5397F, -9.3859F, 17.7239F, 14.0F, 13.0F, 20.0F, 0.0F, false);

		bone61 = new ModelRenderer(this);
		bone61.setRotationPoint(-6.0688F, -118.6648F, -58.4925F);
		bottomhead.addChild(bone61);
		setRotationAngle(bone61, 0.3927F, -0.1745F, -0.0436F);
		bone61.setTextureOffset(0, 1013).addBox(-15.4791F, -8.505F, -29.295F, 1.0F, 3.0F, 24.0F, 0.0F, false);

		bone62 = new ModelRenderer(this);
		bone62.setRotationPoint(-6.0688F, -118.6648F, -58.4925F);
		bottomhead.addChild(bone62);
		setRotationAngle(bone62, 0.3927F, -0.1745F, -0.0436F);
		bone62.setTextureOffset(197, 106).addBox(-15.876F, -8.505F, -6.615F, 3.0F, 3.0F, 29.0F, 0.0F, false);

		bone63 = new ModelRenderer(this);
		bone63.setRotationPoint(20.3572F, -125.2798F, -50.1765F);
		bottomhead.addChild(bone63);
		setRotationAngle(bone63, 0.3927F, 0.1745F, 0.0436F);
		bone63.setTextureOffset(171, 0).addBox(0.3711F, -6.0396F, -19.1926F, 3.0F, 4.0F, 29.0F, 0.0F, false);

		bone64 = new ModelRenderer(this);
		bone64.setRotationPoint(14.0068F, -118.6648F, -61.5165F);
		bottomhead.addChild(bone64);
		setRotationAngle(bone64, 0.3927F, 0.1745F, 0.0436F);
		bone64.setTextureOffset(242, 316).addBox(-7.938F, -3.7907F, -27.7854F, 15.0F, 9.0F, 52.0F, 0.0F, false);

		bone65 = new ModelRenderer(this);
		bone65.setRotationPoint(6.0688F, -118.6648F, -58.4925F);
		bottomhead.addChild(bone65);
		setRotationAngle(bone65, 0.3927F, 0.1745F, 0.0436F);
		bone65.setTextureOffset(0, 1000).addBox(14.2884F, -8.505F, -29.295F, 1.0F, 3.0F, 24.0F, 0.0F, false);

		bone66 = new ModelRenderer(this);
		bone66.setRotationPoint(29.9009F, -119.3561F, -57.0023F);
		bottomhead.addChild(bone66);
		setRotationAngle(bone66, 0.4363F, -0.5236F, -0.2182F);
		bone66.setTextureOffset(39, 233).addBox(-7.5528F, -9.3859F, 17.7239F, 14.0F, 13.0F, 20.0F, 0.0F, false);

		bone74 = new ModelRenderer(this);
		bone74.setRotationPoint(16.8572F, -123.7272F, -19.562F);
		bottomhead.addChild(bone74);
		setRotationAngle(bone74, 0.3927F, 0.0F, 0.0F);
		bone74.setTextureOffset(0, 1025).addBox(-19.845F, -18.9F, -74.655F, 5.0F, 3.0F, 0.0F, 0.0F, false);

		bone72 = new ModelRenderer(this);
		bone72.setRotationPoint(16.8572F, -124.0888F, -18.689F);
		bottomhead.addChild(bone72);
		setRotationAngle(bone72, 0.3927F, 0.0F, 0.0F);
		bone72.setTextureOffset(0, 0).addBox(-19.845F, -15.12F, -75.6F, 5.0F, 9.0F, 9.0F, 0.0F, false);

		bone73 = new ModelRenderer(this);
		bone73.setRotationPoint(0.0F, -121.7494F, -53.6208F);
		bottomhead.addChild(bone73);
		setRotationAngle(bone73, 0.3927F, 0.0F, 0.0F);
		bone73.setTextureOffset(120, 120).addBox(-15.876F, -4.3072F, -34.02F, 31.0F, 9.0F, 66.0F, 0.0F, false);

		bone71 = new ModelRenderer(this);
		bone71.setRotationPoint(1.0681F, -106.863F, -86.6882F);
		bottomhead.addChild(bone71);
		setRotationAngle(bone71, 0.3927F, 0.3491F, 0.1745F);
		bone71.setTextureOffset(291, 132).addBox(-15.876F, -4.725F, -7.56F, 14.0F, 9.0F, 11.0F, 0.0F, false);

		bone70 = new ModelRenderer(this);
		bone70.setRotationPoint(-1.0681F, -106.863F, -86.6882F);
		bottomhead.addChild(bone70);
		setRotationAngle(bone70, 0.3927F, -0.3491F, -0.1745F);
		bone70.setTextureOffset(291, 132).addBox(1.5876F, -4.725F, -7.56F, 14.0F, 9.0F, 11.0F, 0.0F, true);

		bone69 = new ModelRenderer(this);
		bone69.setRotationPoint(0.8897F, -106.7109F, -87.0984F);
		bottomhead.addChild(bone69);
		setRotationAngle(bone69, 0.3927F, 0.3491F, 0.1745F);
		bone69.setTextureOffset(0, 1023).addBox(-15.876F, -8.505F, -7.0875F, 14.0F, 3.0F, 0.0F, 0.0F, false);

		bone68 = new ModelRenderer(this);
		bone68.setRotationPoint(-0.8897F, -106.7109F, -87.0984F);
		bottomhead.addChild(bone68);
		setRotationAngle(bone68, 0.3927F, -0.3491F, -0.1745F);
		bone68.setTextureOffset(0, 1023).addBox(1.5876F, -8.505F, -7.0875F, 14.0F, 3.0F, 1.0F, 0.0F, true);

		bone67 = new ModelRenderer(this);
		bone67.setRotationPoint(-6.0688F, -118.6648F, -58.4925F);
		bottomhead.addChild(bone67);
		setRotationAngle(bone67, 0.3927F, -0.1745F, -0.0436F);
		bone67.setTextureOffset(336, 336).addBox(-15.876F, -4.725F, -29.295F, 15.0F, 9.0F, 52.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		// previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		mainbody.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}