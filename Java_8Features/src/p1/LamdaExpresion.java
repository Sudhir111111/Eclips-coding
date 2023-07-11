package p1;

import java.util.ArrayList;

//@FunctionalInterface
//interface Lamd {
//	void show();
//	
//	
//}
//
//public class LamdaExpression {
//public static void main(String[] args) {
//	Lamd t1=()->System.out.println("show");
//	
//	t1.show();
//	
//}
//}

 //PARAMETER lAMDA EXPRESSION


//@FunctionalInterface
//interface Lamd {
//	void show(int x,int y);
//	
//	
//}
//
//public class LamdaExpression {
//public static void main(String[] args) {
//	Lamd t1=(int x,int y)->System.err.println("sum of two number= "+(x+y));
//
//	t1.show(10,20);
//	
//}
//}

//RETURN  lAMDA EXPRESSION

//@FunctionalInterface
//interface Lamd {
//	public int  real(int x);
//	
//	
//}
//
//public class LamdaExpression {
//public static void main(String[] args) {
//	Lamd t1=x->x*x;
//	
//
//	System.out.println(t1.real(5));
//	
//}
//}

// LamdaExpression Use in Multithread

//public class LamdaExpression{
//	public static void main(String[] args) {
//		Runnable rn=()->System.out.println("run");
//		Thread th= new Thread(rn);
//		th.run();
//	}
//	
//}

//LamdaExpression Use in ForEach()

public class LamdaExpresion {
	
public static void main(String[] args) {
	ArrayList arr=new ArrayList();
	arr.add(10);
	arr.add(30);
	arr.add(40);
	arr.forEach((x)-> System.out.println(x));
}
}



