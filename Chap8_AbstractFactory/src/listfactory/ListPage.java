package listfactory;
import factory.*;
import java.util.Iterator;

public class ListPage extends Page{

	public ListPage(String title, String author) {
		super(title, author);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String makeHTML() {
		// TODO Auto-generated method stub
		StringBuffer buffer = new StringBuffer();
		buffer.append("<html><head><title>" + title + "</title></head>\n");
		buffer.append("<body>\n");
		buffer.append("<hl>" + title + "</hl>\n");
		buffer.append("<ul>\n");
		
		Iterator it = content.iterator();
		while(it.hasNext()) {
			Item item = (Item)it.next();
			buffer.append(item.makeHTML());
		}
		
		buffer.append("</ul>\n");
		buffer.append("<hr><address>" + author + "</address>");
		buffer.append("</body></html>\n");
		
		return buffer.toString();
	}

}
