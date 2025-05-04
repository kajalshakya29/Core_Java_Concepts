public class JoinExce
{
	public static void main(String[] args)throws Exception
	{
		JoinDemo jd1 = new JoinDemo();
	    JoinDemo jd2 = new JoinDemo();
		JoinDemo jd3 = new JoinDemo();
		System.out.println("First thread start");
		jd1.start();
		System.out.println("First thread running");
		Thread.sleep(2000);
		jd1.join();
		System.out.println("Second thread start");
		jd2.start();
		Thread.sleep(10000);
		jd2.join();
		System.out.println("second thread running");
		jd3.start();
		Thread.sleep(4000);
		jd3.join();
		System.out.println("second thread running");
	}
}