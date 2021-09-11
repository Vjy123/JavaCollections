package Durga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
class Employ
{
	String name;
	int id;
	float sal;
	public Employ(String name, int id, float sal) {
		super();
		this.name = name;
		this.id = id;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employ [name=" + name + ", id=" + id + ", sal=" + sal + "]";
	}
	
}
public class Employe {

	public static void main(String[] args) 
	{
		List<Employ> em=new ArrayList<Employ>();
		em.add(new Employ("vijay",1,50000));
		em.add(new Employ("hari",2,60000));
		em.add(new Employ("Gay",3,70000));
		em.add(new Employ("su",4,80000));
		for(Employ e:em)
		{
			System.out.println(e);
		}
		
		
		
		

	}

}
