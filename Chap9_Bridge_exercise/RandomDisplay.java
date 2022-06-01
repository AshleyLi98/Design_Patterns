import java.util.Random;

public class RandomDisplay extends Display{

	public RandomDisplay(DisplayImpl impl) {
		super(impl);
		// TODO Auto-generated constructor stub
	}
	
	public void randomDisplay(int times) {
		Random random = new Random();
		int t = random.nextInt(times + 1);
		
		open();
		for(int i = 0 ; i < t ; i ++)	print();
		close();
	}

}
