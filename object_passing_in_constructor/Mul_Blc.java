public class Mul_Blc
{
	int i, j, k; 
	public Mul_Blc(int i , int j)
	{
		this.i = i;
		this.j = j;
	}
	public int multiply()
	{
		k = i*j;
		return k;
	}
	public void show()
	{
		System.out.println(k);
	}
}