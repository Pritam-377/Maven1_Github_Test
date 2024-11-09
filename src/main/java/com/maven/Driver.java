package com.maven;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("girish");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Bank b1=new Bank();
		b1.setId(1);
		b1.setName("SBI");
		b1.setIfsc("SBI123");
		Account a1=new Account();
		a1.setAccid(101);
		a1.setAccbal(10);
		a1.setAcctype("Savings");
		Account a2=new Account();
		a2.setAccid(102);
		a2.setAccbal(20);
		a2.setAcctype("Savings");
		List<Account>acc=new ArrayList<>();
		acc.add(a1);
		acc.add(a2);
		b1.setAcc(acc);
		et.begin();
		em.persist(b1);
		em.persist(a1);
		em.persist(a2);
		et.commit();

	}

}
