public class My_Simple_Interest
{
	float  p,r,t,si;
	public void assign(float p, float r, float t)
	{
		this.p = p;
		this.r = r;
		this.t = t;
	}
	public float calc()
	{
		si = (p*r*t)/100;
		return si;
	}
	public void show()
	{
		System.out.println("Simple interest is : "+ si);
	}
}