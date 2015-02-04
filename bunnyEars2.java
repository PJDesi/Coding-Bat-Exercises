/*

We have bunnies standing in a line, numbered 1, 2, ... 
The odd bunnies (1, 3, ..) have the normal 2 ears. 
The even bunnies (2, 4, ..) we'll say have 3 ears, 
because they each have a raised foot. Recursively return 
the number of "ears" in the bunny line 1, 2, ... n 
(without loops or multiplication). 

bunnyEars2(0) → 0
bunnyEars2(1) → 2
bunnyEars2(2) → 5

*/

public class bunnyEars2 {
	
	public static void main(String[] args) {
		System.out.println(bunnyEars2(0));
		System.out.println(bunnyEars2(1));
		System.out.println(bunnyEars2(2));
		System.out.println(bunnyEars2(3));
		System.out.println(bunnyEars2(4));
		System.out.println(bunnyEars2(5));
	}

	public static int bunnyEars2(int bunnies) {
  		// Base Case: 
  		if (bunnies==0) return 0;
  		
  		// Recursive Case:
  		else {
  			//Option 1: Even, so 3 ears + Recurse on bunnies-1
   			if (bunnies % 2 ==0) {
      			return 3 + bunnyEars2(bunnies-1);
    		}
    		else 
    			//Option 2: Odd, so 2 ears + Recurse on bunnies-1
    			return 2 + bunnyEars2(bunnies-1);
  	}
  
  
}
}