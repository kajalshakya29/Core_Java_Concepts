public class My_Acceleration
{
	float a,u,v,t;
	public void assign(float v,float u, float t)
	{
		this.u = u;
		this.v = v;
		this.t = t;
	}
	public float calc()
	{
		a = (v-u)/t;
		return a;
		//System.out.println("Acceleration will be: "+ a);
	}
	public void show()
	{
		System.out.println("Acceleration will be: "+ a);

	}
	
	
}