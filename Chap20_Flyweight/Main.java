import java.lang.Runtime;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length != 2) {
			System.out.println("Usage: java Main digits ShareOrNot");
			System.out.println("Example: java Main 1212123 false");
			System.exit(0);
		}
		
		boolean shared = args[1] == "true" ? true : false;
		
		BigString bs = new BigString(args[0], shared);
		bs.print();
		
		Runtime.getRuntime().gc();
		long used = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		System.out.println("Memory Used :" + used);
	}

}
