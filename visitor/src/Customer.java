public class Customer extends Visitor {
	//具体访问者
	@Override
	public void visit(Apple apple) {
		System.out.println("顾客" + name + "买苹果。");
	}
	
	@Override
	public void visit(Book book) {
		System.out.println("顾客" + name + "买书。");
	}
}