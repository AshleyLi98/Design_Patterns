package ex2;

public class TextBuilder extends Builder{
	
	private StringBuffer buffer = new StringBuffer();

	@Override
	public void makeTitle(String title) {
		if(flag == true) {
			System.out.println("Title already exists!");
			System.exit(0);
		}

		// TODO Auto-generated method stub
		buffer.append("============================\n");
		buffer.append("[" + title + "]\n");
		buffer.append("\n");
		
		flag = true;
		
	}

	@Override
	public void makeString(String str) {
		if(flag == false) {
			System.out.println("NO TITLE!");
			System.exit(0);
		}

		// TODO Auto-generated method stub
		buffer.append("-" + str + "\n");
		buffer.append("\n");
		
	}

	@Override
	public void makeItems(String[] items) {
		if(flag == false) {
			System.out.println("NO TITLE!");
			System.exit(0);
		}

		// TODO Auto-generated method stub
		for(int i = 0 ; i < items.length ; i ++) {
			buffer.append("  -" + items[i] + "\n");
		}
		buffer.append("\n");
		
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		buffer.append("============================\\n");
		
	}
	
	public String getResult() {
		return buffer.toString();
	}
	

}
