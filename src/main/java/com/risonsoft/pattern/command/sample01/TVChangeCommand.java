import com.risonsoft.pattern.abstractfactory.sample01.Television;

public class TVChangeCommand implements AbstractCommand
{
	private com.risonsoft.pattern.abstractfactory.sample01.Television tv;
	public TVChangeCommand()
	{
		tv = new Television();
	}
	public void execute()
	{
		tv.changeChannel();
	}
}