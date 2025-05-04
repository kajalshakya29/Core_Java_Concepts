import java.util.*;

public class CollectionDemo
{
	public static void main(String[] args)
	{
		Employee e1 = new Employee();
		e1.setName("John");
		e1.setAge(24);
		e1.setPhone("7269286867");
		e1.setCompany("Wipro");
		
		Employee e2 = new Employee();
		e2.setName("Peter");
		e2.setAge(22);
		e2.setPhone("7654329876");
		e2.setCompany("Infosys");
		
		Employee e3 = new Employee();
		e3.setName("Jack");
		e3.setAge(21);
		e3.setPhone("8765432145");
		e3.setCompany("Microsoft");
		
		Employee e4 = new Employee();
		e4.setName("Harry");
		e4.setAge(24);
		e4.setPhone("9865432453");
		e4.setCompany("Google");
		
		Employee e5 = new Employee();
		e5.setName("John");
		e5.setAge(24);
		e5.setPhone("9876543216");
		e5.setCompany("Codsoft");
		
		Employee e6 = new Employee();
		e6.setName("John");
		e6.setAge(24);
		e6.setPhone("987898798");
		e6.setCompany("Airtel");
		
		ArrayList a = new ArrayList();
		a.add(e1);
		a.add(e2);
		a.add(e3);
		a.add(e4);
		a.add(e5);
		a.add(e6);
		
		//System.out.println(a);
		Iterator i = a.iterator();
		while(i.hasNext())
		{
			Object o = i.next();
			Employee emp = (Employee)o;
			System.out.println(emp.getName()+" your age is "+emp.getAge()+" and your phone is "+emp.getPhone()+ " now you are working with "+emp.getCompany());
		}
	}
}