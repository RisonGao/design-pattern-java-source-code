public class TCLTelevision implements com.risonsoft.pattern.abstractfactory.sample01.Television
{
	private Object[] obj={"��������","��������","�Ϻ�����","��������","����������"};
	public TVIterator createIterator()
	{
		return new TCLIterator();
	}
   
	class TCLIterator implements TVIterator
	{
	   	private int currentIndex=0;
	   	 	
		public void next()
		{
			if(currentIndex<obj.length)
			{
				currentIndex++;
			}
		}
		
		public void previous()
		{
			if(currentIndex>0)
			{
				currentIndex--;
			}
		}	
		
		public void setChannel(int i)
		{
			currentIndex=i;
		}
		
		
		public Object currentChannel()
		{
			return obj[currentIndex];
		}
		
		public boolean isLast()
		{
			return currentIndex==obj.length;
		}
	
		public boolean isFirst()
		{
			return currentIndex==0;
		}
	}
}