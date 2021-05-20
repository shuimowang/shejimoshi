public class Cat extends MySubject {
	//具体目标
	public void cry() {
		System.out.println("猫叫！");
		System.out.println("----------------------------");		
		
		for(Object obs:observers) {
			((MyObserver)obs).response();
		}
		
	}	   	
}