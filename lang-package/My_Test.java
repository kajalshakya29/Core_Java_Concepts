class My_Test
{
	int i;
	My_Test(int i)
	{
		this.i=i;
	}
	public int hashcode()
	{
		return i;
	}
	public static void main(String[] args)
	{
		My_Test t1=new My_Test(10);
		My_Test t2= new My_Test(100);
		System.out.println(t1);
		System.out.println(t2);
	}
}