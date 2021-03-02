package Plaindrome;
/*Print all the palindrome numbers between 100 and 999//
 * 
 * 
 */
public class Palindrome_num {

	public static void main(String[] args) 
	{
		int x=100,y,temp=0,rem,rev=0;
		
		for(x=100;x<=999;x++) 
		{
		   temp=x;
			while(temp!=0)
			{
				rem=x%100;
				rev=(rev*10+rem);
			    temp=x/10;
			}
			
			if(rev==x)
			{
				System.out.println("x isa palindeome");
			}
			else
			{
				System.out.println("x is not  palindeome");
			}
			
			}
			
	}

	}


