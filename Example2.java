package Thread;

public class Example2  extends Thread
{
	public void start()
    {
  	  System.out.println("Example2 class this is start method");
    }

      public void  run()
      {
    	  System.out.println("Example2 class this is Run method");
      }
	public static void main(String[] args)
	{
		Example2 e=new Example2();
		e.start();
		
	}

}
