package threadDemo;

public class Demon implements Runnable
{
	public void run()
	{
		for(int j = 100; j<=110; j++ )
		{
			System.out.println("j value = "+j);
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



