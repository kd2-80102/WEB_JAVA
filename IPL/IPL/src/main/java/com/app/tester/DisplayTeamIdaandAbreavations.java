package com.app.tester;
import org.hibernate.*;

import com.app.dao.TeamDaoImpl;
import com.app.pojos.Team;

import static com.app.utils.HibernateUtils.getFactory;

import java.util.List;
import java.util.Scanner;
public class DisplayTeamIdaandAbreavations {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(SessionFactory sf=getFactory();Scanner sc=new Scanner(System.in))
		{
			
		TeamDaoImpl team=new TeamDaoImpl();
		List<Team> list=team.getTeamsWithMaxAgeAndNoOfWickets(sc.nextInt(), sc.nextInt());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
