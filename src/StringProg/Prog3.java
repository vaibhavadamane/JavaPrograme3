package StringProg;

public class Prog3 {

	public static void main(String[] args) {
	String str1 = "Potter";
	String str2 = "Potter";
	String str3 = "poTTer";
	
	String sentence = "I am an automation engineer in TCS";
	String str4 = "";
	
//	System.out.println(str1.toLowerCase());//potter
//	System.out.println(str1.toUpperCase());//POTTER
//	System.out.println(str1.equals(str2));//true
//	System.out.println(str1.equals(str3));//false
//	System.out.println(str1.equalsIgnoreCase(str3));//true(This is only concentrate on spelling)
//	System.out.println(str1.equals("potter1"));//false
//	System.out.println(str1.equalsIgnoreCase("POTTER"));//true
	
	System.out.println(sentence.contains(" "));//True
	System.out.println(sentence.isEmpty());//false
	System.out.println(str4.isEmpty());//true
	
	
	

	}

}
