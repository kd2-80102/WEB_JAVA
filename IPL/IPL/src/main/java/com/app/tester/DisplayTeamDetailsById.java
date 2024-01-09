package com.app.tester;
import org.hibernate.*;

import com.app.dao.TeamDaoImpl;
import com.app.pojos.Team;

import static com.app.utils.HibernateUtils.getFactory;

import java.util.List;
import java.util.Scanner;
public class DisplayTeamDetailsById {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(SessionFactory sf=getFactory();Scanner sc=new Scanner(System.in))
		{
			
			TeamDaoImpl teamDao=new TeamDaoImpl();
			Team team=teamDao.displayTeamById(sc.nextInt());
			//dao.getAllEmps().forEach(System.out::println);
			System.out.println(team);
		}//sf.close -->Hibernate will auto clean up DBCP
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
