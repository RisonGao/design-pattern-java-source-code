import com.risonsoft.pattern.abstractfactory.sample01.Television;

public class Client
{
	public static void display(com.risonsoft.pattern.abstractfactory.sample01.Television tv)
	{
		TVIterator i=tv.createIterator();
		System.out.println("���ӻ�Ƶ����");
		while(!i.isLast())
		{
			System.out.println(i.currentChannel().toString());
			i.next();
		}
	}
	
	public static void reverseDisplay(Television tv)
	{
		TVIterator i=tv.createIterator();
		i.setChannel(5);
		System.out.println("����������ӻ�Ƶ����");
		while(!i.isFirst())
		{
			i.previous();
			System.out.println(i.currentChannel().toString());
		}
	}
	
	public static void main(String a[])
	{
		Television tv;
		tv=(Television) com.risonsoft.pattern.factorymethod.sample01.XMLUtil.getBean();
		display(tv);
		System.out.println("--------------------------");
		reverseDisplay(tv);
	}
}