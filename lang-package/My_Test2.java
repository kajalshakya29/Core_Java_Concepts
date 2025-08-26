class My_TestExce
{
	int i;
	My_TestExce(int i)
	{
		this.i = i;
	}
	public int hashCode()
	{
		return i;
	}
	public String toString()
	{
		return i + " ";
	}
	public static void main(String[] args)
	{
		My_TestExce t1=new My_TestExce(10);
		My_TestExce t2=new My_TestExce(100);
		System.out.println(t1);
		System.out.println(t2);

		
	}
	
}