package com.practice.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class RequestListener implements ServletRequestListener{

	@Override
	public void requestDestroyed(ServletRequestEvent arg0) {
		System.out.println("request�������ǵ���!");
	}

	@Override
	public void requestInitialized(ServletRequestEvent arg0) {
		System.out.println("request������ʱ����!");
	}

}