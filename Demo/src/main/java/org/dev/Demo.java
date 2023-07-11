package org.dev;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import p1.Hibernet;

public class Demo {

	public static void main(String[] args) {
		Hibernet h = new Hibernet();
//		h.setId(2);
//		h.setName("xyz");
		
		h.setId(2);
		h.setName("pqr");
		EntityManagerFactory f = Persistence.createEntityManagerFactory("dev");
		EntityManager m = f.createEntityManager();
		EntityTransaction t = m.getTransaction();
		m.merge(h);
		t.begin();
		t.commit();

	}

}
