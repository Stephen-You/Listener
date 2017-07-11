package com.practice.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class SessionListener implements HttpSessionListener{

	@Override
	public void sessionCreated(HttpSessionEvent arg0) {
		System.out.println("Session被创建时调用!");
		
	}
	@Override
	public void sessionDestroyed(HttpSessionEvent arg0) {
		System.out.println("Session被销毁是调用!");
	}

}
