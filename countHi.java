/*

Given a string, compute recursively (no loops) 
the number of times lowercase "hi" appears in the string. 

countHi("xxhixx") → 1
countHi("xhixhix") → 2
countHi("hi") → 1

*/

public class countHi {

	public static void main(String[] args) {
		System.out.println(countHi("xxhixx"));			//1	
		System.out.println(countHi("xxhihixx"));		//2	
		System.out.println(countHi("xxhihihihhixx"));	//4
		System.out.println(countHi("xxxx"));			//0	
	}

	//TODO figure out using string functions instead of char
	public static int countHi(String str) {
		//Base Case:
		if (str.length()==0 || str.length()==1) return 0;

		//Recursive Case:
  		else if (str.charAt(0)=='h' && str.charAt(1)=='i')
    		return 1 + countHi(str.substring(2, str.length()));
  		else 
   			return countHi(str.substring(1, str.length())); 
	}

}