import com.risonsoft.pattern.abstractfactory.sample01.Television;

public class TVOpenCommand implements AbstractCommand
{
	private com.risonsoft.pattern.abstractfactory.sample01.Television tv;
	public TVOpenCommand()
	{
		tv = new Television();
	}
	public void execute()
	{
		tv.open();
	}
}