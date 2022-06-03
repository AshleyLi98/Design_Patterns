
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NumberGenerator generator = new IncrementalNumberGenerator(10, 50, 5);
		
		Observer observer1 = new DigitObserver();
		Observer observer2 = new GraphObserver();
		Observer observer3 = new BoxObserver();
		
		generator.addObserver(observer1);
		generator.addObserver(observer2);
		generator.addObserver(observer3);
		generator.execute();

	}

}
