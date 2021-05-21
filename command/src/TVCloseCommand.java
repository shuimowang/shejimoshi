public class TVCloseCommand implements AbstractCommand {
	//具体命令类
	private Television tv;
	public TVCloseCommand()
	{
		tv = new Television();
	}
	public void execute()
	{
		tv.close();
	}
}