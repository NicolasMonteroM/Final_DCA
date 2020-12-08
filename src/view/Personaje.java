package view;

import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PVector;

public class Personaje extends PApplet {
	private PApplet app;
	 PVector posPersonaje;
	PVector vel;
	public boolean choque = false;
	 float movimiento ;
	 float distancia ;
	
	
 Personaje(PApplet app, float x, float y){
	 this.app = app;
	 posPersonaje=new PVector(x,y);
	 vel=new PVector();
	 movimiento = 0;
	 distancia = 2;
	 
	
			 
 }
public void pintar() {
	app.ellipse(posPersonaje.x,posPersonaje.y-8,16,16);
	if(!choque) {
		vel.y+=0.07;
	}
	
	posPersonaje.add(vel);
	posPersonaje.x+=movimiento;
	vel.mult((float) 1);
}
public void mover() {
	if(key=='a') {
		movimiento=-distancia;
		
	}
	if(key=='d' ) {
		movimiento=distancia;
	
	}
	
}
public void quieto() {
	if(key=='a') {
		movimiento=0;
		
	}
	if(key=='d') {
		movimiento=0;
	}
}
}
