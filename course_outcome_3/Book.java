package course_outcome1;
import java.util.*;
class book1
  {
	String bname,id;
	book1()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the book name:");
		bname=sc.nextLine();
		System.out.println("enter the book id:");
		id=sc.nextLine();
  }
 }
class publisher extends book1
   {
	 String pname,edition;
	 publisher()
	   {
		  super();
		  Scanner sc=new Scanner(System.in);
		  System.out.println("enter the publisher name:");
		  pname=sc.nextLine();
		  System.out.println("enter the Edition:");
		  edition=sc.nextLine();
		  
	   }
    }
class fiction extends publisher
   {
	 String genre,author;
	 float price;
	 fiction()
	    {
		  Scanner sc=new Scanner(System.in); 
		  System.out.println("enter author");
		  author=sc.nextLine();
		  System.out.println("enter genre");
		  genre=sc.nextLine();
		  System.out.println("enter price");
		  price=sc.nextInt();
	    }
	/* void display()
		{
			System.out.println("Book name "+bname);
			System.out.println("Book id "+id);
			System.out.println("Book author "+author);
			System.out.println("Book genre "+genre);
			System.out.println("Book price "+price);
		}*/
   }
class literature extends publisher
{
	String genre,author;
	float price;
	literature()
	{
		
		super();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter author");
		author=sc.nextLine();
		System.out.println("enter genre");
		genre=sc.nextLine();
		System.out.println("enter price");
		price=sc.nextInt();
	}
	void display()
	{
		System.out.println("Book name "+bname);
		System.out.println("Book id "+id);
		System.out.println("Book author "+author);
		System.out.println("Book genre "+genre);
		System.out.println("Book price "+price);
	
	}
}
	
public class Book {

	public static void main(String[] args) {
		System.out.println("fiction book");
		//fiction f=new fiction();
		System.out.println("Literature");
		literature l=new literature();
		//f.display();
		l.display();	
		
	}

}
