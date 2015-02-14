/*
Given a string, compute recursively (no loops) 
the number of lowercase 'x' chars in the string. 

countX("xxhixx") → 4
countX("xhixhix") → 3
countX("hi") → 0

*/

public class countX {

	public static void main(String[] args) {
		System.out.println(countX("xxhixx"));
		System.out.println(countX("xhix"));
		System.out.println(countX("xxxxxxhixxxxxx"));
		System.out.println(countX("hi"));
	}

	public static int countX(String str) {
		//Base Case
		if (str.length()==0) return 0;

		//Recursive Case:
		// Just start at the first letter then
		// recurse on the remaining string
		// DUH
		else if (str.charAt(0)=='x')
			return 1 + countX(str.substring(1, str.length()));
		else 
			return countX(str.substring(1, str.length()));
	}

}