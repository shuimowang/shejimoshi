public class Client {
	public static void main(String args[]) {
         try {
         	EFactory factory;
         	Television tv;
         	AirConditioner ac;
         	factory=(EFactory)XMLUtil.getBean();
         	//工厂
         	tv=factory.produceTelevision();
         	tv.play();
         	//电视
         	ac=factory.produceAirConditioner();
         	ac.changeTemperature();
         	//空调
         }
         catch(Exception e) {
         	System.out.println(e.getMessage());
         }
	}
}
