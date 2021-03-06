package ArrayInput_sumOfeven;
//3)Take an array input and find the sum of all even numbers.
import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput_find_sumofeven {

	public static void main(String[] args) {
		int i, c = 0, n, sum_even = 0, sum_odd = 0;
		;
		System.out.println("Enter the required size of the array :: ");
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();

		int myArray[] = new int[size];
		System.out.println("Enter the elements of the array one by one ");
		for (int j = 0; j < size; j++) {
			myArray[j] = s.nextInt();
		}
		System.out.println("Contents of the array are: " + Arrays.toString(myArray));
		for (int j = 0; j < size; j++) {

			if (myArray[j] % 2 == 0) {
				sum_even = sum_even + myArray[j];
			} else {
				sum_odd = sum_odd + myArray[j];
			}

		}

		System.out.println("sumof even numbers is: " + sum_even);
	}

}
