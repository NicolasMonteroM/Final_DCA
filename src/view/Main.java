package view;

import processing.core.PApplet;
import processing.core.PFont;

public class Main extends PApplet {

	PFont font;
	private Register register;
	private String screen;

	public static void main(String[] args) {
		PApplet.main(Main.class.getName());

	}

	public void settings() {
		size(768, 458);
	}

	public void setup() {
		screen = "register";
		font = createFont("Anonymous Pro Bold", 12);
		register = new Register(this);

	}

	public void draw() {
		background(0);
		textFont(font);

		// Screens
		System.out.println(screen);  
		
		switch (screen) { 

		case "register":
			register.drawScreen();
			screen = register.changeScreen();
			fill(240);
			text("LEADERBOARD", 350, 385);

			break;

		case "level 1":
			register.getCp5().hide();
			background(255);
			fill(0);
			text("Nivel 1", width/2, height/2);

			break;
			
		case "level 2":
			background(255);
			fill(0);
			text("Nivel 2", width/2, height/2);

			break;
			
		case "level 3":
			background(0);
			fill(255);
			text("Nivel 3", width/2, height/2);

			break;
			
		case "leaderboard":
			register.getCp5().hide();
			background(0);
			fill(255);
			text("LEADERBOARD", width/2, height/2);

			break;

		}

		// System.out.println(mouseX + " - " + mouseY); // Mouse position on console

	}

	public void keyPressed() {
	}

	public void mousePressed() {
		register.registerNewPlayer();
	}
}
