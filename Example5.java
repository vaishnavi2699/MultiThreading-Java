package Thread;

public class Example5 extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("User thread");
		}
	}
	public static void main(String[] args)
	{
		Example5 e=new Example5();
		e.start();
		for(int i=1;i<=10;i++)
		{
			System.out.println("Main thread");
		}
	}
}
