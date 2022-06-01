
public class PyrDisplay extends Display{

	public PyrDisplay(DisplayImpl impl) {
		super(impl);
		// TODO Auto-generated constructor stub
	}
	
	public void pyrDisplay(int times) {
		for(int i = 0 ; i < times ; i ++) {
			open();
			for(int j = 0 ; j < i ; j ++)	print();
			close();
		}
	}

}
