import java.util.*;
import java.io.*;


public class makingChange {
	
	static int quart=0;
	static int dime=0;
	static int nickel=0;
	static int penny=0;

	
	public static void main(String[] args) {
		int change = 0; 
		Scanner input = new Scanner(new InputStreamReader(System.in));
		
		while (true) {
			try {
				System.out.print("Please enter your change (non-zero integer): ");
				change = Integer.parseInt(input.nextLine());
				if (change > 0) break;
			}
			catch(NumberFormatException exception) {
				System.out.println("This Is Not A Non-Zero Integer");
			}
		}

//		makeChange(change);
		makeChange2(change);
		System.out.printf("%d Quarters,  ", quart);
		System.out.printf("%d Dimes,  ", dime);
		System.out.printf("%d Nickels,  ", nickel);
		System.out.printf("%d Pennies \n", penny);	
		
	}

	/*  while amount > 0 
	 *  Amount = Amount - biggest possible coin
	 */
	public static void makeChange(int amount){
		while (amount > 0) {
			if (amount >= 25) {
				quart++;
				amount -= 25;
			}
			else if (amount < 25 && amount >=10) {
				dime++;
				amount -= 10;
			}
			else if (amount < 10 && amount >= 5) {
				nickel++;
				amount -= 5;
			}
			else {
				penny++;
				amount -= 1;
			}
		}
	}

	//Using mod
	public static void makeChange2(int amount) {
		if (amount>=25) {
			quart = amount/25;
			makeChange2(amount%25);
		}
		else if (amount>=10) {
			dime = amount/10;
			makeChange2(amount%10);
		}
		else if (amount>=5) {
			dime = amount/5;
			makeChange2(amount%5);
		}
		else {
			penny = amount;
		}
	}




}
