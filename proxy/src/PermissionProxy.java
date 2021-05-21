public class PermissionProxy implements AbstractPermission {
	//代理主题角色，游客
	private RealPermission permission=new RealPermission();
	private int level=0;

	public void modifyUserInfo() {
		if(0==level) {
			System.out.println("对不起，你没有该权限修改用户信息!");
		}
		else if(1==level) {
			permission.modifyUserInfo();
		}
	}

	public void viewNote() {
		permission.viewNote();
	}

	public void publishNote() {
		if(0==level) {
			System.out.println("对不起，你没有该权限发布新帖!");
		}
		else if(1==level) {
			permission.publishNote();
		}
	}

	public void modifyNote() {
		if(0==level) {
			System.out.println("对不起，你没有该权限修改发帖内容!");
		}
		else if(1==level) {
			permission.modifyNote();
		}
	}

	public void setLevel(int level) {
		this.level=level;
		System.out.println("用户状态：已注册");
	}
}