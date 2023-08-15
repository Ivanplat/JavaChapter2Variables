
public class ConstantsAndStaticVariables {
	public static int x;
	public static final int MY_CONST =  50;
	
	public static void methode() {
		System.out.println(x);
		x = 10;
		System.out.println(x);
		ConstantsAndStaticVariables.x = -10;
		System.out.println(x);
		System.out.println(MY_CONST);
	}
}
