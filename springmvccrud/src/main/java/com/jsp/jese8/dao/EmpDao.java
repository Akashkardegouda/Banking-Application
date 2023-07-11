package com.jsp.jese8.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Component;

import com.jsp.jese8.dto.EmpDto;
@Component
public class EmpDao {
	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	public void insert(EmpDto recobj) {
		// TODO Auto-generated method stub
		
		entityTransaction.begin();
		entityManager.persist(recobj);
		entityTransaction.commit();
		
	}
	public void delete(String email) {
		// TODO Auto-generated method stub
		EmpDto dto=entityManager.find(EmpDto.class, email);
		entityTransaction.begin();
		entityManager.remove(dto);
		entityTransaction.commit();
		
	}
	public void find(String email, String name) {
		// TODO Auto-generated method stub
		EmpDto e=entityManager.find(EmpDto.class, email);
		e.setName(name);
		entityTransaction.begin();
		entityManager.merge(e);
		entityTransaction.commit();
		
	}
	public EmpDto fetch(String email) {
		// TODO Auto-generated method stub
		EmpDto e=entityManager.find(EmpDto.class, email);
		return e;
		
	}
	public List<EmpDto> fetchAll() {
		// TODO Auto-generated method stub
		Query query=entityManager.createQuery("select a from EmpDto a");
		List<EmpDto>dtos=query.getResultList();
		return dtos;
		
	}

}
