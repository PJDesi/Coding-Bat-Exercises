/*
Given a string, compute recursively (no loops) 
a new string where all appearances of "pi" 
have been replaced by "3.14". 

changePi("xpix") → "x3.14x"
changePi("pipi") → "3.143.14"
changePi("pip") → "3.14p"

*/

public class changePi {

	public static void main(String[] args) {
		System.out.println(changePi("xpix"));
		System.out.println(changePi("pipi"));
		System.out.println(changePi("pip"));
		System.out.println(changePi("pi"));
		System.out.println(changePi("xpx"));
		System.out.println(changePi(""));
	}

	public static String changePi(String str) {
		//Base Case:
		if (str.length()<2) return str;

		//Recursive Case:
		//Use .equals instead of ==
		else if (str.substring(0,2).equals("pi"))
			return "3.14" + changePi(str.substring(2));

		else 
			return str.charAt(0) + changePi(str.substring(1));
	}

}