
public class UpDownBorder extends Border{
	
	private char ch;

	protected UpDownBorder(Display display, char ch) {
		super(display);
		// TODO Auto-generated constructor stub
		this.ch = ch;
	}

	@Override
	public int getColumns() {
		// TODO Auto-generated method stub
		return display.getColumns();
	}

	@Override
	public int getRows() {
		// TODO Auto-generated method stub
		return 1 + display.getRows() + 1;
	}

	@Override
	public String getRowText(int row) {
		// TODO Auto-generated method stub
		if(row == 0 || row == display.getRows() + 1) {
			return makeLine(display.getColumns());
		}
		else return display.getRowText(row - 1);
	}
	
	private String makeLine(int count) {
		StringBuffer buf = new StringBuffer();
		for(int i = 0 ; i < count ; i ++)	buf.append(ch);
		return buf.toString();
	}

}
