package string1;

import java.util.Scanner;

//Take a string input from user and find the count of vowels(aeiouAEIOU) in it.
public class Count_vowels {

	public static void main(String[] args)
	{
		System.out.println("enter the string");
		Scanner scan = new Scanner(System.in);

		String s = scan.nextLine();

		System.out.println(s.replaceAll("[^aeiouAEIOU]", "").length());

	}

}
