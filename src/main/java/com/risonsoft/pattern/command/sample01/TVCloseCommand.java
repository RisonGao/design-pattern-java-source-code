import com.risonsoft.pattern.abstractfactory.sample01.Television;

public class TVCloseCommand implements AbstractCommand
{
	private com.risonsoft.pattern.abstractfactory.sample01.Television tv;
	public TVCloseCommand()
	{
		tv = new Television();
	}
	public void execute()
	{
		tv.close();
	}
}