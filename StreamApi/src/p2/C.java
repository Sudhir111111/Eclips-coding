package p2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class C {
	public static void main(String[] args) {
		A a1=new A();
		a1.setName("sudhir");
		A a2=new A();
		a2.setName("sudee");
		A a3=new A();
		a3.setName("rahul");
		List<A> asList = Arrays.asList(a1,a2,a3);
		List<B> collect = asList.stream().map(x->convertToB(x)).collect(Collectors.toList());
		System.out.println(collect);

System.out.println(asList);
		
	}
	
	static B convertToB(A a) {
		
		B b1=new B();
		b1.setName(a.getName());
		return b1;
		
		
	}

}
