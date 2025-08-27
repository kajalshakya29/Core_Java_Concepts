public class Yield extends Thread
{
	public void run()
	{
		for(int i=1; i<=10; i++)
		{
			Thread.yield();
			System.out.println("hello" + i);
		}
	}
}