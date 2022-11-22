package Collection;

import java.util.Vector;

public class VectorProg {

	public static void main(String[] args) {
		
	//	Vector<intger> v = new Vector<intger>();   we didn't use this type of vector because it have store only intger type value .
		
		Vector v1 = new Vector();    //  Initial Capacity is 10 Default
		Vector v2 = new Vector(100); // Initial Capacity is 100 Customized
		Vector v3 = new Vector(10,200); //first initial capacity is 10 when we add the extra value that time capacity become 210'
		v3.add(null);
		for(int i=0;i<9;i++)
		{
			v3.add(i);
		}
        System.out.println("Element in v3 = " + v3);
        System.out.println("Capcity of v1 before Expansion = " + v3.capacity());//10
		v3.add("Vaibhav");
		System.out.println("Capcity of v1 after Expansion = " + v3.capacity());//210
		Vector v4 = new Vector(v3); //when we declare it after addition that they show the capacity.
		System.out.println("Capcity of v1 = " + v1.capacity());
		System.out.println("Capcity of v2 = " + v2.capacity());
		System.out.println("Capcity of v3 = " + v3.capacity());
		System.out.println("Capcity of v4 = " + v4.capacity());//here v4 didn't have any capacity because it depend upon the v3
		System.out.println("Size of v4 = " + v4.size());
		
		v1.add("Vaibhav");
		v1.add("Adamane");
		v1.add('A');
		v1.add(100);
		v1.addElement("XYZ");
		System.out.println("Element of v1 = " + v1);
		v1.remove(0);
		v1.removeElementAt(1);
		v1.remove("XYZ");
		System.out.println("Element of v1 = " + v1);
		v1.add("Vikaram vedha");
		v1.add(200);
		v1.add("25JuneBAtch");
		v1.add('+');
		System.out.println("Element of v1 = " + v1);
		System.out.println("First Element = " + v1.firstElement());
		System.out.println("last Element = " + v1.lastElement());
		v1.set(4,"25JuneBatch");
		v1.setElementAt("Vaibhav",0);  //Reverse form set method
		System.out.println("Element of v1 = " + v1);
		
	}

}
