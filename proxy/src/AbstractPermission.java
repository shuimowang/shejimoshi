public interface AbstractPermission {
	//抽象主题角色
	public void modifyUserInfo();
	public void viewNote();
	public void publishNote();
	public void modifyNote();
	public void setLevel(int level);
}