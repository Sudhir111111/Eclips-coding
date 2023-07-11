package JavaLogicQuestion;


public class ReverseWord1 {
public static void main(String[] args) {
	
	String next="My Name Is Sudhir";
	String[] split = next.split(" ");
	for(int i=split.length-1;i>=0;i--) {
		System.out.print(split[i]);
	}
}
}
