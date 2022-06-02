package pagemaker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Enumeration;
import java.util.Iterator;

public class PageMaker {
	
	private PageMaker() {};
	
	public static void makeWelcomPage(String mailaddr, String filename) {
		try {
			Properties mailprop = Database.getProperties("maildata");
			String username = mailprop.getProperty(mailaddr);
			
			HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
			writer.title("Welcom to " + username + "'s page!");
			writer.paragraph("Waiting for your E-mail!");
			writer.mailto(mailaddr, username);
			writer.close();
			System.out.println(filename + " is created for " + mailaddr + " (" + username + ")");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void makeLinkPage(String filename) {
		try {
			Properties mailprop = Database.getProperties("maildata");
			
			HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
			writer.title("Link Page");
			
			Enumeration e = mailprop.keys();
			Iterator it = e.asIterator();
			
			while(it.hasNext()) {
				String link = (String)it.next();
				String name = mailprop.getProperty(link);
				writer.mailto(link, name);
			}
			
			writer.close();
			System.out.println(filename + " is created");
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
