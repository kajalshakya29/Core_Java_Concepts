import java.util.*;
public class LinkedListDemo
{
	public static void main(String[] args)
	{
		LinkedList l = new LinkedList();
		LinkedList l1 = new LinkedList();
		l.add("Shankar");
		l.add("10");
		l.add(null);
		l.add("Shekhar");
		l.add(0,"bhole");
		l.add(2, "shiv");
		l.removeLast();
		l.addFirst("Hello");
		l.addLast("India");
		System.out.println(l);
		l.remove(3);
		/*l.addFirst("st");
		l1.add("1");
		l1.add("hi");
		System.out.println(l);
		System.out.println(l1);
		*/
	}
}