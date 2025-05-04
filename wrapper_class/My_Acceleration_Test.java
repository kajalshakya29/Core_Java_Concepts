public class My_Acceleration_Test
{
	float u;
	int v;
	String t;
	public void assign(int v, float u, String t)
	{
		this.u = u;
		this.v = v;
		this.t = t;
	}
	//public float calc()
	//{
		//a = (v-u)/t;
		//return a;
		//System.out.println("Acceleration will be: "+ a);
	//}
	public void show()
	{
		System.out.println(u);
		System.out.println(v);
		System.out.println(t);
	}
	
	
}