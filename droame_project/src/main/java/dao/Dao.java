package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Component;

import dto.Customer;
import dto.Operator;
@Component
public class Dao {
	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
	EntityManager  entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	public void addOperator(Operator recoper) {
		// TODO Auto-generated method stub
		entityTransaction.begin();
		entityManager.persist(recoper);
		entityTransaction.commit();
	}
	public void addCustomer(Customer recobj) {
		// TODO Auto-generated method stub
		entityTransaction.begin();
		entityManager.persist(recobj);
		entityTransaction.commit();
		
	}
	public Operator findop(int operator_id) {
		// TODO Auto-generated method stub
		entityTransaction.begin();
		Operator operator=entityManager.find(Operator.class, operator_id);
		entityTransaction.commit();
		
		return operator;
		
	}
	
	

}
