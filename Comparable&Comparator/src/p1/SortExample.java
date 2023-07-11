package p1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortExample {

	public static void main(String[] args) {
		
		ArrayList<Emp> emps=new ArrayList<>();
		emps.add(new Emp("sudhir", "321421", 12));
		emps.add(new Emp("real", "321421", 36));
		emps.add(new Emp("kuku", "321421", 6));

//Collections.sort(emps);
		Collections.sort(emps,new IdComparator());
		
System.out.println(emps);	


ArrayList<Emp> emps1=new ArrayList<>();


Collections.sort(emps1,new NameComparator());
System.out.println(emps1);	


		
	
	}

}
