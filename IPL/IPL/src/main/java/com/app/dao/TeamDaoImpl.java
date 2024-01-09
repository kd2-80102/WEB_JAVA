package com.app.dao;
import com.app.pojos.Team;
import org.hibernate.*;
import org.hibernate.SessionFactory;
import static com.app.utils.HibernateUtils.getFactory;

import java.io.Serializable;
import java.util.List;
public class TeamDaoImpl implements TeamDao {
	@Override
	public String addNewTeam(Team newTeam) {
		String message="Adding team failed";
		//1.Get session from SF.
		Session session=getFactory().getCurrentSession();
		//Begin a tranction
		Transaction tx=session.beginTransaction();
		
		//3.try -save team details,commit,catch:runtime exception:roll,throw e
		try {
			Serializable teamid=session.save(newTeam);

			tx.commit();
			//
			System.out.println("New Team added Successfully");
			message="Team added successfully"+teamid;
		}
		catch(RuntimeException e)
		{
				if(tx!=null)
				tx.rollback();
				throw e;
		}
		return message;
	}

	@Override
	public List<Team> displayAbvAndTeamId() {
		Session session=getFactory().getCurrentSession();
		Transaction tx=session.beginTransaction();
		List<Team> team=null;
		String jpql="select new com.app.pojos.Team(t.teamId,t.abbreviation) from Team t";
		try {
			team=session.createQuery(jpql,Team.class).getResultList();
		
			tx.commit();
		}
		catch(RuntimeException e)
		{
			e.printStackTrace();
			tx.rollback();
		}
		
		return team;
	}

	@Override
	public Team displayTeamById(Integer id) {
		Team team=null;
		Session session=getFactory().getCurrentSession();
		Transaction tx=session.beginTransaction();
		try
		{
			team=session.get(Team.class,id);
			tx.commit();
		}
		catch(RuntimeException e)
		{
			e.printStackTrace();
			tx.rollback();
		}
		return team;
	}

	@Override
	public List<Team> getTeamsWithMaxAgeAndNoOfWickets(Integer age, Integer wickets) {
		List<Team> team=null;
		String jpql="select t from Team t where t.maxAge <:ma and t.wicketsTaken > :wt";
		Session session=getFactory().getCurrentSession();
		Transaction tx=session.beginTransaction();
		try
		{
			team=session.createQuery(jpql,Team.class).setParameter("ma", age).setParameter("wt",wickets).getResultList();
		tx.commit();
		}
		catch(RuntimeException e)
		
		{
		e.printStackTrace();
		tx.rollback();
		}
		
		return team;
	}

	@Override
	public String UpdateTeamForBattingAvgAndMaxAge(String teamname, Integer maxage, double battingAvg) {
		String message="Team not Updated";
		Team team=null;
		// 1. get session from SF
		Session session=getFactory().getCurrentSession();
		//2. begin a tx
		String jpql="Select t from Team t where t.name=:teamname";
		Transaction tx=session.beginTransaction();
		try {
		 team=session.createQuery(jpql,Team.class).setParameter("teamname",teamname).getSingleResult();
			team.setMaxAge(maxage);
			team.setBattingAvg(battingAvg);
			
			
			tx.commit();
			message="Team details updated ";
		} catch (RuntimeException e) {
			if(tx != null)
				tx.rollback();
			throw e;
		}
	
		return message;
	}

	

	
	
	

}
