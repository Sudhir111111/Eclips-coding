import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class A {
	@Test
public void test1() {
	
	
	System.out.println("test1");
}
	@Test
	public void test2() {
		
		System.out.println("test2");
	}
	@After  
	public void test3() {
		System.out.println("test3");
		
	}
}
