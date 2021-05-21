public class Client {
	public static void main(String args[]) {
		Leader objDirector,objManager,objGeneralManager;

		objDirector=new Director("熊大");
		objManager=new Manager("熊二");
		objGeneralManager=new GeneralManager("光头强");
		//主任（3）、经理（10）、总经理（30）

		objDirector.setSuccessor(objManager);
		objManager.setSuccessor(objGeneralManager);
		//请求沿链传递

		LeaveRequest lr1=new LeaveRequest("喜羊羊",2);
		objDirector.handleRequest(lr1);

		LeaveRequest lr2=new LeaveRequest("美羊羊",5);
		objDirector.handleRequest(lr2);

		LeaveRequest lr3=new LeaveRequest("沸羊羊",15);
		objDirector.handleRequest(lr3);

		LeaveRequest lr4=new LeaveRequest("懒洋洋",35);
		objDirector.handleRequest(lr4);
	}
}