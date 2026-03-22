public class Division_Exception 
{
	static int i,j,k;
	public static void main(String args[])
	{
		try
		{
			i = Integer.parseInt(args[0]);
			j = Integer.parseInt(args[1]);
			k = i/j;
			System.out.println(k);
		}
		catch(NumberFormatException ne)
		{
			System.out.println("Please pass only numeric value");
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Do not pass zero for denominator");
		}
		catch(ArrayIndexOutOfBoundsException ai)
		{
			System.out.println("Please pass only 2 values");
		}
		finally
		{
			System.out.println("Resource is freed");
		}
	}
}