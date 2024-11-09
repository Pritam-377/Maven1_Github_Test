package com.maven;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Find {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("girish");
		EntityManager em=emf.createEntityManager();
		
		Bank b1=em.find(Bank.class, 1);
		if(b1!=null) {
			List<Account>acc=b1.getAcc();
			System.out.println(b1.getId());
			System.out.println(b1.getName());
			System.out.println(b1.getIfsc());
			for(Account a:acc)
			{
				System.out.println(a.getAccid());
				System.out.println(a.getAccbal());
				System.out.println(a.getAcctype());
			}
		}

	}

}
