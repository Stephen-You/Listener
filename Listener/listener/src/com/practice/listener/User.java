package com.practice.listener;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

public class User implements HttpSessionBindingListener{
	private String username;
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + "]";
	}
	@Override
	public void valueBound(HttpSessionBindingEvent evt) {
		/*
		 * ��ǰ�������ӵ�session��ʱ������
		 */
		System.out.println("����һ�����ֵ�User���ҵ����ƽ�" + username + "���Һܸ���session���������ˣ�");
	}
	@Override
	public void valueUnbound(HttpSessionBindingEvent arg0) {
		/*
		 * ��ǰ����session�Ƴ�ʱ������
		 */
		System.out.println("����һ����ù��User���ҵ����ƽ�" + username + "�������session���������ˣ�");
	}
}