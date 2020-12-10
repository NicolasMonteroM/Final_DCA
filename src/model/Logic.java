package model;

import java.util.ArrayList;

import processing.core.PApplet;

public class Logic {
	
	private PApplet app;
	private ArrayList<Player> playerList;
	
	
	public Logic(PApplet app) {
		this.app = app;
	}
	
	
	public void createPlayer(String nickname, PApplet app) {
		Player player = new Player(nickname,app);
		playerList.add(player);

	}
	
	
}
