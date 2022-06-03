import game.*;
import java.io.*;

public class Main {
	
	public static final String SAVEFILENAME = "game.dat";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gamer gamer = new Gamer(100);
		Memento memento = loadMemento();
		
		if(memento != null) {
			System.out.println("game.dat found. Continue!");
			gamer.restoreMemento(memento);
		}else {
			System.out.println("New game.");
			memento = gamer.createMemento();
		}
		
		for(int i = 0 ; i < 100 ; i ++) {
			System.out.println("==== " + i);
			System.out.println("Current: " + gamer);
			
			gamer.bet();
			
			System.out.println("Money = " + gamer.getMoney());
			
			if(gamer.getMoney() > memento.getMoney()) {
				System.out.println("continue...");
				memento = gamer.createMemento();
				saveMemento(memento);
			}else if(gamer.getMoney() < memento.getMoney() / 2) {
				System.out.println("recover...");
				gamer.restoreMemento(memento);
			}
			
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e) {
			}
			
			System.out.println();
		}

	}
	
	public static void saveMemento(Memento memento) {
		try {
			ObjectOutput out = new ObjectOutputStream(new FileOutputStream(SAVEFILENAME));
			out.writeObject(memento);
			out.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static Memento loadMemento() {
		Memento memento = null;
		try {
			ObjectInput in = new ObjectInputStream(new FileInputStream(SAVEFILENAME));
			memento = (Memento)in.readObject();
			in.close();
		}catch(FileNotFoundException e) {
			System.out.println(e.toString());
		}catch (IOException e) {
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return memento;
	}

}
