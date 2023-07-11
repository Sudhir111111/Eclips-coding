package JavaLogicQuestion;

import java.util.Scanner;

public class NumbeOfWordInString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
System.out.println("Enter String");
String s=sc.nextLine();
int Count=  CountNumber(s);
System.out.println("Number of Words="+Count);
	}
	public static  Integer CountNumber(String s) {
		
		int Count=0;
		if(s.charAt(0)!=' ') {
			Count++;
		}
		for(int i=0;i<s.length();i++) {
		if(s.charAt(i)==' '&& s.charAt(i+1)!=' ') {
			
			Count++;
		}
		
		
	}
		return Count;

}
}
