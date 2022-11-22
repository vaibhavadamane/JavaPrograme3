package StringProg;

public class Prog4 {

	public static void main(String[] args) {
		
		String str1 = "Potter";
		String str2 = "Potter";
		String str3 = "poTTer";
		
		String str4 = new String("Potter");
		String str5 = new String("Potter");
		
		int a= 10,b=10;
		
		System.out.println(a==b);//true
		System.out.println(str1==str2);//true (Here str1 and str2 located in same memory location)
	    System.out.println(str4==str5);//false (Here we can't use ==)
	    //Here str1 and str2 is located in different memory location.
		System.out.println(str4.equals(str5));//true
		

	}

}
