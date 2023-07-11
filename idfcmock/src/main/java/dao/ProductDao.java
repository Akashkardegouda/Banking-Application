package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Component;

import dto.ProductDto;
@Component
public class ProductDao {

	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	public void insert(ProductDto recobj) {
		// TODO Auto-generated method stub
		entityTransaction.begin();
		entityManager.persist(recobj);
		entityTransaction.commit();
		
	}
	public ProductDto fetch(int pid) {
		// TODO Auto-generated method stub
		ProductDto dto=entityManager.find(ProductDto.class, pid);
		return dto;
		
	}
	
	
}
