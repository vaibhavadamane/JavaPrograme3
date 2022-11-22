package Array;

import java.util.Arrays;

public class Programe4 {

	public static void main(String[] args) {
		
		String characterOfHP[] = new String[5];
		characterOfHP[0]="Harry";
		characterOfHP[1]="Ron";
	    characterOfHP[2]="Dobby";
		characterOfHP[3]="Albus";
	    characterOfHP[4]="snep";
	    
	    for(int i=0;i<5;i++)
	    {	
	    	System.out.println(characterOfHP[i]);
	    }
	    System.out.println("*********");
	    
	    for(String value:characterOfHP)
	    {
	    	System.out.println(value);
	    }
	    System.out.println("------Sorted character-----");
	    
	    Arrays.sort(characterOfHP);
        for(String value:characterOfHP)
	    {
        System.out.println(value);	
	    }
	    System.out.println("-----Reversed character------");
	    
	    for(int i=4;i>=0;i--)
	    {
	    	System.out.println(characterOfHP[i]);
	    }
	    System.out.println(characterOfHP[4]);
	   // System.out.println(characterOfHP);
	    
	    
	    
	    
	    
	}

}
