package exersize3;
import java.util.ArrayList;
import java.util.Iterator;

public class ElementArrayList implements Element{
	
	private ArrayList elementArrayList = new ArrayList();
	
	public void add(Entry entry) {
		elementArrayList.add(entry);
	}

	@Override
	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		Iterator it = elementArrayList.iterator();
		
		while(it.hasNext()) {
			Entry entry = (Entry)it.next();
			entry.accept(v);
		}
		
	}

}
