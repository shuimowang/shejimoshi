import test.Caretaker;
import test.UserInfoDTO;

public class Client {
	public static void main(String a[]) {
		UserInfoDTO user=new UserInfoDTO();
		Caretaker c=new Caretaker();

		user.setAccount("张三");
		user.setPassword("123456");
		user.setTelNo("123456789");
		System.out.println("状态一：");
		user.show();
		//保存备忘录
		c.setMemento(user.saveMemento());
		System.out.println("---------------------------");

		user.setPassword("654321");
		user.setTelNo("987654321");
		System.out.println("状态二：");
		user.show();
		System.out.println("---------------------------");

		//从备忘录中恢复
		user.restoreMemento(c.getMemento());
		System.out.println("回到状态一：");
		user.show();
		System.out.println("---------------------------");
	}
}