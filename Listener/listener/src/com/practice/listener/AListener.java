package com.practice.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.http.HttpServlet;
/**
 * 监听ServletContext的一生一死
 * @author Yorick
 *
 */
public class AListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("ServletContext销毁的时候调用!");

	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("ServletContext创建的时候调用!");
	}

}
