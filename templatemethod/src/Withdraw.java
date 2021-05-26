public class Withdraw extends BankTemplateMethod {
	//具体子类
	@Override
	public void transact() {
		System.out.println("②取款");
	}
}