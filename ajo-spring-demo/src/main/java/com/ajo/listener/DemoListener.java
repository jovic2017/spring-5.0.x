package com.ajo.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class DemoListener implements ServletContextListener {

	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("DemoListener loaded...");
	}
}
