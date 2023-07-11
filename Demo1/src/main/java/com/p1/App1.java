package com.p1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;



public class App1 {
	public static void main(String[] args) {
		Student hr=new Student();
	
		hr.setId(1);
		hr.setName("sss");
		hr.setCity("dhenkanal");
		EntityManagerFactory E = Persistence.createEntityManagerFactory("muna");
		EntityManager m = E.createEntityManager();
		EntityTransaction t = m.getTransaction();
		m.persist(hr);
		t.begin();
		t.commit();
		
}
}

