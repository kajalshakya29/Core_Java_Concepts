package excp;
import excp.AgeException;
import excp.SalaryException;
public class Check_Demo
{
	
	
	    public void checkAge(String age) throws AgeException,NumberFormatException
	     {
			int a1 = Integer.parseInt("age");
			if(a1<18)
			{
			throw new AgeException("you are not eligible for vote");
			}
			else
			{
				System.out.println("you are eligible for vote");
			}
		
		 }
			
			public void checkSalary(String sal) throws SalaryException,NumberFormatException
		{
			int a1 = Integer.parseInt("sal");
			if(a1<25000)
			{
			throw new SalaryException("your salary is not good");
			}
			else
			{
				System.out.println("your salary is good");
			}
		}
     
}


