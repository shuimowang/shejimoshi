public class TVOpenCommand implements AbstractCommand {
	//具体命令类
	private Television tv;
	public TVOpenCommand()
	{
		tv = new Television();
	}
	public void execute()
	{
		tv.open();
	}
}