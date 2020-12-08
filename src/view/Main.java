package view;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PFont;

public class Main extends PApplet {

	PFont font;
	private Register register;
	private String screen;
	private Personaje personaje;
	private ArrayList<Platform> plataformas;

	

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
		plataformas=new ArrayList<Platform>();
		
		plataformas.add(new Platform(1,408,282,this));
		plataformas.add(new Platform(485,408,282,this));
		plataformas.add(new Platform(241,362,75,this));
		plataformas.add(new Platform(460,362,75,this));
		plataformas.add(new Platform(352,330,42,this));
		plataformas.add(new Platform(127,316,75,this));
		plataformas.add(new Platform(43,283,42,this));
		plataformas.add(new Platform(552,299,42,this));
		colorMode(HSB, 360, 360, 360);
		personaje= new Personaje(this,20,0);

	}

	public void draw() {
		background(0);
		textFont(font);
	
		personaje.choque= false;

		// Screens
		//System.out.println(screen);  
		
		
		
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
			
			for(Platform i: plataformas) {
				i.show();
				if(i.collide(personaje.posPersonaje)) {
					personaje.choque=true;
					personaje.posPersonaje.y=i.pos.y;
				}
			}
			personaje.pintar();
			
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
		if(key=='a') {
			personaje.movimiento=-personaje.distancia;
			
		}
		if(key=='d' ) {
			personaje.movimiento=personaje.distancia;
			
		}
		if(key==' ' ) {
			if(personaje.choque) {
				personaje.vel.y -= 7;
				
			}
		}
			
	}
	public void keyReleased() {
		if(key=='a') {
			personaje.movimiento=0;
			
		}
		if(key=='d') {
			personaje.movimiento=0;
		}
	}

	public void mousePressed() {
		register.registerNewPlayer();
	}
}
