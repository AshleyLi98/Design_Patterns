package exercise1_exersize2;
import java.util.Iterator;

public class ListVisitor extends Visitor{
	
	private String currentdir = "";

	@Override
	public void visit(File file) {
		// TODO Auto-generated method stub
		System.out.println(currentdir + "/" + file);
		
	}

	@Override
	public void visit(Directory directory) {
		// TODO Auto-generated method stub
		
		System.out.println(currentdir + "/" + directory);
		
		String savedir = currentdir;
		currentdir = currentdir + "/" + directory.getName();
		
		Iterator it = directory.iterator();
		while(it.hasNext()) {
			Entry entry = (Entry)it.next();
			entry.accept(this);
		}
		
		currentdir = savedir;
		
	}

}
