
public class AreaOfVisibility {
	public static int x;
	
	public static void methode() {
		x = 10; //Changing the global variable
		System.out.println(x); //Using the global variable
		func(); 
		System.out.println(x); //Using the global variable
		
		int y = 0;
		if(x == 10) {
			y = 5;
			System.out.println(y);
		}
		else {
			y = 25;
			System.out.println(y);
		}
		{
			//There is y1
			int y1 = 5;
			System.out.println(y1);
		}
		//There is no more y1
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}
	
	public static void func() {
		int x = 30; //Create a local variable
		System.out.println(x); //Using the local variable
		System.out.println(AreaOfVisibility.x); //Using the global variable
		AreaOfVisibility.x = 88; //Changing the global variable
	}
}
