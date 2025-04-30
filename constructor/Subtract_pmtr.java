public class Subtract_pmtr
{
	int i,j,k;
	public Subtract_pmtr(int i, int j)
	{
		this.i = i;
		this.j = j;
	}
	public int subtract()
	{
		k = i -j;
		return k;
	}
	public void show()
	{
		System.out.println("ans = " + k);
	}
}