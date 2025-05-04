public class ThreadPriorityDemo
{
	public static void main(String[] args)
	{
		ThreadPriority t=new ThreadPriority();
		t.setPriority(1);
		t.start();
		for(int i=0; i<=11; i++)
		{
			//Thread.sleep(10000);
			System.out.println("main thread");
		}
	}
}