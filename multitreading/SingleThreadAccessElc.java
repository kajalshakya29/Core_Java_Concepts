public class SingleThreadAccessElc 
{
 
 public static void main(String[] args)
    {
        final SingleThreadAccess obj = new SingleThreadAccess();
        Thread t1 = new Thread (new Runnable() 
		{
            public void run()
			{
                obj.accessMethod();
            }
        });

        Thread t2 = new Thread (new Runnable() 
		{
            public void run() 
			{
                obj.accessMethod();
            }
        });
		
        t1.start();
        t2.start();
    }
}
