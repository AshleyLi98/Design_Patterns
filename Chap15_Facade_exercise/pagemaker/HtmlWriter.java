package pagemaker;

import java.io.Writer;
import java.io.IOException;

public class HtmlWriter {
	
	private Writer writer;
	
	protected HtmlWriter(Writer writer) {
		this.writer = writer;
	}
	
	protected void title(String title) throws IOException{
		writer.write("<html>");
		writer.write("<head>");
		writer.write("<title>" + title + "</title></head><body>\n");
		writer.write("<hl>" + title + "</hl>\n");
	}
	
	protected void paragraph(String msg) throws IOException{
		writer.write("<p>" + msg + "</p>\n");
	}
	
	protected void link(String href, String caption)throws IOException{
		paragraph("<a href=\"" + href + "\">" + caption + "</a>");
	}
	
	protected void mailto(String mailaddr, String username) throws IOException{
		link("mailto: " + mailaddr, username);
	}
	
	protected void close() throws IOException{
		writer.write("</body>");
		writer.write("</html>\n");
		writer.close();
	}

}
