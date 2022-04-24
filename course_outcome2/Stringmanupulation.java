import java.util.*;
public class Stringmanupulation {

	public static void main(String[] args) {

		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		str=sc.nextLine();
		System.out.println("size of string "+str.length());
		System.out.println("The index of a is "+str.indexOf('a'));
		System.out.println("character at position 4 is "+str.charAt(4));
		System.out.println("Compare function "+str.compareTo("hello"));
		System.out.println("Contain function "+str.contains("hello"));
		System.out.println("endswith function "+str.endsWith("r"));
	}

}
