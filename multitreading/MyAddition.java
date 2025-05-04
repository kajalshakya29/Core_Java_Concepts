public class MyAddition
{
	public synchronized void add(String thname,int[] num)
	{
		int total=0;
		for(int i=0; i<num.length; i++)
		{
			total=total+num[i];
		}
		System.out.println("Total calculation by " + thname+"is " + total);
	}
}