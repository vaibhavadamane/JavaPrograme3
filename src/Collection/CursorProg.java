package Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

import javax.lang.model.util.Elements;


public class CursorProg {

	public static void main(String[] args) {
	
		Vector a = new Vector();
		
		for(int i=0;i<10;i++)
		{
			a.add(i);
		}
        System.out.println("Elements of A = " + a);
        
        //How to get/retrieval the data from given vector Object 
		
        //In regular method By using for loop
        System.out.println("\nRead the object by using regular method");
        for(int i=0;i<10;i++)
        {
        	System.out.print(a.get(i) + "\t" );    //\t print 8 blank spaces
        }
		
        //By using the Enumeration Cursor
        //***************Enumeration Cursor************************		
        /*System.out.println("\nRead the object by using Enumeration Cursor");
		Enumeration e = a.elements();
		//e = Cursor reference variable
		//a = collection object
		//elements = copy/assign the value of given vector.
		
		//By using while loop
		System.out.println("\nBy using the while loop");
		while(e.hasMoreElements())  //hasMoreElements is act as Condition.
		{
			System.out.print(e.nextElement() + "\t"); //nextElement() is check next element.
		}
		
		//By using the for loop
		System.out.println("\nBy using the for loop");
		for(;e.hasMoreElements();)
		{
			System.out.println(e.nextElement() + "\t");
		}
		
		//By using for each loop
		System.out.println("\nBy using the for each loop");
		for(Object value:a)
		{
			System.out.print(value + "\t");
		}*/
		
        //By using the Iterator Cursor
        //***************Iterator Cursor************************		
//      System.out.println("\nRead the object by using Iterator Cursor");
//		Iterator i = a.iterator();
        
		//By using While loop
//		System.out.println("\nBy using the while loop");
//		while(i.hasNext()) 
//		{
//		System.out.print(i.next() + "\t");
//		}
        
		//Use of the remove() method we can filter the data by using modules
//		System.out.println("\nUse of remove method");
//		while(i.hasNext())
//		{
//			int element = (int)i.next();//casting
//			if(element%2==0)
//			{
//				System.out.print(element + "\t");
//			}
//			else
//			{
//		        i.remove();
//			}
//			}
//       System.out.println("\nElements of A = " + a);
		
      //***************List Iterator Cursor************************		
        System.out.println("\nRead the object by using List Iterator Cursor");
		ListIterator l = a.listIterator();
//		System.out.println("\nBy using while loop");
//		while(l.hasNext())
//		{
//			System.out.print(l.next() + "\t");
//		}
		
		/*while(l.hasNext())
		{
			int value = (int) l.next();
			if(value==5)
				l.remove();
			else if(value==4)
				l.add(44);
			else if(value==7)
				l.set(7777);
		}
		System.out.println(a);*/
		
		System.out.println("\nCheck Bidirectional Property");
		while(l.hasNext())
		{
			System.out.print(l.next() + "\t");
		}
//		System.out.println(l.previous());
//		System.out.println(l.previous());
//	    System.out.println(l.hasPrevious());
        System.out.println(l.nextIndex());	   	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
  }

}
