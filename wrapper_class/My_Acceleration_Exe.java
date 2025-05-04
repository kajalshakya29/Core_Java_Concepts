public class My_Acceleration_Exe
{
	public static void main(String[] args)
	{
		float u1 = Float.parseFloat(args[0]);
		float v1 = Float.parseFloat(args[1]);
	    float t1 = Float.parseFloat(args[2]);
		My_Acceleration a1 = new My_Acceleration();
		a1.assign(u1,v1,t1);
		float result = a1.calc();
		System.out.println(result);
		
	}
}	