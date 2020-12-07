package view;

import controller.Controller;
import processing.core.PApplet;
import processing.core.PImage;

public class Register {
	
	private PApplet app;
	private Controller controller;
	private PImage register; //BACKGROUND IMAGE
	private boolean empty = true, clicked = false;

	
	public Register(PApplet app) {
		this.app = app;
		register = app.loadImage ("Register.png");

	}
	
	public void drawScreen () {
		app.image(register, 0,0);
	}
}
