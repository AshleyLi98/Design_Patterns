
public class Singleton {
	
	private static Singleton singleton = new Singleton();
	private Singleton() {
		System.out.println("Create a singleton!");
	}
	
	public static Singleton getInstance() {
		return singleton;
	}

}
