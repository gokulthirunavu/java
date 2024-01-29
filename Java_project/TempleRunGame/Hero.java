package threadDemo;

public class Hero extends Thread
{
	public void run()
	{
		for(int i = 1; i<= 10; i++)
		{
			System.out.println("i value = "+i);
		
		try {
			Thread.sleep(1000);
			
			} 
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		
		}
	}

}
