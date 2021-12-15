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
		Scanner scanner0 = new Scanner(System.in);
		
		int userColor = scanner0.nextInt();
		
		System.out.println("Pick a number");
		System.out.println("{1-10}");
		Scanner scanner1 = new Scanner(System.in);
		
		int userNumber = scanner1.nextInt();
		
		int userFortune = userColor + userNumber;
		
		if (userFortune < 7) {
			System.out.println("Enjoy adventures");
		} else {
			System.out.println("Enjoy tranquility");
		}
	}

}
