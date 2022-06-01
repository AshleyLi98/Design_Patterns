import java.util.ArrayList;
import java.util.Iterator;

public class MultiStringDisplay extends Display{
	
	private ArrayList strings = new ArrayList();
	int rows;
	int columns;
	
	public MultiStringDisplay() {
		rows = 0;
		columns = 0;
	}
	
	public void add(String string) {
		strings.add(string);
		rows++;
		if(string.getBytes().length > columns)	columns = string.getBytes().length;
	}

	@Override
	public int getColumns() {
		// TODO Auto-generated method stub
		return columns;
	}

	@Override
	public int getRows() {
		// TODO Auto-generated method stub
		return rows;
	}

	@Override
	public String getRowText(int row) {
		// TODO Auto-generated method stub
		StringBuffer buf = new StringBuffer();
		
		String s = "";
		
		Iterator it = strings.iterator();
		for(int i = 0 ; i <= row ; i ++) {
			s = (String)it.next();
		}
		
		buf.append(s);
		
		for(int i = 0 ; i < getColumns() - s.getBytes().length ; i ++)	buf.append(" ");
		
		return buf.toString();
	}

}
