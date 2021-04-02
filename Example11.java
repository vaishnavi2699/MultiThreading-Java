package Thread;
class Thread1
{
   public  void start()
    {
    	System.out.println("This is start method");
    }
}
public class Example11 extends Thread1
{
	    public void start()
	    {
	    	System.out.println("This is start method");
	    }
   public static void main(String[] args) 
	{
		Example11 e=new Example11();
		e.start();

	}

}
