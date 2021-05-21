public class TVChangeCommand implements AbstractCommand {
	//具体命令类
	private Television tv;
	public TVChangeCommand()
	{
		tv = new Television();
	}
	public void execute()
	{
		tv.changeChannel();
	}
}