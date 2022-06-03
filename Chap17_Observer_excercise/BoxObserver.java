
public class BoxObserver implements Observer{

	@Override
	public void update(NumberGenerator generator) {
		// TODO Auto-generated method stub
		
		System.out.println("BoxObserver:");
		
		int count = generator.getNumber();
		
		printLine(count);
		
		System.out.print('|');
		for(int i = 0 ; i < count ; i ++) System.out.print('*');
		System.out.println('|');
		
		printLine(count);
		
	}
	
	private void printLine(int count) {
		System.out.print('+');
		for(int i = 0 ; i < count ; i ++) System.out.print('-');
		System.out.println('+');		
	}

}
