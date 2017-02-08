/**
 * 
 * @author Daniel Brennan
 * Java - Leet 
 * Main program for transferring string data from normal text
 * to "leet" text.
 * 
 */

import java.util.Scanner;

public class NoobCon {
	private static String noobText;
	/**
	 * Basic Constructor
	 */
	public NoobCon() {
		setNoobText("");
	}
	/**
	 * Overloaded Constructor
	 */
	public NoobCon(String text) {
		setNoobText(text);
	}
	/**
	 * Getter returns string 
	 * @return
	 */
	public String getNoobText() {
		return noobText;
	}
	/**
	 * Setter to set string 
	 * @return
	 */
	public void setNoobText(String noobText) {
		NoobCon.noobText = noobText;
	}
	/**
	 * This function creates the initial string to be manipulated
	 * from standard input. Calls isEmpty() function to validate
	 * string.
	 * @param in - input from user.
	 */
	public void createString(Scanner in, NoobCon n) {
		String text;
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
		n = new NoobCon(text.trim());
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
	 * Using a char array with a length of inputed string,
	 * to temporarily hold the string. A for loop and a switch
	 * is used to iterate through each character of the string,
	 * and changes the specific char to a number. 
	 * Then sets the char array back into a new string variable.
	 * @param toTransform - input string to Transform to leet.
	 */
	public void leetTransform(String toTransform, NoobCon n) {
		toTransform = toTransform
				.replaceAll("[aA]", "4")
				.replaceAll("[eE]", "3")
				.replaceAll("[iI]", "1")
				.replaceAll("[oO]", "0")
				.replaceAll("[sS]", "5")
				.replaceAll("[tT]", "7");
		n = new NoobCon(toTransform);
	}
	/**
	 * Main to call functions and print final leet text.
	 * @param Args
	 */
	public static void main(String Args[]) {
		NoobCon n = new NoobCon();
		Scanner input = new Scanner(System.in);
		n.createString(input, n);
		
		String text = n.getNoobText();
		
		n.leetTransform(text, n);
		
		System.out.println(n.getNoobText());
		System.out.println("7h47 w4s l33t!");
		
		input.close();
	}
}
