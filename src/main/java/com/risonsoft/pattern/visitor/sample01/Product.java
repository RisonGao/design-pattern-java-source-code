package com.risonsoft.pattern.visitor.sample01;

public interface Product
{
	void accept(Visitor visitor);
}