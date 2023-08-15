
public class CouldBeUsedAsVarialbeName {
	//Java variable name can be only Latin alphabet, numbers (not at the begin of the name) and '$' symbol
	public static void methode() {
		System.out.println(Character.isJavaIdentifierStart('1')); //false
		System.out.println(Character.isJavaIdentifierPart('$')); //true
	}
}
