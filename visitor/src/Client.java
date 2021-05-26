public class Client {
	public static void main(String a[]) {
		Product b1=new Book();
		Product b2=new Book();
		Product a1=new Apple();
		Visitor visitor1,visitor2;
		
        BuyBasket basket=new BuyBasket();
        basket.addProduct(b1);
        basket.addProduct(b2);
        basket.addProduct(a1);
        
        visitor1=(Customer)XMLUtil.getBean("customer");
        visitor2=(Saler)XMLUtil.getBean("saler");
        
        visitor1.setName("张三");
        visitor2.setName("罗翔");

        basket.accept(visitor1);
        System.out.println("---------------------------------");
        basket.accept(visitor2);
	}
}