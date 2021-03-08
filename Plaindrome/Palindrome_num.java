package Plaindrome;

/*Print all the palindrome numbers between 100 and 999//
 * 
 * 
 */
public class Palindrome_num {

	public static void main(String[] args) {
		int x = 0, temp = 0;
		System.out.println("generate palindrome numbers from 100 to 999");
		for (x = 100; x <= 990; x++) {
			temp = x;
			int rem = 0, rev = 0;
			// System.out.println(temp);
			while (temp != 0) {
				rem = temp % 10;
				rev = (rev * 10 + rem);
				temp = temp / 10;
				// System.out.println(rem);

			}
			
			if (rev == x) {
				System.out.println("This num is a palindrome " + x);
			}

		}

	}

}
