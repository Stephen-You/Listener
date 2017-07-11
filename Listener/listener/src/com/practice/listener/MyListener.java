package com.practice.listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

public class MyListener implements HttpSessionAttributeListener,ServletContextAttributeListener,ServletRequestAttributeListener{

	

	@Override
	public void attributeAdded(HttpSessionBindingEvent arg0) {
		System.out.println("session添加属性的时候调用!");
	}

	@Override
	public void attributeRemoved(HttpSessionBindingEvent arg0) {
		System.out.println("session移除属性的时候调用此方法!");
	}

	@Override
	public void attributeReplaced(HttpSessionBindingEvent arg0) {
		System.out.println("session修改属性时调用此方法!");
	}

	@Override
	public void attributeAdded(ServletRequestAttributeEvent arg0) {
		System.out.println("request移除属性的时候调用此方法!");
	}

	@Override
	public void attributeRemoved(ServletRequestAttributeEvent arg0) {
		System.out.println("request移除属性的时候调用此方法!");
	}

	@Override
	public void attributeReplaced(ServletRequestAttributeEvent arg0) {
		System.out.println("request修改属性时调用此方法!");
	}

	@Override
	public void attributeAdded(ServletContextAttributeEvent arg0) {
		System.out.println("context添加属性调用此方法!");
	}

	@Override
	public void attributeRemoved(ServletContextAttributeEvent arg0) {
		System.out.println("context移除属性调用此方法!");	
	}

	@Override
	public void attributeReplaced(ServletContextAttributeEvent arg0) {
		System.out.println("context修改属性调用此方法!");
	}

}
