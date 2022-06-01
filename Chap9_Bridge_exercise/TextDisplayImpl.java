import java.io.*;

public class TextDisplayImpl extends DisplayImpl{
	
	String filename;
	Reader reader;
	
	public TextDisplayImpl(String filename) {
		this.filename = filename;
	}

	@Override
	public void rawOpen() {
		// TODO Auto-generated method stub
		try {
			reader = new FileReader(filename);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void rawPrint() {
		// TODO Auto-generated method stub
		int i;
		try {
			while((i = reader.read()) != -1) {
				System.out.print((char)i);
			}
			System.out.println();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void rawClose() {
		// TODO Auto-generated method stub
		try {
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
