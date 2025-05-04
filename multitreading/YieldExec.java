public class YieldExec
{
	public static void main(String[] args)
	{
		Yield y=new Yield();
		y.start();
		y.setName("john");
		for(int i=1; i<=10; i++)
		{
			System.out.println("hi"+ i);
		}
		
	}
}