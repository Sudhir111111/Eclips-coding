package p1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApi {

	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		List<Comparable> list1 = Arrays.asList(2,4,50,21,22,"sudhir");
//		list1.add(2);
//		list1.add(4);
//		list1.add(50);
//		list1.add(21);
//		list1.add(22);

//		List<Integer> newlist = list1.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
//		System.out.println(newlist);
	@SuppressWarnings("rawtypes")
	Stream<Comparable> l=list1.stream();
	l.forEach(e->System.out.println(e));
	}

}
