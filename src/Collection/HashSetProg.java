package Collection;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetProg {
public static void main(String[] args) {
	
	HashSet hs1 = new HashSet();
	hs1.add(10);
	hs1.add(1);
	hs1.add(4);
    System.out.println("Element of hs1 = " + hs1);
    hs1.add(11);
    hs1.add(10); //This is duplicate value still its does not show error.
    System.out.println("Element of hs1 = " + hs1);
    
    HashSet a = new HashSet();       //Initial Capacity is 16 and lf=75%
    HashSet b = new HashSet(100);    //Initial Capacity is 100 and lf=75%
    HashSet c = new HashSet(120,90); //Initial Capacity is 120 and lf=90%
    HashSet d = new HashSet(a);
    //load factor:- it will be assign by % . when object is filled upto this % then it will be grow double automatically
    
    a.add("Vaibhav");//Insertion order is not preserved
    a.add('A');
    a.add("AAB");
    a.add("E");
    a.add(null);
    a.add(100);
    System.out.println("Element of A = " + a);
    System.out.println(a.isEmpty());
    a.addAll(a);// duplicate is not allowed.
    System.out.println("Element of A = " + a);
    
    ArrayList a1 = new ArrayList();
    a1.add("Rohan");
    a1.add("Thok");
    a1.add("9309576255");
    a1.add("3205");
    a1.add('A');
    a1.add("Physic");
    System.out.println("Element of a1 = " + a1);
    b.addAll(a1);
    System.out.println("Element of b = " + b);
    
    
    
    
    
    
    
    
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
