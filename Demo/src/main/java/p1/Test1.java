package p1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Test1 {
	public static void main(String[] args) {
		Hybernet1 hr2 = new Hybernet1();
		hr2.setEmail("sudhir@gmail.com");
		
		hr2.setId(1);
		hr2.setName("rocky");
		EntityManagerFactory f=Persistence.createEntityManagerFactory("dev");
		EntityManager m = f.createEntityManager();
		EntityTransaction t=m.getTransaction();
		m.persist(hr2);
		t.begin();
		t.commit();
		
	}

}
