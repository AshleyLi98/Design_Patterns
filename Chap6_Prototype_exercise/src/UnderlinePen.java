import framework.*;

public class UnderlinePen extends Product{
	
	private char ulchar;
	
	public UnderlinePen(char ulchar) {
		this.ulchar = ulchar;
	}

	@Override
	public void use(String s) {
		// TODO Auto-generated method stub
		int length = s.getBytes().length;
		
		System.out.println(s);
		
		for(int i = 0 ; i < length ; i ++)	System.out.print(ulchar);
		System.out.println();
		
	}

//	@Override
//	public Product createClone() {
//		// TODO Auto-generated method stub
//		Product p = null;
//		
//		try {
//			p = (Product)clone();
//		}catch(CloneNotSupportedException e) {
//			e.printStackTrace();
//		}
//		
//		return p;
//	}
	

}
