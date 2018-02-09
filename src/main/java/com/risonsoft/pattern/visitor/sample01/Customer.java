package com.risonsoft.pattern.visitor.sample01;

public class Customer extends Visitor
{
	public void visit(Apple apple)
	{
		System.out.println("�˿�" + name + "ѡƻ����");
	}
	
	public void visit(Book book)
	{
		System.out.println("�˿�" + name + "���顣");
	}
}