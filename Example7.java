package Thread;

public class Example7  implements Runnable
{
	public void run()
	{
	  for(int i=1;i<=10;i++)
	  {
		  System.out.println("User Thread");
	  }
	}

	public static void main(String[] args)
	{
			Example7 e=new Example7();
			Thread t=new Thread(e);
			t.start();
		
		for(int i=1;i<=10;i++)
		  {
			  System.out.println("main Thread");
		  }
	}

}
