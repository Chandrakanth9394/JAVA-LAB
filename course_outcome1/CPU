package course_outcome1;

public class CPU {
	int price;
	CPU(int priz)
	  {
		 price=priz;
	  }
	public class processor 
	   {
		 int no_of_core;
		 String manufacture;
		 processor(int noc,String manuf)
		   {
			 no_of_core=noc;
			 manufacture=manuf;
		   }
		 void display()
		   {
			 System.out.println("the CPU details");
			 System.out.println("price="+price);
			 System.out.println("the processor details:");
			 System.out.println("no_of_core="+no_of_core);
			 System.out.println("manufacture::"+manufacture);
			 
		   }
       }
	static class ram
    	{
		  int memory;
		  String manufacture1;
		  ram(int size,String manu1)
		    {
			  memory=size;
			  manufacture1=manu1;
		    }
		  void display()
		  {
			  System.out.println("the RAM details:");
			  System.out.println("size of the memory::"+memory+"gb");
			  System.out.println("Name of the manufacturer::"+manufacture1);
		  }
	    }

	public static void main(String[] args) {
		CPU sc=new CPU(20000);
		CPU.processor sc1=sc.new processor(7,"ACER");
		CPU.ram sc2=new CPU.ram(8,"intel");
		sc1.display();
		sc2.display();
		
	}

}
