package idcard;
import framework.*;

public class IDCard extends Product{
	
	private String owner;
	public IDCard(String owner) {
		System.out.println("create IDCard of " + owner);
		this.owner = owner;
	}

	@Override
	public void use() {
		// TODO Auto-generated method stub
		System.out.println(owner + " used IDCard.");		
	}
	
	public String getOwner() {
		return owner;
	}

}
