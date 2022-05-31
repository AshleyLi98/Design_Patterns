
public class TicketMaker {
	
	private int ticket = 1000;
	
	private static TicketMaker ticketmaker = new TicketMaker();
	
	private TicketMaker() {
		System.out.println("create a ticketmaker.");
	}
	
	public int getNextTicketNumber() {
		return ticket++;
	}
	
	public static TicketMaker getInstance() {
		return ticketmaker;
	}
	
	public int getNumber() {
		return ticket;
	}

}
