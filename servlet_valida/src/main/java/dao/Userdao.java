package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Userdto;

public class Userdao {
	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	public void insert(Userdto userdto) {
		// TODO Auto-generated method stub
		entityTransaction.begin();
		entityManager.persist(userdto);
		entityTransaction.commit();
		
	}
	
	public Userdto fetch(String username) {
		// TODO Auto-generated method stub
		Userdto u=entityManager.find(Userdto.class, username);
		return u;
	}
	
	

}
