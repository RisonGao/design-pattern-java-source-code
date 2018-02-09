import com.risonsoft.pattern.factorymethod.sample01.HisenseTV;
import com.risonsoft.pattern.factorymethod.sample01.TV;

public class TVFactory
{
	public static TV produceTV(String brand) throws Exception
	{
		if(brand.equalsIgnoreCase("Haier"))
		{
			System.out.println("���ӻ����������������ӻ���");
			return new com.risonsoft.pattern.factorymethod.sample01.HaierTV();
		}
		else if(brand.equalsIgnoreCase("Hisense"))
		{
			System.out.println("���ӻ������������ŵ��ӻ���");
			return new HisenseTV();
		}
		else
		{
			throw new Exception("�Բ����ݲ���������Ʒ�Ƶ��ӻ���");
		}
	}
}