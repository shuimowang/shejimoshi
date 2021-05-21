public class HaierFactory implements EFactory {
	//具体工厂
	public Television produceTelevision() {
		return new HaierTelevision();
	}
	
	public AirConditioner produceAirConditioner() {
		return new HairAirConditioner();
	}
}