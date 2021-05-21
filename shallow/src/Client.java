public class Client {
	public static void main(String a[]) {
		Email email,copyEmail;

		email=new Email();

		copyEmail=(Email)email.clone();

		System.out.println("浅克隆实现邮件复制：");
		System.out.println("email==copyEmail?");
		System.out.println(email==copyEmail);

		System.out.println("email.getAttachment==copyEmail.getAttachment?");
		System.out.println(email.getAttachment()==copyEmail.getAttachment());
	}
}