package Graphics;
interface cir 
  {
	 public void area(int r );
  }
public class Circle implements cir
   {
     public void area (int r)
       {
    	 System.out.println("area of circle:"+3.14*r*r); 
       }
   }
