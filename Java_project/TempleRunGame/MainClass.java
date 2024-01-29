package threadDemo;

public class MainClass
{
	public static void main(String[] args) 
	{
		Hero h1 = new Hero();
		Hero h2 = new Hero();
		
		h1.start();
		h2.start();
		
		Demon d1 = new Demon();
		Demon d2 = new Demon();
		
		Thread t1 = new Thread(d1);
		Thread t2 = new Thread(d2);
		
		t1.start();
		t2.start();
	}

}
