import java.util.*;
public class Search_an_element {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		int n,s,flag=0;
		System.out.println("Enter the size");
		n=sc.nextInt();
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter element to be searched");
		s=sc.nextInt();
		System.out.println("Elements are");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		for(int i=0;i<n;i++)
		{
			if(s==a[i])
			{
				flag=1;
				System.out.println("Element found");
			}
		}
		if(flag==0)
		{
			System.out.println("Element not found");
		}
		
	}

}
