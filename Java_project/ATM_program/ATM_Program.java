package practice_programs;

import java.util.Scanner;
public class ATM_Program 
{
	static double a=10000.0;
	public static double deposite(double b)
	{
		if(b>0)
		{
			System.out.println("current value : "+ a);
			System.out.println("deposite amount : "+b);
			a=a+b;
			System.out.println("after taransaction : "+a);
		}
		else
		{
			System.out.println("Invalid Amount");
		}
		return a;
	}
	public static double withdraw(double b)
	{
		if(b>0&&b<=a)
		{
			System.out.println("current value : "+ a);
			System.out.println("withdraw amount : "+b);
			a=a-b;
			System.out.println("after taransaction : "+a);
		}
		else
		{
			System.out.println("Invalid Amount");
		}
		return a;
	}
	public static double balance_enq(double b)
	{
		System.out.println("balance : "+a);
		return a;
	}
	public static void transaction(int c,double b)
	{
		switch(c)
		{
		case 1:deposite(b);
		break;
		case 2: withdraw(b);
		break;
		case 3:balance_enq(b);
		break;
		default:System.out.println("Invalid transaction");
		
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the pin number : ");
		int n=sc.nextInt();
		if(n==1234)
		{
			System.out.println("enter the case");
			int c=sc.nextInt();
			System.out.println("enter the aumount");
			double m=sc.nextDouble();
			transaction(c, m);
		}
		else
		{
			System.out.println("Invalid Pin Number");
		}
		
	}

}
