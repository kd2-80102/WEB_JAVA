package com.app.dao;

import java.util.List;

import org.hibernate.HibernateException;

import com.app.pojos.Team;


public interface TeamDao {
//add a method to add new team
	String addNewTeam(Team newTeam) ;
	//Display  team id n abbreviation of all the teams
	List<Team> displayAbvAndTeamId();
	//Display team details , of a team by it's id
	 Team displayTeamById(Integer id);
	 //Display all those teams who need ,
	 //player's max age < specific age n min no of wickets taken > specified wickets
	 List<Team> getTeamsWithMaxAgeAndNoOfWickets(Integer age,Integer wickets);
	 //. Update max age n batting avg requirement of a specific team by it's name (team name is unique)
	 String UpdateTeamForBattingAvgAndMaxAge(String teamname,Integer maxage,double battingAvg);
}
