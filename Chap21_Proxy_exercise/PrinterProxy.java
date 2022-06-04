
public class PrinterProxy implements Printable{
	
	private String name;
	private Printable real;
	private String className;
	
	public PrinterProxy(String name, String className) {
		this.name = name;
		this.className = className;
	}
	
	@Override
	public synchronized void setPrinterName(String name) {
		// TODO Auto-generated method stub
		
		if(real != null) {
			real.setPrinterName(name);
		}
		this.name = name;
		
	}

	@Override
	public String getPrinterName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void print(String string) {
		// TODO Auto-generated method stub
		realize();
		real.print(string);
	}
	
	private synchronized void realize() {
		if(real == null) {
			try {
				real = (Printable)Class.forName(className).newInstance();
				real.setPrinterName(name);
			}catch(ClassNotFoundException e) {
				System.err.println(className + " not found.");
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
