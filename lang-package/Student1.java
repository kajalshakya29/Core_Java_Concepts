class Student1
{
	String name;
	int rollno;
	Student1(String name,int rollno)
	{
		this.name=name;
		this.rollno=rollno;
	}
	public static void main(String[] args)
	{
		Student1 s1= new Student1("krishna", 101);
		Student1 s2= new Student1("ananya", 100);
		Student1 s3= new Student1("vishakha", 102);
		Student1 s4=s1;
		Student1 s5=s3;
		
		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s5));
		System.out.println(s1.equals(s4));
		System.out.println(s1.equals(s1));
		
		
	}
}