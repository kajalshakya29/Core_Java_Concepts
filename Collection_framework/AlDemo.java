import java.util.*;
public class AlDemo
{
	public static void main(String[] args)
	{
		ArrayList al = new ArrayList();
		al.add(10);
		al.add("hello");
		al.add(true);
		al.add(null);
		al.add("kajal");
		al.add(0.45);
		al.add(false);
		//System.out.println(al);
		al.remove(2);
		al.add(2,"M");
		al.add("virat");
		System.out.println(al);
	}
}