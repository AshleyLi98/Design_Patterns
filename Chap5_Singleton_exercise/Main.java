
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Start.");
//		
//		TicketMaker obj1 = TicketMaker.getInstance();
//		TicketMaker obj2 = TicketMaker.getInstance();
//		
//		System.out.println(obj2.getNumber());
//		
//		System.out.println(obj1.getNextTicketNumber());
//		System.out.println(obj1.getNextTicketNumber());
//		System.out.println(obj1.getNextTicketNumber());
//		
//		System.out.println(obj2.getNumber());
//		
//		System.out.println("End.");
//
		
		System.out.println("Start.");
		
		Triple obj1 = Triple.getInstance(1);
		Triple obj2 = Triple.getInstance(2);
		Triple obj3_1 = Triple.getInstance(3);
		Triple obj3_2 = Triple.getInstance(3);
		
		System.out.println((obj3_1 == obj3_2));
		
		System.out.println("End.");
	}

}
