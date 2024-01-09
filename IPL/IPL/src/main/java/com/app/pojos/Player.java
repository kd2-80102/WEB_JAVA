package com.app.pojos;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/*table players(player_id int primary key auto_increment,first_name varchar(20),last_name varchar(20),
		dob date,batting_avg double,wickets_taken int,team_id int ,
		constraint fk_teams foreign key (team_id) references teams(team_id));**/
@Entity
@Table(name="Players")
public class Player 
{
	@Id
	private Integer playerid;
	private String firstName;
	private String lastName;
	private LocalDate dob;
	private double battingAverage;
	private int wicketTaken;
	private int teamId;
	public Player(String firstName, String lastName, LocalDate dob, double battingAverage, int wicketTaken,int teamId) 
	{	
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.battingAverage = battingAverage;
		this.wicketTaken = wicketTaken;
		this.teamId = teamId;
	}
	public Player() {
		
	}
	public Integer getPlayerid() {
		return playerid;
	}
	public void setPlayerid(Integer playerid) {
		this.playerid = playerid;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public double getBattingAverage() {
		return battingAverage;
	}
	public void setBattingAverage(double battingAverage) {
		this.battingAverage = battingAverage;
	}
	public int getWicketTaken() {
		return wicketTaken;
	}
	public void setWicketTaken(int wicketTaken) {
		this.wicketTaken = wicketTaken;
	}
	public int getTeamId() {
		return teamId;
	}
	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}
	@Override
	public String toString() {
		return "Player [playerid=" + playerid + ", firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob
				+ ", battingAverage=" + battingAverage + ", wicketTaken=" + wicketTaken + ", teamId=" + teamId + "]";
	}
	
	
	
}
