package Array_prime_numbers_input;

import java.util.Arrays;
import java.util.Scanner;

//Take an array input and find all the prime numbers from it.//
public class PrimeNumber {

	public static void main(String[] args) {
		int temp = 0;
		System.out.println("Enter the required size of the array :: ");
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();

		int arr1[] = new int[size];
		System.out.println("Enter the elements of the array one by one ");
		for (int t1 = 0; t1 < size; t1++) {
			arr1[t1] = s.nextInt();
		}
		System.out.println("Contents of the array are: " + Arrays.toString(arr1));

		for (int i = 0; i < size; i++) {
			temp = arr1[i];
			if (isPrime(temp)) {
				System.out.println(arr1[i] + "  is a prime number ");
			}
		}

	}

	public static boolean isPrime(int n) {
		int c = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				c++;
			}
		}
		if (c == 2) {
			return true;
		} else {
			return false;
		}
	}

}
