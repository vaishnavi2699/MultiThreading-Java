package Thread;

public class Example1 extends Thread
{
     public void run()
     {
    	 System.out.println("Example1 class Run method ");
     }
	public static void main(String[] args) 
	{
		Example1 e=new Example1();
		e.start();

	}

}
