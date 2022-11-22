package Collection;

import java.util.LinkedList;

public class LinkedListProg1 {

	public static void main(String[] args) {
		
		LinkedList ll1 = new LinkedList();
		LinkedList ll2 = new LinkedList();
		
//      No initial capacity or default capacity.
		
		ll1.add("Shivaji");
		ll1.add("Sambhaji");
		ll1.add("Sahaji");
		ll1.add("Jadhavji");
		ll1.add(1670);
		ll1.add('A');
		System.out.println("Element of ll1 = " + ll1);
		
		ll1.addFirst("Maratha");
		ll1.addLast("Empire");
		System.out.println("Element of ll1 = " + ll1);
		ll1.pollFirst();    //This unique one.
		ll1.pollLast();
		ll1.removeFirst();
		ll1.removeLast();
		System.out.println("Element of ll1 = " + ll1);
		ll1.add("Sambhaji");
		System.out.println("Element of ll1 = " + ll1);
		ll1.removeFirstOccurrence("Sambhaji");
		ll1.removeLastOccurrence("Sambhaji");
		System.out.println("Element of ll1 = " + ll1);
		ll1.set(1,"Bhosale");
		System.out.println("Element of ll1 = " + ll1);
		

	}

}
