package Thread;

import java.util.Scanner;

public class Example6 extends Thread
{

   public void run()
 {
	 int num1,num2,total=0;
	 Scanner s=new Scanner(System.in);
	 System.out.println("Enter numbers to print subtraction of digits");
	 num1=s.nextInt();
	 num2=s.nextInt();
	 total=num1-num2;
	 System.out.println("total is: "+total);
 }
	public static void main(String[] args) 
	{
		Example6 e=new Example6();
		e.start();
 
	}

}
