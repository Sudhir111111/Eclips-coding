package p1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterStream {
	public static void main(String[] args) {
		List<Integer> arr=Arrays.asList(10,20,3,7,100,13);
		List<Integer> collect = arr.stream().filter(x->x%2!=0).collect(Collectors.toList());
		System.err.println("The Even Numbers Are :"+collect);
		
		
		
		List<String> asList = Arrays.asList("sudhir","lipu","sudee","balaram");
		List<String> collect2 = asList.stream().filter(s->s.startsWith("s")).collect(Collectors.toList());
		
	System.out.println(collect2);
	
	List<String> t = Arrays.asList("sudhir","lipu","sudee","balaram");
	List<String> collect3 = t.stream().filter(s->s.equalsIgnoreCase("sudhir")).collect(Collectors.toList());
	
System.out.println(collect3);



List<Integer> list = Arrays.asList(10,20,30,40);
List<Integer> collect4 = list.stream().map(x->x*2).collect(Collectors.toList());
System.out.println(collect4 );



List<String> list1 = Arrays.asList("sudhir","lipu","sudee","balaram");
List<String> collect5 = list1.stream().map(s->s.toUpperCase()).collect(Collectors.toList());


System.out.println(collect5);

List<String> list2 = Arrays.asList("SUDHIR","LIPU","SUDEE","BALARAM");
List<String> collect6 = list2.stream().map(s->s.toLowerCase()).collect(Collectors.toList());


System.out.println(collect6);


List<String> list3 = Arrays.asList("sudhir","lipu","sudee","balaram");
List<String> collect7 = list3.stream().sorted().collect(Collectors.toList());


System.out.println(collect7);




	
		
	}

}

