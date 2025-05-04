public class Employee 
{
	private String name;
	private int age;
	private String phone;
	private String company;
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public int getAge()
	{
		//return name+"==>"+age;
		return age;
	}
	public void setPhone(String phone)
	{
		this.phone= phone;
	}
	public String getPhone()
	{
		return phone;
	}
	public void setCompany(String company)
	{
		this.company=company;
	}
	public String getCompany()
	{
		return company;
		
	}
	public String toString()
	{
		return name+"==>"+age+"==>"+phone+"==>"+company;
	}
}