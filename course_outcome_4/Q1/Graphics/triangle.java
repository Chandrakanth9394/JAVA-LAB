package Graphics;
interface tir 
   {
	 public void area(int b,int h);
   }
public class Triangle  implements tir
   {
     public void area (int b,int h)
         {
    	   System.out.println("area of triangle :"+0.5*b*h);
         }
   }
