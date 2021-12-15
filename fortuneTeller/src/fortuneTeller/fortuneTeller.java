/**
 * 
 */
package fortuneTeller;

import java.util.Scanner;
/**
 * @author corey
 *
 */
public class fortuneTeller {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Pick a color");
		System.out.println(" {1. Red, 2. White, 3. Blue}");
		Scanner scanner = new Scanner(System.in);
		
		int userColor = scanner.nextInt();
		
		if (userColor < 1) {
			System.out.println("Enjoy adventures");
		} else {
			System.out.println("Enjoy tranquility");
		}
	}

}
