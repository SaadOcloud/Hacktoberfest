import java.util.*;

public class collection{

static int id=0;

ArrayList<Student> bscs = new ArrayList<Student>();
HashMap<Integer,Student> hm= new HashMap<Integer ,Student>();
HashSet<Student> hs= new HashSet<Student>();

public void add(Student s)
{
	bscs.add(s);
	System.out.println("Student Added in ArrayList ");

	hm.put(id++,s);
	System.out.println("Student Added in HashMap ");
	hs.add(s);
	System.out.println("Student Added in HashSet ");
	
}

public void get(int index)
{
	System.out.println("Getting from arraylist...");
	bscs.get(index).displayStudentDetails();
	System.out.println("Getting from HasMap...");
	hm.get(index).displayStudentDetails();
	System.out.println("Getting from HashSet...");
	
}


public void printSize()
{
	System.out.println("Size of ArrayList is : "+ bscs.size());
	System.out.println("Size of HashMap is : "+ hm.size());
	System.out.println("Size of HashSet is : "+ hs.size());
	
}



public void arraylistIterator()
{
	
	System.out.println("Iterating through Array list");
	Iterator<Student> pointer = bscs.iterator();
	while(pointer.hasNext())
		pointer.next().displayStudentDetails();
	
}




public void hashSetIterator()
{
	
	System.out.println("Iterating through Set");
	Iterator<Student> pointer = hs.iterator();
	while(pointer.hasNext())
		pointer.next().displayStudentDetails();
	
}

public void hashMapIterator()
{
	
	System.out.println("Iterating through Map");
	Iterator<Map.Entry<Integer,Student>> pointer = hm.entrySet().iterator();
	while(pointer.hasNext())
	{
				pointer.next().getValue().displayStudentDetails();
	}
}




public static void main(String args[])
{
	collection a = new collection();

a.add(new Student("name","fatherName","address",10));
a.get(0);
a.printSize();
a.arraylistIterator();
a.hashSetIterator();
a.hashMapIterator();	
}


}