import factory.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(args.length != 1) {
			System.out.println("Usage: java Main class.name.of.ConcreteFactory");
			System.out.println("Example 1: java Main listfactory.ListFactory");
			System.out.println("Example 2: java Main tablefactory.TableFactory");
			System.exit(0);
		}
		
		Factory factory = Factory.getFactory(args[0]);
		
		Link people = factory.createLink("people", "http://www.people.cn/");
		Link gmw = factory.createLink("gmw", "http://www.gmw.cn/");
		
		Link us_yahoo = factory.createLink("Yahoo!", "http://www.yahoo.com//");
		Link jp_yahoo = factory.createLink("Yahoo!Japan", "http://www.yahoo.co.jp/");
		Link excite = factory.createLink("Excite", "http://www.excite.com/");
		Link google = factory.createLink("Google", "http://www.google.com/");
		
		Tray traynews = factory.createTray("News");
		traynews.add(people);
		traynews.add(gmw);
		
		Tray trayyahoo = factory.createTray("Yahoo!");
		trayyahoo.add(us_yahoo);
		trayyahoo.add(jp_yahoo);
		
		Tray traysearch = factory.createTray("Search");
		traysearch.add(trayyahoo);
		traysearch.add(excite);
		traysearch.add(google);
		
		Page page = factory.createPage("LinkPage", "lst");
		page.add(traynews);
		page.add(traysearch);
		page.output();
		
		Page page_yahoo = factory.createYahooPage();
		page_yahoo.output();
	}

}
