public class Deposit extends BankTemplateMethod {
	//具体子类
	@Override
	public void transact() {
		System.out.println("②存款");
	}
}