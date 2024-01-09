package com.app.tester;
import org.hibernate.*;

import com.app.dao.TeamDaoImpl;
import com.app.pojos.Team;

import static com.app.utils.HibernateUtils.getFactory;

import java.util.Scanner;
public class AddNewTeam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(SessionFactory sf=getFactory();Scanner sc=new Scanner(System.in))
		{
			System.out.println("Enter Tean Details Teamname,abb,ownername,mxage,battingavg,wicketsTaken");
			//String name, String abbreviation, String ownerName, int maxAge, double battingAvg, int wicketsTaken
			Team team=new Team(sc.next(),sc.next(),sc.next(),sc.nextInt(),sc.nextDouble(),sc.nextInt());
			TeamDaoImpl teamDao=new TeamDaoImpl();
			
			String message=teamDao.addNewTeam(team);
			System.out.println(message);
		}//sf.close -->Hibernate will auto clean up DBCP
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
