public class Changer implements Transform {
	//抽象装饰类
	private Transform transform;
	
	public Changer(Transform transform) {
		this.transform=transform;
	}
	
	public void move() {
		transform.move();	
	}
}