import java.util.*;
import java.io.*;


public class fizz {

	public static void main(String[] args) {
		fizzBuzz(10);
	}



	public static void fizzBuzz(int num) {
		if (num > 0) {
			if (num%3 == 0) {
				System.out.println("Fizz");
				if (num%5 == 0) {
					System.out.println("-Buzz");
				}
				else {
					fizzBuzz(num-1);
				}			  
				fizzBuzz(num-1);
			}
			else if (num%5 == 0) {
				System.out.println("Buzz");
				fizzBuzz(num-1);
			}
			else {
				System.out.println(Integer.toString(num));
				fizzBuzz(num-1);
			}
		}
		else {
			break;
		}
	} 
}