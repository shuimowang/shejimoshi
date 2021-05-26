import java.util.*;

public class BuyBasket {
	//对象结构，购物车
	private ArrayList list=new ArrayList();
	
	public void accept(Visitor visitor) {
		Iterator i=list.iterator();
		
		while(i.hasNext()) {
			((Product)i.next()).accept(visitor);	
		}
	}
	
	public void addProduct(Product product) {
		list.add(product);
	}
	
	public void removeProduct(Product product) {
		list.remove(product);
	}
}