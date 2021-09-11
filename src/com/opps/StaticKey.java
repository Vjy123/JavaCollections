package com.opps;
class Student
{
	int id;
	String name;
	static String clg;
	static float sal;
	
	static 
	{
		clg ="svne";
		sal=50000;
		System.out.println("Hi Static");
	}
	
	
	Student()
	{   
		name="vijay";
		id=2;
		System.out.println("Hai Constructor");
	}
	
	public void show()
	{
		System.out.println(id+":"+name+" :"+clg+":"+sal);
	}
	
	
}
public class StaticKey {
	public static void main(String[] args) 
	{
		Student st=new Student();
		Student s=new Student();
		st.show();
		s.show();
		

	}

}
