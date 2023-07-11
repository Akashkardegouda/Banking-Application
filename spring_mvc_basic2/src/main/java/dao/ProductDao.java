package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Component;

import dto.ProductDto;
@Component
public class ProductDao {
	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	public void insert(ProductDto recobject) {
		// TODO Auto-generated method stub
		entityTransaction.begin();
		entityManager.persist(recobject);
		entityTransaction.commit();
		
	}
	public void find(int pid, String pname) {
		// TODO Auto-generated method stub
		ProductDto e=entityManager.find(ProductDto.class, pid);
		e.setPname(pname);
		entityTransaction.begin();
		entityManager.merge(e);
		entityTransaction.commit();
		
	}
	public void delete(int pid) {
		// TODO Auto-generated method stub
		ProductDto e=entityManager.find(ProductDto.class, pid);
		entityTransaction.begin();
		entityManager.remove(e);
		entityTransaction.commit();
		
	}
	public ProductDto fetch(int i) {
		// TODO Auto-generated method stub
		ProductDto p1=entityManager.find(ProductDto.class, i);
		return p1;
		
	}
	public List<ProductDto> fetchall() {
		// TODO Auto-generated method stub
		Query query=entityManager.createQuery("select a from ProductDto a");
		List<ProductDto>dto=query.getResultList();
		return dto;
		
	}
	
	

}
