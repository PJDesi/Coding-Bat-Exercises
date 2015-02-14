/*


Given base and n that are both 1 or more, 
compute recursively (no loops) the value of base to the n power, 
so powerN(3, 2) is 9 (3 squared). 

powerN(3, 1) → 3
powerN(3, 2) → 9
powerN(3, 3) → 27

*/

public class powerN {

	public static void main(String[] args) {
		System.out.println(powerN(3,1));
		System.out.println(powerN(3,2));
		System.out.println(powerN(10,10));
		System.out.println(powerN(0,1));
		System.out.println(powerN(5,0));
		System.out.println(powerN(0,0));
	}

	public static int powerN(int base, int n) {
		//Base Cases:
		if (base==0) return 0;
  		else if (n==0) return 1;

  		//Recursive Case:
  		else
  			//Base * Base * Base... until n==0
    		return base * powerN(base, n-1);
	}

}

