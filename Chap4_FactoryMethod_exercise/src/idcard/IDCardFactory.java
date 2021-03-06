package idcard;
import framework.*;
import java.util.*;
import java.util.Map.Entry;

public class IDCardFactory extends Factory{
	
	private List owners = new ArrayList();
	private int last = 0;
	HashMap<Integer, String>	map = new HashMap<Integer, String>();

	@Override
	protected Product createProduct(String owner) {
		// TODO Auto-generated method stub
		Product idCard = new IDCard(owner, last);
		last++;
		return idCard;
	}

	@Override
	protected void registerProduct(Product product) {
		// TODO Auto-generated method stub
		owners.add(((IDCard)product).getOwner());
		map.put(((IDCard)product).getNumber(), ((IDCard)product).getOwner());
	}
	
	public List getOwners() {
		return owners;
	}
	
	public void printMap() {
		Iterator<Entry<Integer, String>> iter = map.entrySet().iterator();
		
		while(iter.hasNext()) {
			Entry<Integer, String>	entry = iter.next();
			System.out.println(entry.getKey() + ":" +entry.getValue());
		}
	}

}
