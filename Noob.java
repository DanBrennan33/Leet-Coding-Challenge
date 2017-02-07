/**
 * 
 * @author Daniel Brennan
 * Razorfish - Java - Leet 
 * Main program for transferring string data from normal text
 * to "leet" text.
 * 
 */

import java.util.Scanner;

public class Noob {
	/**
	 * This function creates the initial string to be manipulated
	 * from standard input. Calls isEmpty() function, and transforms
	 * final inputed string to be a StringBuilder variable.
	 * @param in - input from user.
	 * @return noobText - StringBuilder variable to be transformed.
	 */
	public static String createString(Scanner in) {
		String text = "";
		boolean b = true;
		do {
			if (b) {
				System.out.println("Enter noob string to transform to leet: ");
				text = in.nextLine();
			} else {
				System.out.println("Not a valid noob string. Enter an alpha string bro: ");
				text = in.nextLine();
			}
			b = isEmpty(text);
		} while (!b);
		return text.trim();
	}
	/**
	 * Function to check whether standard input string is null, or 
	 * all whitespace. Returns boolean value based on string.
	 * @param toCheck - String with standard input from user 
	 * @return - return true or false based on value of string.
	 */
	public static Boolean isEmpty(String toCheck) {
		if(toCheck.trim().length() > 0 && !toCheck.isEmpty()) {
			return true;
		} else { 
			return false;
		}
	}
	/**
	 * Transforms string value from normal text to leet text.
	 * Using replace all to transform each instance.
	 * Thought for a long time on how to do this.
	 * Either with StringBuilder -> char Array then for loop 
	 * to iterate through each character of the string to swap 
	 * chars with a switch then back to a String or this method. 
	 * Ultimately for readability I went with this method of
	 * replaceAll/regex instead of the 22 line for loop to switch, 
	 * String Builder -> char[] -> String.
	 * @return - transformed string
	 */
	public static String leetTransform(String toTransform) {
		return  toTransform
				.replaceAll("[aA]", "4")
				.replaceAll("[eE]", "3")
				.replaceAll("[iI]", "1")
				.replaceAll("[oO]", "0")
				.replaceAll("[sS]", "5")
				.replaceAll("[tT]", "7");
	}
	/**
	 * Main to call functions and print final leet text.
	 * @param Args
	 */
	public static void main(String Args[]) {
		Scanner input = new Scanner(System.in);
		String noobText = createString(input);
		
		System.out.println(leetTransform(noobText));
		System.out.println("7h47 w4s l33t!");
		
		input.close();
	}
}