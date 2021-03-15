package ass1_converting_last_chars_to_upper;
/*Take a sentence as input and convert all the last chars to upper case of every word*/

import java.util.Arrays;

public class Ass1_convert_last_chars_to_upper {

	public static void main(String[] args)
	{
		String s="string is immutable and strinbuffer and string bilber is not";
		String ar[]=s.split("   ");
		
	    StringBuilder sb=new StringBuilder();
		System.out.println(Arrays.toString(ar));
		for( int i=0;i<ar.length;i++)
{
		String w=ar[i];
                 String sub1=w.substring(0,w.length()-1);
                 String sub2=w.substring(w.length()-1,w.length());
                 String sub2_c=sub2.toUpperCase();
                sb.append(sub1).append(sub2_c);
                 System.out.println(sb);

	}

}
}