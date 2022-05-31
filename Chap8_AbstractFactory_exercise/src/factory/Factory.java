package factory;

public abstract class Factory {
	
	public static Factory getFactory(String classname) {
		Factory factory = null;
		
		try {
			factory = (Factory)Class.forName(classname).newInstance();
		}catch(ClassNotFoundException e) {
			System.err.println("Class not Found!");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return factory;
	}
	
	public abstract Link createLink(String caption, String url);
	public abstract Tray createTray(String caption);
	public abstract Page createPage(String title, String author);
	public final Page createYahooPage() {
		Page p = this.createPage("Yahoo!", "Yahoo!");
		Link yahoo = this.createLink("Yahoo", "http://www.yahoo.com/");
		p.add(yahoo);
		return p;
	}

}
