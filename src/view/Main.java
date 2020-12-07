package view;

import processing.core.PApplet;
import processing.core.PFont;

public class Main  extends PApplet{
	

	PFont font;
	private Register register;
	private String screen;

	public static void main(String[] args) {
		PApplet.main(Main.class.getName());

	}
	
	public void settings() {
		size(768,458);
	}
	
	
	public void setup() {
		screen = "register";
		font = createFont("Anonymous Pro Bold",12);
		register= new Register(this);
		register.drawTextfield(); // Don't move from setup
		
	

	}
	
	public void draw() {
		background(0);
		textFont(font);

		//Screens
		
		switch(screen) {
		
		  case "register":
		register.drawScreen();
		fill(240);
		text("LEADERBOARD", 350, 385);
		
		break;
		
		
		}

		
		System.out.println(mouseX + " - " + mouseY); // Mouse position on console

	}
	
	
	public void keyPressed() {
	}

	public void mousePressed() {
	}
}
