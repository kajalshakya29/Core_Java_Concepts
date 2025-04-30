public class  Parameter
{
	int i ;
	int j ;
	int k;
	public Parameter(int i , int j)
	{
		this.i = i;
		this.j = j;
	}
	public int sum()
	{
		k = i + j;
		return k;
	}
	public void show()
	{
		//System.out.println(i+ "        "+j);
		System.out.println(k);
	}
}