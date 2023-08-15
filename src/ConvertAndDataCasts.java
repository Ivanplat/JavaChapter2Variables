
public class ConvertAndDataCasts {
	public static void methode() {
		byte y1 = 1, y2 = 2;
		y1 = (byte)(y1 + y2);
		short z1 = 1, z2 = 2;
		z1 = (short)(z1 + z2);
		
		y1 = 127;
		y2 = 0;
		y1 = (byte)(y1 + y2); //OK 127
		
		y1 = 127;
		y2 = 10;
		y1 = (byte)(y1 + y2); //-119 !!! Byte type overflow
		
		float x = 1.2F;
		double y = 2.5;
		System.out.println(x); //1.2
		System.out.println((int)x); //1
		System.out.println(y); //2.5
		System.out.println((int)y); //2
		
		int x1 = 10, x2 = 3;
		System.out.println(x1/x2); //3
		System.out.println((double)x1/x2); //3.333333
	}
}
