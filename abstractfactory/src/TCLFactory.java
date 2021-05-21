public class TCLFactory implements EFactory {
	//具体工厂
	public Television produceTelevision() {
		return new TCLTelevision();
	}
	
	public AirConditioner produceAirConditioner() {
		return new TCLAirConditioner();
	}
}