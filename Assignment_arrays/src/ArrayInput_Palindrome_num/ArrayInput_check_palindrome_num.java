package ArrayInput_Palindrome_num;
//Take an array input and find all the palindrome numbers from it.//

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput_check_palindrome_num {

	public static void main(String[] args) {
		int j = 0, arr[], rev = 0, temp = 0;
		int t, count = 0;

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

			rev = 0;
			while (temp > 0) // n-=545 54>0 4>0
			{
				count = temp % 10;// 5 4 4
				rev = rev * 10 + count;// rev=0+5=5 rev=5*10+4=54 rev=54*10+4=545
				temp = (temp / 10);// temp=545/10=54 temp=54/10=4 temp=0

			}

			if (rev == (arr1[i])) {
				System.out.println(arr1[i] + "is palindrome");
			}

			else {
				System.out.println(arr1[i] + "is not pSalindrome");
			}

		}

	}

}
