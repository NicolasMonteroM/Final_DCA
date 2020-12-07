package view;

import controlP5.ControlP5;
import controller.Controller;
import processing.core.PApplet;
import processing.core.PImage;

public class Register {
	
	private PApplet app;
	private Controller controller;
	private PImage register; //BACKGROUND IMAGE
	private ControlP5 cp5;


	
	public Register(PApplet app) {
		this.app = app;
		register = app.loadImage ("Register.png");
		cp5 = new ControlP5(app);

	}
	
	public void drawScreen () {
		app.image(register, 0,0);
		
					
	}
	
	public void drawTextfield () {
		
		cp5.addTextfield("Nickname").setPosition(285,279).setSize(211, 33).setAutoClear(true)
		.setColorActive(app.color(0,0,0,1)).setColorBackground(app.color(0,0,0)).setColorForeground(app.color(0,0,0,1))
		.setText("Your nickname").setColor(app.color(100)).setColorCursor(app.color(255,255,255)).setFont(app.createFont("Anonymous Pro",12))
		.getCaptionLabel().hide();
			
			
		cp5.addButton("Start").setPosition(333,365).setSize(105,30).setColorBackground(app.color(255,255,255,1))
		.setColorForeground(app.color(255,255,255,20))
		.setColorActive(app.color(255,255,255,60)).getCaptionLabel().hide();
		
		cp5.addButton("Leaderboard").setPosition(350,330).setSize(70,30).setColorBackground(app.color(255,255,255,1))
		.setColorForeground(app.color(255,255,255,20))
		.setColorActive(app.color(255,255,255,60)).getCaptionLabel().hide();
					
	}
	
	public void registerNewPlayer() {
		
	}

}
