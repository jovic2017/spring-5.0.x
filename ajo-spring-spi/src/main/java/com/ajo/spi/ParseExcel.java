package com.ajo.spi;

public class ParseExcel implements IParseDoc {
	//spi通过反射创建ParseExcel对象，所以需要提供一个无参的构造函数
	public ParseExcel(){}
	@Override
	public void parse() {
		System.out.println("parse excel...");
	}
}
