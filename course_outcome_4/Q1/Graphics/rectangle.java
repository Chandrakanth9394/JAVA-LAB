package Graphics;
interface rect 
    {
      public void area(int len,int bre);	
    }
public class rectangle implements rect 
    {
      public void area(int len,int bre)
        {
    	  System.out.println("area of rectangle:"+len*bre); 
        }
    }
