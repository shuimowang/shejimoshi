public abstract class BankTemplateMethod {
    //���󷽷�
    public void takeNumber() {
		System.out.println("��ȡ���Ŷ�");
	}
	
	public abstract void transact();
	
	public void evaluate() {
		System.out.println("�۷�������");
	}

    public void process() {
        this.takeNumber();
        this.transact();
        this.evaluate();
    }
} 