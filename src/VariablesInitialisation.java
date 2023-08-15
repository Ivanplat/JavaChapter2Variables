
public class VariablesInitialisation {
	public static void methode() {
		char ch1, ch2;
		ch1 = '\u005B'; // [
		ch2 = '\u005D'; // ]
		System.out.println(ch1 + "" + ch2);
		
		int x, y, z, k;
		x = 119;
		y = 0167;
		z = 0x77;
		k = 0B01110111;
		System.out.println(x + "" + y + "" + z + "" + k);
		
		double d1, d2, d3, d4;
		d1 = 20.0;
		d2 = 12.1e5;
		d3 = .123;
		d4 =  47.E-5;
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		
		float f1, f2;
		f1 = 20.0F;
		f2 = 12.1e5F;
		
		System.out.println(f1);
		System.out.println(f2);
	}
}
