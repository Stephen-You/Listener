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
		System.out.println("session������Ե�ʱ�����!");
	}

	@Override
	public void attributeRemoved(HttpSessionBindingEvent arg0) {
		System.out.println("session�Ƴ����Ե�ʱ����ô˷���!");
	}

	@Override
	public void attributeReplaced(HttpSessionBindingEvent arg0) {
		System.out.println("session�޸�����ʱ���ô˷���!");
	}

	@Override
	public void attributeAdded(ServletRequestAttributeEvent arg0) {
		System.out.println("request�Ƴ����Ե�ʱ����ô˷���!");
	}

	@Override
	public void attributeRemoved(ServletRequestAttributeEvent arg0) {
		System.out.println("request�Ƴ����Ե�ʱ����ô˷���!");
	}

	@Override
	public void attributeReplaced(ServletRequestAttributeEvent arg0) {
		System.out.println("request�޸�����ʱ���ô˷���!");
	}

	@Override
	public void attributeAdded(ServletContextAttributeEvent arg0) {
		System.out.println("context������Ե��ô˷���!");
	}

	@Override
	public void attributeRemoved(ServletContextAttributeEvent arg0) {
		System.out.println("context�Ƴ����Ե��ô˷���!");	
	}

	@Override
	public void attributeReplaced(ServletContextAttributeEvent arg0) {
		System.out.println("context�޸����Ե��ô˷���!");
	}

}
