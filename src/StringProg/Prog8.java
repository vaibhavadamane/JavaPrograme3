package StringProg;
//Sting class split method........
public class Prog8 {

	public static void main(String[] args) {
		
		String sentence = "I am working as a trainer in Velocity";
		
		String splitSentence[] = sentence.split(" ");
		
        for(String value:splitSentence)
        {
        	System.out.println(value);
        }
        System.out.println("************");
        
        System.out.println("Reverse sentence:-");
		
        for(int i=splitSentence.length-1;i>=0;i--)
        {
        	System.out.println(splitSentence[i] + " ");
        }
        
       System.out.println("**************");
	
       String date = "20-Aug-2022";
	   String splitDate[] = date.split("-");
	   
	   for(String value1:splitDate) 
	   {
		   System.out.println(value1);
	   }
	
	
	}
	

}
