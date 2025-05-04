public class My_Acceleration_Exe_Test
{
	public static void main(String[] args)
	{
		float u1 = Float.parseFloat(args[0]);
		int v1 = Integer.parseInt(args[1]);
	    //String t1 = String.parseString(args[2]);
		My_Acceleration_Test a1 = new My_Acceleration_Test();
		a1.assign(u1,v1,t);
		//float result = a1.calc();
		//System.out.println(result);
		a1.show();
		
	}
}	