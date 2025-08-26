public class MyTest
{
	int i;
	MyTest(int i)
	{
		this.i=i;
	}
	public static void main(String[]args)
	{
		MyTest t1= new MyTest(10);
		MyTest t2 = new MyTest(100);
		System.out.println(t1);
		System.out.println(t2);
	}

}