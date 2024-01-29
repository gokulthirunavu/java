package exceptionHandlig;

import java.util.Scanner;

public class Voting 
{
	public static void main(String[] args) throws InvalidAgeException
	{
		System.out.println("*****************************");
		Scanner src=new Scanner(System.in);
		System.out.println("enter your age");
		int age = src.nextInt();
		//vote(age);
		try
		{
		vote(age);
		}
		catch(InvalidAgeException e)
		{
			e.dontvote();
		}
		
		System.out.println("*****************************");
		
	}

	private static void vote(int age) throws InvalidAgeException 
	{
		if(age>=18)
		{
			System.out.println("Please Proced for Voting...");
		}
		else
		{
			throw new InvalidAgeException();
		}

		
	}

	/*private static void vote(int age) 
	{
		if(age>=18)
		{
			System.out.println("Please Proced For Voting...");
		}
		else
		{
			try
			{
				throw new InvalidAgeException();
			}
			catch(InvalidAgeException e1)
			{
				e1.dontvote();
			}
		}
		
	}*/
	

}
