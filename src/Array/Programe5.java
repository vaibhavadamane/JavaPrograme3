package Array;

public class Programe5 {

	//Here we print like , Harry Ron
	//                     Dobby Albus
	
	//By using Matrix
	
	public static void main(String[] args) {
		
		String characterOfHP[][] = new String[2][2];
        
		characterOfHP[0][0]="Harry";
		characterOfHP[0][1]="Ron";
	    characterOfHP[1][0]="Dobby";
		characterOfHP[1][1]="Albus";
	    
	    for(int i=0;i<2;i++)
	    {
	    	for(int j=0;j<2;j++)
	    	{
	    	System.out.print(characterOfHP[i][j] + " ");
	        }
	    	System.out.println();
	    }
	    
	    //Anothter way to print the same thing in console
	    System.out.println("Harry" + " " + "Ron");
	    System.out.println("Dobby" + " " + "Albus");
}
}



