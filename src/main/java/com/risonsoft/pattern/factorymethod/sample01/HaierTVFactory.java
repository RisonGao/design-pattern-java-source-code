package com.risonsoft.pattern.factorymethod.sample01;

public class HaierTVFactory implements TVFactory
{
    public TV produceTV()
    {
    	System.out.println("�������ӻ����������������ӻ���");
    	return new HaierTV();
    }
}