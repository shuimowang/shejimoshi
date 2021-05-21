public class Client {
	public static void main(String args[]) {
         try {
         	TV tv;
         	TVFactory factory;
         	factory=(TVFactory)XMLUtil.getBean();
         	//工厂
         	tv=factory.produceTV();
         	tv.play();
         	//产品
         }
         catch(Exception e) {
         	System.out.println(e.getMessage());
         }
	}
}
