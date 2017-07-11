package com.practice.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class SessionListener implements HttpSessionListener{

	@Override
	public void sessionCreated(HttpSessionEvent arg0) {
		System.out.println("Session������ʱ����!");
		
	}
	@Override
	public void sessionDestroyed(HttpSessionEvent arg0) {
		System.out.println("Session�������ǵ���!");
	}

}
