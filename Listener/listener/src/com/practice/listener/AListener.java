package com.practice.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.http.HttpServlet;
/**
 * ����ServletContext��һ��һ��
 * @author Yorick
 *
 */
public class AListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("ServletContext���ٵ�ʱ�����!");

	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("ServletContext������ʱ�����!");
	}

}
