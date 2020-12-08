package view;

import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PVector;



public class Platform extends PApplet{
	private PApplet app;

PVector pos;

private float w;
Platform(float x, float y, float w, PApplet app){
	this.app = app;
 this.w=w;
 pos = new PVector (x,y);
}

 public void show () {
	 
 
	 float h = 0;
	 
	   if (h > 360){
	     h = 0;
	   }
	  
	   h += 2;

	  this.app.strokeWeight(4);
	  this.app.stroke(h, 360, 360);
	  this.app.line(pos.x,pos.y, pos.x+w,pos.y);
	 
	 
 }
 public void collide (PVector p) {
	 if(p.x > pos.x && p.y > pos.y && p.x < pos.x+w && p.y < pos.y+10) {
		 p.y= pos.y;
	 }
 }
 
}
