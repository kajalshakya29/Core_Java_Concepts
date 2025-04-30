public class Exception_Exe
{
	public static void main(String args[])
	{
		try
		{
			Exception_Example1 e = new Exception_Example1();
			int result = e.divide(args[0], args[1]);
			System.out.println("Result is" + result);
			}
			catch(NumberFormatException ne)
			{
			System.out.println("Do not pass non- numeric value");
			}
			catch(ArithmeticException ae)
			{
			System.out.println("Do not pass zero in the denominator");
			}
		
		
	}
}