package com.brachlist.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.brachlist.entity.User;

@Repository
public class UserDAO {

	@PersistenceContext
	private EntityManager entityManager;
	
	public User getById(int id){
		// made step by step
		String query = "select u from User u where u.id = :id";
		User user = null;
		
		TypedQuery<User> typedQuery = entityManager.createQuery(query, User.class);
		typedQuery.setParameter("id", id);
		
		user = typedQuery.getSingleResult();
		
		return user;
	}
	
	public User getByUsername(String username){
		User user = entityManager.createQuery("select u from User u where lower(u.username) = lower(:username)", User.class).setParameter("username", username).getSingleResult();
		
		return user;
	}
	
}
