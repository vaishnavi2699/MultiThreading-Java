package Thread;

import java.util.Scanner;

public class Example4 extends Thread
{
	public void run()
	{
	 int total=0,num1=0,num2=0;
	 Scanner s=new Scanner(System.in);
	 System.out.println("Enter numbers to print sum of the digits: ");
	 num1=s.nextInt();
	 num2=s.nextInt();
     total=num1+num2;
     System.out.println("Total is: "+total);
	 
	}

	public static void main(String[] args) 
	{
	   Example4 e=new Example4();
	   e.start();

	}

}
