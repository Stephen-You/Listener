package com.practice.listener;

import java.io.Serializable;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionEvent;
/**
 * �����ʵ�����л��ӿ�,��ô����ʵ����HttpSessionActivationListenerҲ���Ὣ���󱣴浽Ӳ��
 * ��Ҫ�����󱣴浽Ӳ�̱���ʵ�����л��ӿ�
 * @author Yorick
 */
public class Person implements Serializable,HttpSessionActivationListener{
	private String username;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String username) {
		super();
		this.username = username;
	}

	@Override
	public String toString() {
		return "User [username=" + username + "]";
	}

	/**
	 * �ʱ������
	 */
	public void sessionDidActivate(HttpSessionEvent evt) {
		System.out.println("�����ۣ��Һ�session���ص����ˣ�");
	}

	/**
	 * �ۻ�ʱ������
	 */
	public void sessionWillPassivate(HttpSessionEvent evt) {
		System.out.println("��~�Һ�sessionһ��ȥ�����ˣ�");
	}
}