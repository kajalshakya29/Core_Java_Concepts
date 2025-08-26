public class CheckInteger
{
	int i;
	int j;
	public void assign(int i,int j)
	{
		this.i=i;
		this.j=j;
	}
	public boolean check()
	{
		if(i%10==j%10)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}