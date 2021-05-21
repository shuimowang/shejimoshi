public class Client {
	public static void main(String args[]) {
		GeneralSwitchFacade gsf=new GeneralSwitchFacade();
		gsf.on();
		//启动所有电器设备
		System.out.println("-----------------------");	
		gsf.off();
		//关闭所有电器设备
	}
}