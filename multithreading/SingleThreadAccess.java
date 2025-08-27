public class SingleThreadAccess 
{
    public synchronized void accessMethod()
	{
        System.out.println("Thread " + Thread.currentThread().getName() + " is accessing the method.");
        try
		{
            Thread.sleep(1000); 
        } catch (InterruptedException e)
		{
            e.printStackTrace();
        }
        System.out.println("Thread " + Thread.currentThread().getName() + " has finished accessing the method.");
    }

}
