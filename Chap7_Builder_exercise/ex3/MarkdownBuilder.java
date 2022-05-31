package ex3;
import java.io.*;

public class MarkdownBuilder implements Builder{
	
	private String filename;
	private PrintWriter writer;

	@Override
	public void makeTitle(String title) {
		// TODO Auto-generated method stub
		filename = title + ".md";
		try {
			writer = new PrintWriter(new FileWriter(filename));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		writer.println("# " + title);
		writer.println();
		
	}

	@Override
	public void makeString(String str) {
		// TODO Auto-generated method stub
		writer.println(str);
		writer.println();
	}

	@Override
	public void makeItems(String[] items) {
		// TODO Auto-generated method stub
		
		for(int i = 0 ; i < items.length ; i ++) {
			writer.println("+ " + items[i]);
		}
		
		writer.println();
		
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		writer.close();
		
	}
	
	public String getResult() {
		return filename;
	}

}
