
public class DecoDisplayImpl extends DisplayImpl{
	
	private char pre, deco, end;
	
	public DecoDisplayImpl(char pre, char deco, char end) {
		this.pre = pre;
		this.deco = deco;
		this.end = end;
	}

	@Override
	public void rawOpen() {
		// TODO Auto-generated method stub
		System.out.print(pre);
	}

	@Override
	public void rawPrint() {
		// TODO Auto-generated method stub
		System.out.print(deco);
	}

	@Override
	public void rawClose() {
		// TODO Auto-generated method stub
		System.out.println(end);
	}
	

}
