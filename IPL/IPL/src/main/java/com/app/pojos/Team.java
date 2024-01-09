package com.app.pojos;
import org.hibernate.*;
import javax.persistence.*;
/*create table teams (team_id int primary key auto_increment,name varchar(100),abbrevation varchar(10),owner varchar(20),max_age int,
batting_avg double,wickets_taken int);*/

@Entity
@Table(name="teams")
public class Team 
{
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)//auto increment
 @Column(name="team_id")
 private Integer teamId;
 @Column(length=100,unique=true)
 private String name;
@Column(length=10,unique=true)
private String abbreviation;
@Column(length=20)
 private String ownerName;
public Team(Integer teamId, String abbreviation) {

	this.teamId = teamId;
	this.abbreviation = abbreviation;
}
@Column(name="max_age")
 private int  maxAge;
@Column(name="batting_avg")
 private double battingAvg;
@Column(name="wickets_taken")
 private int wicketsTaken;

 
public Team() {
	
}
public Team(String name, String abbreviation, String ownerName, int maxAge, double battingAvg, int wicketsTaken) {
	super();
	this.name = name;
	this.abbreviation = abbreviation;
	this.ownerName = ownerName;
	this.maxAge = maxAge;
	this.battingAvg = battingAvg;
	this.wicketsTaken = wicketsTaken;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getMaxAge() {
	return maxAge;
}
public void setMaxAge(int maxAge) {
	this.maxAge = maxAge;
}
public Integer getTeamId() {
	return teamId;
}
public void setTeamId(Integer teamId) {
	this.teamId = teamId;
}
public String getAbbreviation() {
	return abbreviation;
}
public void setAbbreviation(String abbreviation) {
	this.abbreviation = abbreviation;
}
public String getOwnerName() {
	return ownerName;
}
public void setOwnerName(String ownerName) {
	this.ownerName = ownerName;
}

public double getBattingAvg() {
	return battingAvg;
}
public void setBattingAvg(double battingAvg) {
	this.battingAvg = battingAvg;
}
public int getWicketsTaken() {
	return wicketsTaken;
}
public void setWicketsTaken(int wicketsTaken) {
	this.wicketsTaken = wicketsTaken;
}
@Override
public String toString() {
	return "Team [teamId=" + teamId + ", name=" + name + ", abbreviation=" + abbreviation + ", ownerName=" + ownerName
			+ ", maxAge=" + maxAge + ", battingAvg=" + battingAvg + ", wicketsTaken=" + wicketsTaken + "]";
}
}
