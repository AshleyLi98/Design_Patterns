
public class BubbleSorter implements Sorter{

	@Override
	public void sort(Comparable[] data) {
		// TODO Auto-generated method stub
		
		for(int i = 0 ; i < data.length - 1 ; i ++) {
			for(int j = 0 ; j < data.length - 1 - i ; j ++) {
				if(data[j].compareTo(data[j + 1]) > 0) {
					Comparable cur = data[j];
					data[j] = data[j + 1];
					data[j + 1] = cur;
				}
			}
		}
		
	}

}
