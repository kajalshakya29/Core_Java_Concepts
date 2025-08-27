public class MyAdditionThread extends Thread
{
	MyAddition a;
	String name;
	int[] num;
	public MyAdditionThread(MyAddition a, String name, int[] num)
	{
		this.a=a;
		this.name=name;
		this.num=num;
	}
	public void run()
	{
		a.add(name,num);
	}
}