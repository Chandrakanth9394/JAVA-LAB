package course_outcome1;
import java.util.Scanner;

class person1
{
	String name,address,gender;
	int age;
	person1()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		name=sc.nextLine();
		System.out.println("enter address");
		address=sc.nextLine();
		System.out.println("enter gender");
		gender=sc.nextLine();
		System.out.println("enter age");
		age=sc.nextInt();
	}
}
class employee1 extends person1
{
	String empid,company,qualification;
	int salary;
	employee1()
	{
		super();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter empid");
		empid=sc.nextLine();
		System.out.println("enter company");
		company=sc.nextLine();
		System.out.println("enter qualification");
		qualification=sc.nextLine();
		System.out.println("enter salary");
		salary=sc.nextInt();
	
	}
	
}
class teacher1 extends employee1
{
	String subject,department,teacherid;
	teacher1()
	{
		super();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter subject");
		subject=sc.nextLine();
		System.out.println("enter department");
		department=sc.nextLine();
		System.out.println("enter teacherid");
		teacherid=sc.nextLine();
	}
	void display()
	{
		System.out.println("name: "+name);
		System.out.println("address: "+address);
		System.out.println("gender: "+gender);
		System.out.println("age: "+age);
		System.out.println("empid: "+empid);
		System.out.println("company: "+company);
		System.out.println("qualification: "+qualification);
		System.out.println("subject: "+subject);
		System.out.println("department: "+department);
		System.out.println("salary: "+salary);
		System.out.println("teacherid: "+teacherid);
	}
}
public class Person {

	public static void main(String[] args) {
		int n;
		System.out.println("enter number of teachers");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		teacher1 t1[]=new teacher1[10];
		for(int i=0;i<n;i++)
		{
		  t1[i]=new teacher1();
			
		}
		for(int i=0;i<n;i++)
		{
		  t1[i].display();
			
		}

	}

}
