
public class Triple {
	
	private static Triple trp1 = new Triple();
	private static Triple trp2 = new Triple();
	private static Triple trp3 = new Triple();
	
	private Triple() {
		System.out.println("Create 3-obj.");
	}
	
	public static Triple getInstance(int id) {
		if(id == 1)return trp1;
		else if (id == 2)return trp2;
		else return trp3;
	}
	

}
