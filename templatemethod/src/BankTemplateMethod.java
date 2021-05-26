public abstract class BankTemplateMethod {
    //抽象方法
    public void takeNumber() {
		System.out.println("①取号排队");
	}
	
	public abstract void transact();
	
	public void evaluate() {
		System.out.println("③反馈评分");
	}

    public void process() {
        this.takeNumber();
        this.transact();
        this.evaluate();
    }
} 