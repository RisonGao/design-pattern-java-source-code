public class Client
{
	public static void main(String a[])
	{
		BankTemplateMethod bank;
		bank=(BankTemplateMethod) com.risonsoft.pattern.factorymethod.sample01.XMLUtil.getBean();
		bank.process();
		System.out.println("---------------------------------------");
	}
}
