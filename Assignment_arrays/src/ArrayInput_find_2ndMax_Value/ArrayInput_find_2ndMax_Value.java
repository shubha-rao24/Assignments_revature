package ArrayInput_find_2ndMax_Value;

import java.util.Arrays;
import java.util.Scanner;

//Take an array input and _find_2ndMax_Value from that array.
public class ArrayInput_find_2ndMax_Value {

	public static void main(String[] args) {
		System.out.println("Enter the required size of the array :: ");
		Scanner s = new Scanner(System.in);
		int size = s.nextInt(), j;
		

		int arr1[] = new int[size];
		System.out.println("Enter the elements of the array one by one ");
		int max = arr1[0], min = arr1[0];
		for (int t1 = 0; t1 < size; t1++) {
			arr1[t1] = s.nextInt();
		}
		System.out.println("Contents of the array are: " + Arrays.toString(arr1));
		for (j = 0; j < size; j++) {
			if (max < (arr1[j])) {
				max = arr1[j];
			} else

			if (min < (arr1[j])) {
				min = arr1[j];
			}

		}

		if (arr1[size - 2] <= max)
			System.out.println("2nd max value   in the array is" + arr1[size - 2]);

		// System.out.println("Minimum value in the array is" + min);
		// System.out.println("maximum value in the array is" + max);
	}

}
