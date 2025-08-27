public class ThreadPriority extends Thread
{
	public void run()
	{
		for(int i=0; i<10; i++)
		{
			//Thread.sleep(2000);
			System.out.println("child class");
			
		}
	}
}