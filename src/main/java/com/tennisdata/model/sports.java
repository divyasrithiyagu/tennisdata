package com.tennisdata.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="sports_details")
public class sports {
     @Id
     private int playerID;
     private int won;
     private String firstname;
     private String lastname;
     private String monthofjoining;
     private String level;
     private int age;
     private int height;
     private int yearofexperience;
     private String footwearEvaluation;
     
     
     public int getPlayerID() {
 		return playerID;
 	}
 	public void setPlayerId(int won) {
 		this.playerID = won;
 	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String fullname) {
		this.firstname = fullname;
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
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getMonthofjoining() {
		return monthofjoining;
	}
	public void setMonthofjoining(String monthofjoining) {
		this.monthofjoining = monthofjoining;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getYearofexperience() {
		return yearofexperience;
	}
	public void setYearofexperience(int yearofexperience) {
		this.yearofexperience = yearofexperience;
	}
     
}

