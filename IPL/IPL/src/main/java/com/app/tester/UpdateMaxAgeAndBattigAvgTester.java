package com.app.tester;

import java.util.Scanner;
import static com.app.utils.HibernateUtils.getFactory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.app.dao.TeamDaoImpl;



public class UpdateMaxAgeAndBattigAvgTester 
{
	public static void main(String args[])
	{
	try(SessionFactory session=getFactory();Scanner sc=new Scanner(System.in))
	{
		System.out.println("Enter teamname maxx age and Batting Average");
		String tname=sc.next();
		int maxage=sc.nextInt();
		double battingavg=sc.nextDouble();
		TeamDaoImpl td=new TeamDaoImpl();
		
	System.out.println(td.UpdateTeamForBattingAvgAndMaxAge(tname, maxage, battingavg));
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}

}}