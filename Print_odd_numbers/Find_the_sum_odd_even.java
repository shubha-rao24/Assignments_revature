package Print_odd_numbers;
//Find the sum of all even numbers between 1 and 100, also find sum of all odd numbers between 1 and 100 and 

//print the results and
// print which is largest among them(between evensum and oddsum)

public class Find_the_sum_odd_even {

	public static void main(String[] args) {
		int sum_odd = 0, sum_even = 0;
		for (int x = 1; x <= 100; x++) {
			if (x % 2 != 0) {
				sum_odd = sum_odd + x;

			}

			else {

				sum_even = sum_even + x;

			}
		}

		System.out.println("sum of odd numbers:" + sum_odd);
		System.out.println("sum of even numbers:" + sum_even);

		if (sum_odd > sum_even) {
			System.out.println("Sum of odd number is the largest");
		} else if (sum_odd < sum_even)
			System.out.println("Sum of even numbers is the largest");
		else if (sum_odd == sum_even)
			System.out.println("Sum of even numbers  and the sume of odd numbers are same");

	}
}
