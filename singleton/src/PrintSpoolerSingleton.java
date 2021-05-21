public class PrintSpoolerSingleton {
	//单例
	private static PrintSpoolerSingleton instance=null;

	private PrintSpoolerSingleton() { }

	public static PrintSpoolerSingleton getInstance() throws PrintSpoolerException {
		if(instance==null) {
			System.out.println("创建打印池！");
			instance=new PrintSpoolerSingleton();
		}
		else {
			System.out.println("无法重复创建打印池！");
			throw new PrintSpoolerException("现有打印池正在工作中！");
		}
		return instance;
	}

	public void manageJobs() {
		System.out.println("管理打印任务！");
	}
}