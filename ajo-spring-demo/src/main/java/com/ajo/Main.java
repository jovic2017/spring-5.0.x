package com.ajo;

import com.ajo.web.AjoSpringbootApplication;
import org.apache.catalina.LifecycleException;

import javax.servlet.ServletException;

public class Main {
	public static void main(String[] args) throws Exception, ServletException, LifecycleException {
		AjoSpringbootApplication.run();
	}
}
