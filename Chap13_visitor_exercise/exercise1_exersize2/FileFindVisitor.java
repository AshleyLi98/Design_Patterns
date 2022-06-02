package exercise1_exersize2;
import java.util.Iterator;
import java.util.ArrayList;

public class FileFindVisitor extends Visitor{
	
	private String suffix;
	private ArrayList<File> filelist = new ArrayList<File>();
	
	public FileFindVisitor(String suffix) {
		this.suffix = suffix;
	}

	@Override
	public void visit(File file) {
		// TODO Auto-generated method stub
		
		String name = file.getName();
		if(name.endsWith(suffix)) {
//			System.out.println(file);
			filelist.add(file);
		}
		
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
	
	public Iterator getFoundFiles(){
		return filelist.iterator();
	}

}
