package long_wrapper;

public class Long_wrapper {

	public static void main(String[] args) {
		Long i1 = 272732663L;
		Long i2 = 272732663L;
		Long i3 = new Long(272732663);
		System.out.println("i1=i2:" + (i1 == i2));
		System.out.println("i1=i3:" + (i1 == i3));
		System.out.println("i1=i2:" + (i1.equals(i2)));

		System.out.println(System.identityHashCode(i1));
		System.out.println(System.identityHashCode(i2));
		System.out.println(System.identityHashCode(i3));

		i2++;
		System.out.println(System.identityHashCode(i2));
		// *auto boxing
		long x = 3456678L;
		System.out.println("x=" + x);
		i2 = x;
		System.out.println(i2);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		String s = "128765444";
		Long l = Long.parseLong(s);
		System.out.println(l);
		
	   Long l2 = (long) i2.floatValue();
		System.out.println(l2);
		Float f=233456567.6778f;
long m=f.longValue();
System.out.println("m="+m);

	}
}