package idcard;
import framework.*;

public class IDCard extends Product{
	
	private String owner;
	private int number;
	
	IDCard(String owner, int number) {
		System.out.println("create IDCard of " + owner);
		this.owner = owner;
		this.number = number;
	}

	@Override
	public void use() {
		// TODO Auto-generated method stub
		System.out.println(owner + " used IDCard.");		
	}
	
	public String getOwner() {
		return owner;
	}
	
	public int getNumber() {
		return number;
	}

}
