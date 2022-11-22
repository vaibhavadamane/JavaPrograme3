package StringProg;

public class Prog7 {

	public static void main(String[] args) {
		 String str1 = "Hollo";
		 String str2 = "Man";
		   
		 System.out.println(str1.concat(str2));
		 System.out.println(str1);
		 System.out.println(str2);
		 
 System.out.println(str1.concat(" ").concat(str2).concat(" ").concat ("is a movie"));
		 
		 String sent = "India is a huge country and growth economy";
		 System.out.println(sent.replace("India","INDIA"));
		 System.out.println(sent.replace(""," "));
		 System.out.println(sent.replace("and","&"));

		 String str3 = "I am from IT";
		 String str4 = "      and have good experiencce in Automation";
		 
		 System.out.println(str3);
		 System.out.println(str4);
		 System.out.println("**************");
		 System.out.println(str3.trim());
		 System.out.println(str4.trim());
		 System.out.println(str3.trim()+ " " +str4.trim());
		 }

}
