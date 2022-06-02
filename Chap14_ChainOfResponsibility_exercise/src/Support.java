import java.util.ArrayList;
import java.util.Iterator;

public abstract class Support {
	
	private String name;
	private ArrayList list = new ArrayList();
	
	public Support(String name) {
		this.name = name;
	}
	
	public Support add(Support support) {
		list.add(support);
		return this;
	}
		
	public final void support(Trouble trouble) {
		if(resolve(trouble)) done(trouble);
		else {
			Iterator it = list.iterator();
			
			while(it.hasNext()) {
				Support support = (Support)it.next();
				if(support.resolve(trouble)) {
					support.done(trouble);
					return;
				}
			}
		}
		fail(trouble);
	}
	
	public String toString() {
		return "[" + name + "]";
	}
	
	protected abstract boolean resolve(Trouble trouble);
	
	protected void done(Trouble trouble) {
		System.out.println(trouble + " is resolved by " + this + ".");
	}
	
	protected void fail(Trouble trouble) {
		System.out.println(trouble + " cannot be resolved.");
	}

}
