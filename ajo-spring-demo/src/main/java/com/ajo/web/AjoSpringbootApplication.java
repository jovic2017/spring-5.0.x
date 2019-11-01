package com.ajo.web;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

import javax.servlet.ServletException;

public class AjoSpringbootApplication {

	public static void run() throws LifecycleException, ServletException {
		Tomcat tomcat = new Tomcat();
		tomcat.setPort(8080);
		tomcat.addWebapp("/","/Users/caizy/gitsources/spring-framework-5.0.x/ajo-spring-demo");
		tomcat.start();
		tomcat.getServer().await();
	}

}
