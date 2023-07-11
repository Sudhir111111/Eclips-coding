package p1;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Test {

	public static void main(String[] args) {
		Hibernet hr=new Hibernet();
	
		hr.setId(9);
		hr.setName("sss");
		EntityManagerFactory E = Persistence.createEntityManagerFactory("dev");
		EntityManager m = E.createEntityManager();
		
		
		EntityTransaction t = m.getTransaction();
		m.persist(hr);
		t.begin();
		t.commit();
		
}
}
