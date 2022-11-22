package StringProg;

public class Prog1 {

	public static void main(String[] args) {
		String str1 = "Harry";
	     System.out.println(str1);
	     str1.concat("Potter");//concat is update the value of string but we can't 
	     //get this value due the immutability.
	     System.out.println(str1);
	     //but we have the another option we assign new value.
	     str1 = str1.concat("Potter");
	     System.out.println(str1);
	     
	     System.out.println("************");
	     
	    StringBuffer sb1 = new StringBuffer("Albus");
	    		System.out.println(sb1);
	    		sb1.append("Dumbuldore");
//concat and append is same append is use in StringBuffer.	    		
	    		System.out.println(sb1);
	    		
	    		System.out.println("ABC" + " " + "EGG" + " " + "XYZ");
	}		
	   }


