public class BirdAdapter extends Bird implements Robot {
	//适配器类
	public void cry() {
		System.out.print("机器人模仿：");
		super.tweedle();
	}

	public void move() {
		System.out.print("机器人模仿：");
		super.fly();
	}
}