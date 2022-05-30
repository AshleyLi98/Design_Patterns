import framework.*;
import idcard.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Factory factory = new IDCardFactory();
		
		Product card1 = factory.create("Lily");
		Product card2 = factory.create("George");
		Product card3 = factory.create("John");
		
		card1.use();
		card2.use();
		card3.use();
		
		((IDCardFactory)factory).printMap();

	}

}
