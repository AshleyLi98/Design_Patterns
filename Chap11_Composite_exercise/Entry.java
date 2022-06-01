
public abstract class Entry {
	
	public abstract String getName();
	public abstract int getSize();
	
	public String path = "";
	
	public Entry add(Entry entry) throws FileTreatmentException{
		throw new FileTreatmentException();
	}
	
	public void printList() {
		printList("");
	}
	
	protected abstract void printList(String prefix);
	
	public String toString() {
		return getName() + "(" + getSize() + ")";
	}
	
	public void getPath() {
		System.out.println(path);
	}

}
