/*

Given a string, compute recursively a new string 
where all the 'x' chars have been removed. 

noX("xaxb") → "ab"
noX("abc") → "abc"
noX("xx") → ""

*/

public class noX {
  	
  	public static void main(String[] args) {
  		System.out.println(noX("xaxb"));
  		System.out.println(noX("abc"));
  		System.out.println(noX("xx"));
  		System.out.println(noX("axxbaxx"));
  		System.out.println(noX("Paul Jx Desamero"));
  	}



	public static String noX(String str) {
  		//Base Case:
  		if (str.length() == 0) return str;
  		
  		//Recursive Case:
		else if (str.charAt(0) == 'x')
			return noX(str.substring(1));
		else 
		    return str.charAt(0) + noX(str.substring(1));
	}	
}

