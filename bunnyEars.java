/*
We have a number of bunnies and each bunny has two big floppy ears. We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication). 

bunnyEars(0) → 0
bunnyEars(1) → 2
bunnyEars(2) → 4
*/

public class bunnyEars {

	public static void main(String[] args) {
		System.out.println(bunnyEars(0));
		System.out.println(bunnyEars(1));
		System.out.println(bunnyEars(2));
		System.out.println(bunnyEars(3));
		System.out.println(bunnyEars(4));
		System.out.println(bunnyEars(5));
	}

	public static int bunnyEars(int bunnies) {
  		// Base Case:
  		if (bunnies==0) return 0;
  		// Recursive Case: on bunnies-1
  		return 2 + bunnyEars(bunnies-1);
	}

}
