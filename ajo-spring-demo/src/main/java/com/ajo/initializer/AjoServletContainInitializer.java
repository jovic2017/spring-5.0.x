package com.ajo.initializer;

import com.ajo.listener.DemoListener;
import com.ajo.service.Ajo;
import com.ajo.servlet.DemoServlet;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import javax.servlet.annotation.HandlesTypes;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@HandlesTypes(value = Ajo.class)
public class AjoServletContainInitializer implements ServletContainerInitializer {
	// Tomcat启动的时候会调用该方法
	// Set<Class<?>> c ：所有HandlesTypes中Ajo接口的实现类
	@Override
	public void onStartup(Set<Class<?>> c, ServletContext ctx) throws ServletException {
		List<Ajo> ajoList = new ArrayList<Ajo>();
		if(c!=null){
			for(Class<?> ajoClass : c){
				if(!ajoClass.isInterface() && !Modifier.isAbstract(ajoClass.getModifiers())){
					try {
						ajoList.add((Ajo)ajoClass.newInstance());
					} catch (InstantiationException e) {
						e.printStackTrace();
					} catch (IllegalAccessException e) {
						e.printStackTrace();
					}
				}
			}
		}

		for(Ajo ajo : ajoList){
			ajo.hello();
		}

		//通过ServletContext注册Listener
		ctx.addListener(DemoListener.class);

		//注册Servlet
		ServletRegistration.Dynamic servletRegistration = ctx.addServlet("demoServlet",new DemoServlet());
		servletRegistration.addMapping("/demoServlet");

		//同理，有需要的话也可以自己注册filter

	}
}
