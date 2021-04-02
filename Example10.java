package Thread;

public class Example10 extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("user thread");
		}
	}
public static void main(String[] args)
{
	Example10 e=new Example10();
	e.start();

}
}

	


