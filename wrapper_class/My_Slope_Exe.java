public class My_Slope_Exe
{
	public static void main(String[] args)
	{
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		int num3 = Integer.parseInt(args[2]);
		My_Slope_Blc i = new My_Slope_Blc();
		i.assign(num1,num2,num3);
		i.calc();
		i.show();
	}
}