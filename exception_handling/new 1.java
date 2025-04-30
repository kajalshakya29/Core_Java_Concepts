public class Exception_Example1
{
	public int divide(String s1, String s2) throws NumberFormatException ArithmeticException
	{
		int i1 = Integer.parseInt(s1);
		int i2 = Integer.parseInt(s2);
		return i1/i2;
	}
}
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