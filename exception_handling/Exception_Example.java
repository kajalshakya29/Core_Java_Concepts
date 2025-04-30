public class Exception_Example
{

	public static void main(String args[])
	{
		int i,j,k;
		try {
			i = Integer.parseInt(args[0]);
			j = Integer.parseInt(args[1]);
			k = i/j;
			System.out.println(k);
			}
		catch(NumberFormatException ne)
		{
			System.out.println("Please pass only numeric value");
		}
		catch(ArithmeticException a)
		{
			System.out.println("Do not pass zero for the denominator");
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("Please pass only 2 value");
		}
		finally
		{
			System.out.println("Resourse is freed");
		}
	}
	
}