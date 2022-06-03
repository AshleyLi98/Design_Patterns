
public class IncrementalNumberGenerator extends NumberGenerator{
	
	private int begin, end, step;
	private int current;
	
	public IncrementalNumberGenerator(int begin, int end, int step) {
		this.begin = begin;
		this.end = end;
		this.step = step;
	}

	@Override
	public int getNumber() {
		// TODO Auto-generated method stub
		return current;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		
		for(int i = begin ; i < end ; i += step) {
			current = i;
			notifyObservers();
		}
		
	}

}
