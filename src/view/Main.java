package view;

import processing.core.PApplet;
import processing.core.PFont;

public class Main  extends PApplet{
	
	public PFont font; // Consolas Font

	
	private Register register;

	public static void main(String[] args) {
		PApplet.main(Main.class.getName());

	}
	
	public void settings() {
		size(768,458);
	}
	
	
	public void setup() {
		register= new Register(this);
		font = loadFont("Consolas-12.vlw");
	}
	
	public void draw() {
		register.drawScreen();
	}
	
	
	public void keyPressed() {
	}

	public void mousePressed() {
	}
}
