import java.util.*;
public class matrix {

	public static void main(String[] args) {
		int row,coloum;
		int a[][]=new int[50][50];
		int b[][]=new int[50][50];
		int c[][]=new int[50][50];
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the rows:");
		row=sc.nextInt();
		System.out.println("enter the coloum:");
		coloum=sc.nextInt();
		System.out.print("enter the first matrix:");
		 for(int i=0;i<row;i++)
		   {
			 for(int j=0;j<coloum;j++)
			   {
				 a[i][j]=sc.nextInt();
			   }
		   }
		 System.out.println("the first matrix is");
		  for(int i=0;i<row;i++)
		      {
		        for(int j=0;j<coloum;j++)
		           {
		        	 System.out.print(a[i][j]+" ");
		           } 
		        System.out.println("");
		      }
		  System.out.println("enter the second matrix:");
			 for(int i=0;i<row;i++)
			   {
				 for(int j=0;j<coloum;j++)
				   {
					 b[i][j]=sc.nextInt();
				   }
			   }
			 System.out.println("the second matrix is");
			  for(int i=0;i<row;i++)
			      {
			        for(int j=0;j<coloum;j++)
			           {
			        	 System.out.print(b[i][j]+" ");
			           } 
			        System.out.println("");
			      }
			 System.out.println("matrix addition:");
			  for(int i=0;i<row;i++)
			     {
				  for(int j=0;j<coloum;j++)
				      { 
					    c[i][j]=a[i][j]+b[i][j];
					    System.out.print(c[i][j]+" ");
				      }
				  System.out.println("");
			      }
                 }
	}
