import java.util.*;
class ListIteratorDemo
{
	public static void main(String[] args)
	{
		LinkedList l = new LinkedList();
		l.add("Ram");
		l.add("Lakshman");
		l.add("Bhagat Singh");
		l.add("Chandra Shekhar Azad");
		System.out.println(l);
		ListIterator lt = l.listIterator();
		while (lt.hasNext())
		{
			String s = (String)lt.next();
			if(s.equals("Ram"))
			{
				lt.remove();
			}
			if(s.equals("Lakshman"))
			{
				lt.set("Subhash Chandra Bose");
			}
			if(s.equals("Chnadra Shekhar Azad"))
			{
				lt.add("Ram Prasad Bismil");
			}
		}
			System.out.println(l);
	}
}