package exceptionHandlig;

public class InvalidAgeException extends Exception
{
	public InvalidAgeException()
	{
		System.out.println("InvalidAgeException Object is Created...");
	}
	void dontvote()
	{
		System.out.println("You are not for Eligible to vote...");
	}

}
