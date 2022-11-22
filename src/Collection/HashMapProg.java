package Collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapProg {

	public static void main(String[] args) 
	{
		HashMap a = new HashMap();        //IC=16,LF=.75
		HashMap b = new HashMap(100);     //IC=100,LF=.75
		HashMap c = new HashMap(900,90);  //IC=900,LF=.90
		HashMap d = new HashMap(b);
		
		a.put(5, "Thanons");
		a.put(3,"IronMan");
		a.put(2,"Captain Ameriaca");
		a.put(1,"Black Panther");
		a.put(4,"Gomora");
		System.out.println("HashMap A Contain = " + a);
		a.put(4,"Thor");
		System.out.println("HashMap A Contain = " + a);//If we put the duplicate value that time value become change.
		a.put(6,"Thor");
		System.out.println("HashMap A Contain = " + a);//if we put the duplicate value that time it will be put with new keys
		
	    a.put("A",200);
	    a.put("C",400);
	    a.put("B",100);
	    System.out.println("HashMap A Contain = " + a);
	    
	    System.out.println("Total Keys are =" + a.keySet());
	    System.out.println("Total Values are =" + a.values());
	    System.out.println("Total Entry are =" + a.entrySet());
		
	    //Now we can Retrieval the value from the Hashmap
	    System.out.println("****************KEYS***********************");
	    System.out.println("To get the data from HashMap by using Iterator Cursor by creating the set");
	    //Iterator i =a.iterator();   Here we can not used iterator retrieval becoz Hashmap is not a collection so 
	    //first we convert it to collection we store it into set
	    Set setType = a.keySet();
	    Iterator i = setType.iterator();
	    while(i.hasNext())
	    {
	    	System.out.print(i.next() + "\t");
	    }
	    
	    System.out.println("\n****************VALUE************************");
	    Collection setType1 = a.values();
	    Iterator i1 = setType1.iterator();
	    while(i1.hasNext()) 
	    {
	    	System.out.print(i1.next() + "\t");
	    }
	    
	    System.out.println("\n*****************ENTRY***********************");
	    Collection setType2 = a.entrySet();
	    Iterator i2 = setType2.iterator();
	    while(i2.hasNext()) 
	    {
	    	System.out.print(i2.next() + "\t");
	    }
	    
	    
	    
	    
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
