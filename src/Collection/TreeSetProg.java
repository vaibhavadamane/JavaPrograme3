package Collection;

import java.util.TreeSet;

public class TreeSetProg {

	public static void main(String[] args) {
	// No default Capacity
	// No Heterogeneous
	// The data type should be decided by first element data type
	// if we put null as first element then it gives null  pointer exception

	TreeSet a = new TreeSet();
	TreeSet b = new TreeSet();
//	a.add(null);   //Null Pointer Exception
	a.add("B");
	a.add("Z");
	a.add("A");
	a.add("E");
	a.add("E");
	System.out.println("Element of a = " + a);
//	a.add(10);//it show error
//	System.out.println("Element of a = " + a);
	 
	b.add(100);
	b.add(10);
	b.add(60);
	b.add(25);
	b.add(100);
	System.out.println("Element of b = " + b);
	
	
	
	
	
		
		
		
		
	}

}
