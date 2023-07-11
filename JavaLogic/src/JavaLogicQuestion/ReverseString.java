package JavaLogicQuestion;

import java.util.Scanner;

public class ReverseString {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter String");
	String next = sc.next();
	int lang=next.length();
	String rev="";
	for(int i=lang-1;i>=0;i--) {
		rev=rev+next.charAt(i);
		
	}
if(next.equals(rev)) {
	
	System.out.println("Is a palindrom String");
}
else {
	System.out.println("Is not a palindrom String");
}
}
}
