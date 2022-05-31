import ex3.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(args.length != 1) {
			usage();
			System.exit(0);
		}
		
		if(args[0].equals("plain")) {
			TextBuilder textbuilder = new TextBuilder();
			Director director = new Director(textbuilder);
			director.construct();
			String result = textbuilder.getResult();
			System.out.println(result);
		}else if (args[0].equals("html")) {
			HTMLBuilder htmlbuilder = new HTMLBuilder();
			Director director = new Director(htmlbuilder);
			director.construct();
			String filename = htmlbuilder.getResult();
			System.out.println(filename + " Done!");			
		}else if (args[0].equals("markdown")) {
			MarkdownBuilder markdownbuilder = new MarkdownBuilder();
			Director director = new Director(markdownbuilder);
			director.construct();
			String filename = markdownbuilder.getResult();
			System.out.println(filename + " Done!");			
		}else {
			usage();
			System.exit(0);
		}

	}
	
	public static void usage() {
		System.out.println("Usage: java Main plain");
		System.out.println("Usage: java Main html");
		System.out.println("Usage: java Main markdown");
	}

}
