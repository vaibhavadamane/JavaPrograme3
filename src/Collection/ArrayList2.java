package Collection;

import java.util.ArrayList;
import java.util.Collections;


public class ArrayList2 {
//  Perform various method on  the ArrayList and Vector.
	public static void main(String[] args) {
	
//  How we create a Arrylist there are multiple way		
    ArrayList a1 = new ArrayList();           //default	capacity = 10
    ArrayList a2 = new ArrayList(10000);    //Customize default capacity = 10000
    ArrayList a3 = new ArrayList(a1);      //create equivalent collection from existing
    
    a1.size();
    System.out.println("Intial Size of ArrayList A1 = " + a1.size());
    a1.add("Vaibhav");
    a1.add("Adamane");
    a1.add("8975688065");
    a1.add("MSc");
    a1.add(450000);
    a1.add("Wipro");
    a1.add("Pune");
    a1.add("9LPA");
    System.out.println("Final size of ArrayList = " +a1.size());
    System.out.println("Data of the A1 = " + a1);
    
    //When we can add some number
    for(int i=1;i<=5;i++)
    {
    	a1.add(i);
    }
    System.out.println("Data of the A1 = " + a1);
    
    //Add element By using specified index
    a1.add(5, "IT");
    System.out.println("Data of the A1 = " + a1);
    
    //It check weather required value is present in collection
    System.out.println("Is our collection is contain the Pune = " + a1.contains("Pune"));
    
    //It get the value present in mentioned index
    System.out.println("Value is present in the no 5 = " + a1.get(5));
    
    //Insert the duplicate value
    a1.add(5, "Vaibhav");
    System.out.println("Data of the A1 = " + a1);
    
    //The the indexOf the same value
    System.out.println("Index of first Vaibhav name = " + a1.indexOf("Vaibhav"));
    System.out.println("Index of last Vaibhav name = " + a1.lastIndexOf("Vaibhav"));
    
    //We can replace the 'existing value 1)When we don't no about the index but know about value
    System.out.println("Index of the 9LPA = " + a1.indexOf("9LPA"));
    a1.set(9,"12LPA");
    System.out.println("Data of the A1 = " + a1);
    
    //Also we can remove the value by using index if we haven't index that time by using indexOf method and get index
    a1.remove(5);
    System.out.println("Data of the A1 = " + a1);
    
	//We can also remove value by using the value
    
    //System.out.println();
    
    //Reverse the data By using the Collections Class
    Collections.reverse(a1);
    System.out.println(a1);
    
    //we can also sort the data but data have homogeneous in nature 
    
    //we can clear the all data in ArrayList
    a1.clear();
    System.out.println("After applying the clear mathod = " + a1);
    
    //Create the Homogeneous data in a2
    a2.add("Thor");
    a2.add("Ironman");
    a2.add("Thons");
    a2.add("Groot");
    a2.add("Doctor Strange");
    a2.add("Captain America");
    a2.add("Gamora");
    a2.add("Odian");
    
    System.out.println("Data of the A2 = " + a2);
    
    //we can sort the data
    Collections.sort(a2);
    System.out.println("After Sorting the Arraylist = " + a2);
	
}

}
