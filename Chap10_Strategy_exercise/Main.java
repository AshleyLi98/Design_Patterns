
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] data = {"Dumpty", "Bowman", "Carroll", "Elfland", "Alice"};
		
//		SortAndPrint s1 = new SortAndPrint(data, new SelectionSorter());
		SortAndPrint s2 = new SortAndPrint(data, new BubbleSorter());
		
//		s1.execute();
		s2.execute();

	}

}
