package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.BankAccount;

public class BankDao {
	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public void save(BankAccount account) {
		// TODO Auto-generated method stub
		entityTransaction.begin();
		entityManager.persist(account);
		entityTransaction.commit();
		
	}

	public List<BankAccount> fetchAll() {
		// TODO Auto-generated method stub
		return entityManager.createQuery("select x from BankAccount x").getResultList();
	}

	public BankAccount find(long acno) {
		// TODO Auto-generated method stub
		return entityManager.find(BankAccount.class,acno);
		
	}

	public void update(BankAccount account) {
		// TODO Auto-generated method stub
		entityTransaction.begin();
		entityManager.merge(account);
		entityTransaction.commit();
		
	}
	
	

}
