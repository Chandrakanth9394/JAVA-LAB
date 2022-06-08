package Area;
import java.util.*;
import Graphics.rectangle;
import Graphics.Circle;
import Graphics.Sqaure;
import Graphics.Triangle;
public class co4q1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int l,b,s,r,h;
		rectangle re=new rectangle();
		Sqaure sq=new Sqaure();
		Circle c=new Circle();
		Triangle t=new Triangle();
		
		System.out.println("enter the length :");
		l=sc.nextInt();
		System.out.println("enter the  breadth:");
		b=sc.nextInt();
		re.area(l,b);
		System.out.println("enter the heigth of the triangle:");
		h=sc.nextInt();
		System.out.println("enter the base of the triangle:");
		b=sc.nextInt();
		t.area(h,b);
		System.out.println("enter the side of the square:");
		s=sc.nextInt();
		sq.area(s);
		System.out.println("enter the radius of the circle:");
		r=sc.nextInt();
		c.area(r);
		}

}
