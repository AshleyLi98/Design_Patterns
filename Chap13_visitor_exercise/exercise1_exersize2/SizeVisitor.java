package exercise1_exersize2;
import java.util.Iterator;

public class SizeVisitor extends Visitor{
	
	int size = 0;

	@Override
	public void visit(File file) {
		// TODO Auto-generated method stub
		size += file.getSize();
		
	}

	@Override
	public void visit(Directory directory) {
		// TODO Auto-generated method stub
		
		Iterator it = directory.iterator();
		
		while(it.hasNext()) {
			Entry entry = (Entry)it.next();
			entry.accept(this);
		}
		
	}
	
	public void printDirSize() {
		System.out.println(size);
	}

}
