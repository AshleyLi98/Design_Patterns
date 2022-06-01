
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Display d1 = new Display(new StringDisplayImpl("Hello, China."));
//		Display d2 = new CountDisplay(new StringDisplayImpl("Hello, World."));
//		CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello, Universe."));
//		RandomDisplay d4 = new RandomDisplay(new StringDisplayImpl("Hello"));
//		
//		d1.display();
//		d2.display();
//		d3.display();
//		d3.multiDisplay(5);
//		d4.randomDisplay(8);
		
		Display dText = new Display(new TextDisplayImpl("text.txt"));
		dText.display();
		
		PyrDisplay dpyr = new PyrDisplay(new DecoDisplayImpl('|', '#', '-'));
		dpyr.pyrDisplay(8);
	}

}
