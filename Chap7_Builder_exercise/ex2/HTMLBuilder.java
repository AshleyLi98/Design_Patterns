package ex2;
import java.io.*;

public class HTMLBuilder extends Builder{
	
	private String filename;
	private PrintWriter writer;
	@Override
	public void makeTitle(String title) {
		if(flag == true) {
			System.out.println("Title already exists!");
			System.exit(0);
		}
		// TODO Auto-generated method stub
		filename = title + ".html";
		try {
			writer = new PrintWriter(new FileWriter(filename));
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		writer.println("<html><head><title>" + title + "</title></head><body>");
		writer.println("<hl>" + title + "</hl>");
		
		flag = true;
		
	}
	@Override
	public void makeString(String str) {
		if(flag == false) {
			System.out.println("NO TITLE!");
			System.exit(0);
		}
		// TODO Auto-generated method stub
		writer.println("<p>" + str + "</p>");
		
	}
	@Override
	public void makeItems(String[] items) {
		if(flag == false) {
			System.out.println("NO TITLE!");
			System.exit(0);
		}
		// TODO Auto-generated method stub
		writer.println("<ul>");
		
		for(int i = 0 ; i < items.length ; i ++) {
			writer.println("<li>" + items[i] + "</li>");
		}
		
		writer.println("</ul>");
		
	}
	@Override
	public void close() {
		// TODO Auto-generated method stub
		writer.println("</body></html>");
		writer.close();
		
	}
	
	public String getResult() {
		return filename;
	}
	
	

}
