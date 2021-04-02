package Thread;

public class Example8  extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			try
			{
				Thread.sleep(1000); 
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			System.out.println("User Thread");
		}
	}

	public static void main(String[] args) 
	{
		Example8 e=new Example8();
		e.start();
		for(int i=1;i<=10;i++)
		{
			try
			{
				Thread.sleep(1500); 
			}
			catch(Exception e1)
			{
				System.out.println(e1);
			}
			System.out.println("Main thread");
		}
		

	}

}
