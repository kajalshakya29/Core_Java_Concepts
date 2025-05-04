public class My_Slope_Blc
{
	int y,m,x,c;
	public void assign(int  m,int x,int c)
	{
		this.m = m;
		this.x = x;
		this.c = c;
	}
	public int calc()
	{
		y = (m*x)+ c;
		return y;
	}
	public  void show()
	{
		System.out.println("slope is : "+ y);
	}

}