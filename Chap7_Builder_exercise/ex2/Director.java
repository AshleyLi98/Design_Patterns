package ex2;

public class Director {
	
	private Builder builder;
	
	public Director(Builder builder) {
		this.builder = builder;
	}
	
	public void construct() {
//		builder.makeString("string before title");
		builder.makeTitle("Greeting");
		builder.makeString("Daytime");
//		builder.makeTitle("new title");
		builder.makeItems(new String[] {
				"Good morning.",
				"Good afternoon.",
		});
		builder.makeString("nigth");
		builder.makeItems(new String[] {
				"Good evening.",
				"Goodbye!",
		});
		builder.close();
	}

}
