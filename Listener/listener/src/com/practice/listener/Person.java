package com.practice.listener;

import java.io.Serializable;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionEvent;
/**
 * 如果不实现序列化接口,那么既是实现了HttpSessionActivationListener也不会将对象保存到硬盘
 * 想要将对象保存到硬盘必须实现序列化接口
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
	 * 活化时被调用
	 */
	public void sessionDidActivate(HttpSessionEvent evt) {
		System.out.println("哇哇哇！我和session从重地球了！");
	}

	/**
	 * 钝化时被调用
	 */
	public void sessionWillPassivate(HttpSessionEvent evt) {
		System.out.println("啊~我和session一起去火星了！");
	}
}