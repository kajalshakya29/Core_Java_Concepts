package excp;
import excp.AgeException;
import excp.SalaryException;
import excp.Check_Demo;
public class User_Defined_Exception_Demo
{
	public static void main(String[] args)
	{
		try
		{
			{
				Check_Demo cd = new Check_Demo();
				cd.checkSalary("1000");
				cd.checkAge("15");
			}
		}
		catch(AgeException ae)
		{
			ae.printStackTrace();
		}
		catch(SalaryException sal)
		{
			sal.printStackTrace();
		}
	}
}

           

