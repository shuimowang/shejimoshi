public class GeneralManager extends Leader {
	//具体处理者
	public GeneralManager(String name) {
		super(name);
	}

	public void handleRequest(LeaveRequest request) {
		if(request.getLeaveDays()<30) {
			System.out.println("总经理 " + name + " 审批员工" + request.getLeaveName() + "的请假条，请假天数为" + request.getLeaveDays() + "天。");
		}
		else {
			System.out.println("总经理 " + name + " 察觉到" + request.getLeaveName() + "在消遣自己，居然请假" + request.getLeaveDays() + "天。");
		}
	}
}