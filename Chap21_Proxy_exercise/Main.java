
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Printable p = new PrinterProxy("Alice", "Printer");
		System.out.println("name is " + p.getPrinterName() + ".");
		p.setPrinterName("Bob");
		System.out.println("name is " + p.getPrinterName() + ".");
		p.print("Hello, world.");

	}

}
