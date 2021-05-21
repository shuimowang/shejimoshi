public class Client {
	public static void main(String a[]) {
		Email email,copyEmail=null;
		
		email=new Email();

		try{
		    copyEmail=(Email)email.deepClone();
			System.out.println("深克隆实现邮件复制:");
		}
		catch(Exception e) {
	   		e.printStackTrace();
	    }	
 
		
		System.out.println("email==copyEmail?");
		System.out.println(email==copyEmail);
		
		System.out.println("email.getAttachment==copyEmail.getAttachment?"); 
		System.out.println(email.getAttachment()==copyEmail.getAttachment());			
	}
}