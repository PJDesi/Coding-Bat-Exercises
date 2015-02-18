/*

Given a string, 
compute recursively 
a new string where all 
the adjacent chars are now 
separated by a "*". 

allStar("hello") → "h*e*l*l*o"
allStar("abc") → "a*b*c"
allStar("ab") → "a*b"

*/

public class allStar {

	public static void main(String[] args) {
		System.out.println(allStar("hello"));
		System.out.println(allStar("abc"));
		System.out.println(allStar("ab"));
		System.out.println(allStar("PJ Desamero"));
	}

	public static String allStar(String str) {
		//Base Case:
		if (str.length() < 2) return str;
		//Recursive Case:
		return str.charAt(0) + "*" + allStar(str.substring(1));
	}
}