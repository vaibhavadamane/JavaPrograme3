package StringProg;

public class Prog6 {

	public static void main(String[] args) {
		
String sent = "India is a huge country and growth and economy "
		+ "and huge population too";
		
//        System.out.println(sent.indexOf("I"));//0
//		System.out.println(sent.indexOf("is"));//6
//		//when take any world we give postion of first letter.
//		System.out.println(sent.indexOf("and"));//24
//		System.out.println(sent.indexOf("And"));//-1
//		System.out.println(sent.lastIndexOf("and"));//47
//		System.out.println(sent.lastIndexOf("is"));//6
//		System.out.println(sent.startsWith("I"));//true
//		System.out.println(sent.startsWith("India"));//true
//		System.out.println(sent.startsWith("nd"));//false
//		System.out.println(sent.endsWith("o"));//true
//		System.out.println(sent.endsWith("oo"));//true
//		System.out.println(sent.endsWith("too"));//true
//		System.out.println(sent.endsWith("Too"));//false
	
     String str1 = "Harry Potter and Golbet of fire";
	 System.out.println(str1.substring(6)); //Potter and Golbet of fire
     System.out.println(str1.substring(11));//r and Golbet of fire
//substring is use when we take any no of postion the sent.is start with that postion    
     System.out.println(str1.substring(2,4));//rr
	 System.out.println(str1.substring(6,12));//Potter ( Here last digist is not show postion)
		
				

	}

}
