package model;

import java.util.ArrayList;

import processing.core.PApplet;

public class Logic {
	

	
	private PApplet app;
	private ArrayList<Player> playerList;

	public Logic(PApplet app) {
		this.app = app;
	}
	
	
	public void createPlayer(String nickname, int time, int score, String date) {
		Player player = new Player(nickname,time,score, date);
		playerList.add(player);

	}
	
	
}
