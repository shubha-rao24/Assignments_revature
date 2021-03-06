package ArrayInput_Perform_CRUD;

import java.util.Arrays;

public class ArrayInput_Perform_CRUD_op {

	public static void main(String[] args) {

		int a[] = new int[6];
		a[0] = 20;
		a[1] = 44;
		a[2] = 5;
		a[3] = 444;
		int n = 4; // use n to keep track of elements in array
		System.out.println("Before Insertion");
		System.out.println("Contents of the array are: " + Arrays.toString(a));

		int ele = 66;
		int pos = 4;
		for (int i = n; i > pos - 1; i--) {
			a[i] = a[i - 1]; // updating
		}
		a[pos - 1] = ele; // inserting
		n++;

		System.out.println("\n\nAfter Insertion");
		System.out.println("Contents of the array are: " + Arrays.toString(a));

		int del_pos = 2;
		for (int i = del_pos - 1; i < n; i++) {
			a[i] = a[i + 1];
		}
		n--;
		System.out.println("\n\nAfter Deletion from positon " + del_pos);
		System.out.println("Contents of the array are: " + Arrays.toString(a));

	}

}
