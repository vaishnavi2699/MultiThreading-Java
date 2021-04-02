package Thread;

public class Example9 extends Thread
{
	public void run()
	{
		System.out.println("This is run method");
	}
	public void run(int a)
	{
		System.out.println("This is parametrized run method");
	}

	public static void main(String[] args)
	{
		Example9 e=new Example9();
		e.start();

	}

}
