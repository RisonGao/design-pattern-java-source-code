package com.risonsoft.pattern.visitor.sample01;

public class Book implements Product
{
  public void accept(Visitor visitor)
  {
      visitor.visit(this);
  }	
}