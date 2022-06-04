
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length == 0) {
			System.out.println("Usage: java Main digits");
			System.out.println("Example: java Main 1212123");
			System.exit(0);
		}
		
		BigString bs = new BigString(args[0]);
		bs.print();
	}

}
