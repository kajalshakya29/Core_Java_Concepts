import java.util.*;
public class Demo1
{
	public static void main(String[] args)
	{
		Vector v = new Vector();
		System.out.println(v.capacity());
		for(int i=0; i<10; i++)
		{
			v.addElement(i);
		}
		//System.out.println(v.capacity());
		v.addElement("A");
		v.add("123");
		v.add(0,"hello");
		v.removeElement("hello");
		v.remove(4);
		//v.clear();
		System.out.println(v.get(3));
		//v.firstElement();
		System.out.println(v.capacity());
		System.out.println(v);
		v.get(3);
		v.firstElement();
		v.lastElement();
		System.out.println(v.size());
	}
}




























































