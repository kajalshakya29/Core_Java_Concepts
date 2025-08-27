public class MyThread extends java.lang.Thread
{
	public void run()
	{
		for(int i=0; i<=10; i++)
		{
			System.out.println("child thread");
			Thread.sleep(2000);
		}
	}
}