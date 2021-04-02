package Thread;

public class Example3 extends Thread
{
	/*public void start()
	{
		System.out.println("this is start method of example 3 classs");
	}*/
      public void run()
      {
    	  System.out.println("Example3 class this is run method");
      }
	public static void main(String[] args)
	{
		Example3 e=new Example3();
		e.start();

	}

}
