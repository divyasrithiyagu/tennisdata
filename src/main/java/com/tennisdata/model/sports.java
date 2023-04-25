package com.tennisdata.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

public class sports {
     @Id
     private int playerID;
     private int won;
     private String fullname;
     private String level;
     private String footwearEvaluation;
     
     public int getPlayerID() {
 		return playerID;
 	}
 	public void setPlayerId(int won) {
 		this.playerID = won;
 	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getFootwearEvaluation() {
		return footwearEvaluation;
	}
	public void setFootwearEvaluation(String footwearEvaluation) {
		this.footwearEvaluation = footwearEvaluation;
	}
	public int getWon() {
		return won;
	}
	public void setWon(int won) {
		this.won = won;
	}
     
}
