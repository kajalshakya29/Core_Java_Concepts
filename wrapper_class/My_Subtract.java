public class My_Subtract 
{
	int a,b,c;
	public void assign(int b,int c)
	{
		this.b = b;
		this.c = c;
	}
	public int calc()
	{
		a = b - c;
		return a;
	}
	public void show()
	{
		System.out.println("Answer is : " + a);
	}
}