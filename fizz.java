import java.util.*;
import java.io.*;


public class fizz {

	static int limit;

	public static void main(String[] args) {
		
		Scanner input = new Scanner(new InputStreamReader(System.in));
		
		
		while (true) {
			try {
				System.out.print("Please enter a non-zero integer: ");
				limit = Integer.parseInt(input.nextLine());
				if (limit > 0) break;
			}
			catch(NumberFormatException exception) {
				System.out.println("This Is Not A Non-Zero Integer");
			}
		}

		for (int i=1; i<=limit; i++) {
			if (i%3==0) {
				if (i%5==0) {
					System.out.println("Fizz-Buzz");
				}
				else {
					System.out.println("Fizz");
				} 
			}
			else if (i%5==0) {
				System.out.println("Buzz");
			}
			else { System.out.println(Integer.toString(i)); }
		}
	}
}