
public class Main {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Display b1 = new StringDisplay("Hello, world");
//		Display b2 = new UpDownBorder(b1, '#');
//		Display b3 = new FullBorder(b2);
//		
//		b1.show();
//		b2.show();
//		b3.show();
		
//		Display b4 = 
//				new SideBorder(
//						new FullBorder(
//							new FullBorder(
//									new SideBorder(
//											new StringDisplay("Hellow world!"), '*'))), '/');
//		
//		b4.show();
		
		MultiStringDisplay md = new MultiStringDisplay();
		md.add("Good morning.");
		md.add("Good afternoon.");
		md.add("Good evening.");
		
		Display d1 = new SideBorder(md, '#');
		d1.show();
		
		Display d2 = new FullBorder(md);
		d2.show();
	}

}
