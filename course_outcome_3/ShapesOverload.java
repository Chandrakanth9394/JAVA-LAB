package course_outcome1;
import java.util.*;
public class Shapes {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		Shapeoverload kl= new Shapeoverload();
		System.out.println("enter the side of the sqaure:");
		int a=sc.nextInt();
		System.out.println("enter the length and breadth:");
		int b=sc.nextInt();
		int c=sc.nextInt();
		System.out.println("enter the radius of the circle:");
		double d=sc.nextDouble();
		kl.area(a);
		kl.area(b,c);
		kl.area(d);
		
	}

}
class Shapeoverload 
   {
	  void area(int x)
	      {
		   System.out.println("the area of the  square is:"+Math.pow(x,2)+"sq units");
	      }
	  void area(float x,float y)
      	  {
		   System.out.println("the area of the rectangle is"+x*y+"sq units");
	      }
	  void area(double x)
	      {
		   System.out.println("the area of circle is :"+3.14*x*x+"sq units");
	      }
   }
