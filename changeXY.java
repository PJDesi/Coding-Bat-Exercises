
/*
Given a string, compute recursively (no loops) 
a new string where all the lowercase 'x' chars 
have been changed to 'y' chars. 

changeXY("codex") → "codey"
changeXY("xxhixx") → "yyhiyy"
changeXY("xhixhix") → "yhiyhiy"

*/

public class changeXY {

	public static void main(String[] args) {
		System.out.println(changeXY("codex"));
		System.out.println(changeXY("xxhixx"));
		System.out.println(changeXY("xhixhix"));
		System.out.println(changeXY("kjsdfsddsfkj"));
	}

	public static String changeXY (String str) {
		//Base Case:
		if (str.length()==0) 
    		return str;

    	//Recursive Case:
  		else if (str.charAt(0) == ('x'))
    		return 'y' + changeXY(str.substring(1));
  		else 
    		return str.charAt(0) + changeXY(str.substring(1));
	}

}