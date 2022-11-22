package Array;

public class Programe2 {

	public static void main(String[] args) 
	{
		int marks [] = {12,10,18,20,16};//5
		
		System.out.println("Size of marks array = " +marks.length);
		
		System.out.println("Secound element =" +marks[2]);
		
		//Using for loop
		
		for(int i=0;i<5;i++)
		{
          System.out.println(marks[i]);
		}
		
		System.out.println("***********");
		
		//for each loop
		
		for(int value:marks)
		{
			System.out.println(value);
		}
		
		System.out.println("***********");
		
		int marks1[] =new int[10];//size = 10 0-9 trying to print 10th index element.
		
		marks1[0]=10;
		marks1[1]=20;
		marks1[2]=15;
		marks1[9]=39;
	
		System.out.println(marks1[0]);//10
		System.out.println(marks1[1]);//20
	    System.out.println(marks1[2]);//15
	    System.out.println(marks1[9]);//39
	    System.out.println(marks1[10]);//java.lang.ArrayIndexOutOfBoundsException
	    //in follwing the size of arry is not expand so we get this result.
	
	
	
	
	}

}
