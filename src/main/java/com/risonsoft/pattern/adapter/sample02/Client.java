public class Client
{
	public static void main(String args[])
	{
		DataOperation dao=(DataOperation) com.risonsoft.pattern.factorymethod.sample01.XMLUtil.getBean();
		dao.setPassword("sunnyLiu");
		String ps=dao.getPassword();
		String es=dao.doEncrypt(6,ps);
		System.out.println("����Ϊ��" + ps);
		System.out.println("����Ϊ��" + es);
	}
}


