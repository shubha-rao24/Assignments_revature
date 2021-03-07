package string1;
//take a string input and print the characters at prime index to uppercase.
import java.util.Arrays;
import java.util.Scanner;

public class Input_uppercase {

	public static void main(String[] args) 
	{

		
		System.out.println("enter the string");
		Scanner scan = new Scanner(System.in);

		String s = scan.nextLine();
		String s5[]=s.split("");
		//System.out.println(Arrays.toString(s5));    jfjfjfjfjfjf
		System.out.println(s.length());
		int size=s.length();
		int temp=0;
		for (int i = 1; i < s5.length; i++) {
			//temp =i;
			//System.out.println(temp);
			if (isPrime(i)) {
				System.out.println(s5[i].toUpperCase());
			}
		}
	}
	

	public static boolean isPrime(int n) {
		int c = 0;
		for (int i =1; i <= n; i++) {
			if (n % i == 0) {
				c++;
				//System.out.println(c);
			}
		}
		if (c == 2) 
		{
			//System.out.println(n);
			return true;
		} else {
			return false;
		}
	}
}
