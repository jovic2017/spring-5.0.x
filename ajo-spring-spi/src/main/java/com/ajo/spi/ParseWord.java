package com.ajo.spi;

public class ParseWord implements IParseDoc {

	//spi通过反射创建ParseWord对象，所以需要提供一个无参的构造函数
	public ParseWord(){}

	@Override
	public void parse() {
		System.out.println("Parse Word...");
	}
}
