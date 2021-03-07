package string1;

import java.util.Scanner;

//Take a string input and print true if all vowels are present in it else print false. 
//aHedafioullooo - true aHedafiollooo - false
public class chaeck_vowels {

	public static void main(String[] args) {
		System.out.println("enter the string");
		Scanner scan = new Scanner(System.in);
		boolean b = false;
		String s = scan.nextLine();
		// System.out.println("s1.contains(\"lel\") : "+s1.contains("lel"));
		// System.out.println(("(s.contains(\"[^aeiou]\") :"+s.contains("[^aeiou]")));
		int c = 0;
		System.out.println(s.replaceAll("[^aeiouAEIOU]", "").length());
		c = s.replaceAll("[^aeiouAEIOU]", "").length();
		if (c > 0 && b == true) {
			System.out.println("vowels are present");

			return;
		}

		else {
			System.out.println("vowels are not  present");
			return;
		}
	}

}
