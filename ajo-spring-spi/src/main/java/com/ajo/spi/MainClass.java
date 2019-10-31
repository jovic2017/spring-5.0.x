package com.ajo.spi;

import java.util.Iterator;
import java.util.ServiceLoader;

public class MainClass {
	public static void main(String[] args){
		ServiceLoader<IParseDoc> iParseDocs = ServiceLoader.load(IParseDoc.class);
		Iterator<IParseDoc> iParseDocIterator = iParseDocs.iterator();
		while (iParseDocIterator.hasNext()){
			iParseDocIterator.next().parse();
		}
	}
}
