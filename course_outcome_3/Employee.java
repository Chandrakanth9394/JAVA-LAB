package course_outcome1;
import java.util.*;
public class Employee {
int eno,esalary;
String ename;
Employee(int i,String j,int k)
  {
	eno=i;
	ename=j;
	esalary=k;
  }
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number of employee:");
		int n=sc.nextInt();
		sc.nextLine();
		Employee emp[]=new Employee[n];
		for (int i=0;i<n;i++)
		{
		  System.out.println("Employee"+(i+1));
		  System.out.println("enter the employee name:");
		  String b=sc.nextLine();
		  System.out.println("enter the employee number:");
		  int a=sc.nextInt();
		  System.out.println("enter the employe salary:");
		  int c=sc.nextInt();
			sc.nextLine();
		  emp[i]=new Employee(a,b,c);
		  
		}
		System.out.println("Enter the Employee number to search");	
		int q=sc.nextInt();
		int flag=0;
		for(int i=0;i<n;i++){
			if(emp[i].eno==q){
					flag=1;
					System.out.println("Employee number="+emp[i].eno);
					System.out.println("Employee name="+emp[i].ename);
					System.out.println("Employee Salary="+emp[i].esalary);
			}
		}
		if(flag==0){
			System.out.println("No such employee");
		}

	}

}
