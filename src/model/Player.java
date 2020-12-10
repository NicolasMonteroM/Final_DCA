package model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Player {
	
	private String nickname, date;
	private int score, time;
	private DateTimeFormatter dtf;
	
	public Player(String nickname, int time, int score, String date) {
		
	}
	
	
	public String getDate() {
		dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		return dtf.format(now);
	}

}
