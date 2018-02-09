package com.risonsoft.pattern.adapter.sample01;

public class Client
{
	public static void main(String args[])
	{
		Robot robot=(Robot) com.risonsoft.pattern.factorymethod.sample01.XMLUtil.getBean();
		robot.cry();
		robot.move();
	}
}