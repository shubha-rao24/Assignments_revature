package Print_odd_numbers;

//)Find all the odd numbers between 100 and 199//
public class Print_odd {

	public static void main(String[] args) {
		for (int x = 100; x <= 199; x++) {
			if (x % 2 != 0) {
				System.out.print(+x + " ");
			}

		}

	}

}
