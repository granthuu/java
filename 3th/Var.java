
public class Var {
	public static void main(String args[]) {
		int   a = 3;

		// default is double type.....
		float f = (float)3.14;
		float f2 = 3.14f;

		// default is int type.
		int i = 4;
		short s = 4;
		short s2 = (short)40000;

		//s = i;
		s = (short)(s + 1);  
		s = (short)(s + s2);

		/* Java has no pointer */
		//int* p = malloc(10*sizeof(int));
		int p[] = new int[10];
		int p2[] = {1,2,4}; /* static alloc */
		
		//char str[100];
		char str[] = new char[100];

		//char str2[] = "abc";

		String str2 = "abc";

		p = null;
		p2 = null;
		str = null;
		str2 = null;
	}
}


