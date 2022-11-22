package Array;

import java.util.Scanner;

public class Programe3 {

	public static void main(String[] args) {
		
		int sizeOfArray;
		System.out.println("Enter the size of Array");
		Scanner s1 =new Scanner(System.in);
	    sizeOfArray =s1.nextInt();
	    System.out.println("Size of Array given by user = " +sizeOfArray);
	    
	    int array[]=new int[sizeOfArray];
	    System.out.println("Enter the elements of Array");
	    for(int i=0;i<sizeOfArray;i++)
	    {
	    	array[i] = s1.nextInt();
	    }
	    System.out.println("Array Element are:");
	    for(int result:array)
	    {
	    	System.out.println(result);
	    }
		

	}

}
