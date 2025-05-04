public class MyAdditionThreadDemo
{
	public static void main(String[] args)
	{
		MyAddition a1 = new MyAddition();
		//MyAddition a2 = new MyAddition();
		int[] num1= {10,20,30,40};
		int[] num2= {5,15,25,35,45};
		MyAdditionThread at1 = new MyAdditionThread(a1,"John ",num1);
		
		MyAdditionThread at2 = new MyAdditionThread(a1,"Peter ",num2);
		at1.start();
		at2.start();
	}
}