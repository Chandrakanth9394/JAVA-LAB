import java.util.*;
public class Sort {

	public static void main(String[] args) {
		String s[]=new String[10];
		String temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		for(int i=0;i<5;i++)
		{
			s[i]=sc.nextLine();
		}
		for(int i=0;i<5;i++)
		{
			System.out.println(s[i]);
		}
		for(int i=0;i<5;i++)
		{
			for(int j=i+1;j<5;j++)
			{
				if(s[i].compareTo(s[j])>0)
				{
					temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			}
		}
		System.out.println("The sorted string is");
		for(int i=0;i<5;i++)
		{
			System.out.println(s[i]);
		}

	}

}
