package Loops;

import java.util.Scanner;

//generate multiplcation for num 10
public class Do_while {

	public static void main(String[] args) 
	{
		System.out.println("Enter thenum to generate its table");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int j=1,res=0;
		do {
			
			res=num*j;
			
			System.out.println(num*j);
			j++;
		} while(j<=10);
	}

}
