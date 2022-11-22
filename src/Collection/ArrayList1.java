package Collection;

import java.util.ArrayList;
import java.util.Vector;

public class ArrayList1 {

	public static void main(String[] args) {
	
	ArrayList a1 = new ArrayList();  //In ArrayList we haven't the capacity method means we can't check capacity of the Arraylist.
	System.out.println(a1.isEmpty());
	a1.add(13);
	a1.add("Vaibhav");
    System.out.println(a1);
    System.out.println(a1.isEmpty());
    System.out.println("Size of the ArrayList = " + a1.size());
    a1.add("Rohan");
    a1.add("Thok");
    a1.add("9309576255");
    a1.add("3205");
    a1.add('A');
    a1.add("Physic");
    a1.add(32.50);
    a1.add("Chemistry");
    a1.add(90.98);
    System.out.println("Size of the ArrayList = " + a1.size());
    
    System.out.println("******************************************");

    Vector v1 = new Vector();
    System.out.println("Capacity of the Vector1 = "  + v1.capacity());  //Default Capacity is 10 
    v1.add(11);
    v1.add("Suraj");
    v1.addElement('R');   //This method only show in Vector.
    v1.add("Rohan");
    v1.add("Thok");
    v1.add("9309576255");
    v1.add("3205");
    v1.add('A');
    v1.add("Physic");
    v1.add(32.50);
    System.out.println(v1);
    v1.add("Chemistry");
    System.out.println("Cpacity of the Vector2 = " + v1.capacity());
    System.out.println(v1);
    System.out.println("Size of the Vector = " + v1.size());
    }

}
