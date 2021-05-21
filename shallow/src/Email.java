public class Email implements Cloneable {
	private Attachment attachment=null;

	public Email() {
		this.attachment=new Attachment();
	}

	public Object clone() {
		//浅克隆
		Email clone=null;
		try {
			clone=(Email)super.clone();
		}
		catch(CloneNotSupportedException e) {
			System.out.println("Clone failure!");
		}
		return clone;
	}

	public Attachment getAttachment() {
		return this.attachment;
	}

	public void display() {
		System.out.println("查看邮件");
	}

}