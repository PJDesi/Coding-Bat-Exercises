/*


Given a string, compute recursively 
a new string where identical chars 
that are adjacent in the original 
string are separated from each other by a "*". 

pairStar("hello") → "hel*lo"
pairStar("xxyy") → "x*xy*y"
pairStar("aaaa") → "a*a*a*a"

*/

public class pairStar {

	public static void main(String[] args) {
		System.out.println(pairStar("hello"));
		System.out.println(pairStar("xxyy"));
		System.out.println(pairStar("aaaaa"));
		System.out.println(pairStar("PJ Desamero"));
		System.out.println(pairStar("PJ  Desamero"));
	}

	public static String pairStar(String str) {
		//Base Case:
		if (str.length() < 2) return str;

		//Recursive Case:
		else if (str.charAt(0) == str.charAt(1)) {
			return str.charAt(0) + "*" + pairStar(str.substring(1));
		}
		return str.charAt(0) + pairStar(str.substring(1));
	}

}