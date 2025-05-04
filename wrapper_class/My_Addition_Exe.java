public class My_Addition_Exe
{
	public static void main(String[] args)
	{
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		My_Addition a = new My_Addition();
		a.assign(num1,num2);
		int ans = a.add();
		System.out.println(ans);
	}
}