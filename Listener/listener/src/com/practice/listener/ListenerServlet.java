package com.practice.listener;

import java.net.HttpRetryException;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.itcast.servlet.BaseServlet;

public class ListenerServlet extends BaseServlet{
	public String contextOperation(HttpServletRequest request,HttpServletResponse response){
		ServletContext sc = request.getServletContext();
		sc.setAttribute("a", "aaa");
		sc.setAttribute("b", "bbb");
		sc.setAttribute("a", "abc");
		sc.removeAttribute("b");
		return "/index.jsp";
	}
	public String requestOperator(HttpServletRequest request,HttpServletResponse response){
		request.setAttribute("a", "aaa");
		request.setAttribute("b", "bbb");
		request.setAttribute("a", "abc");
		request.removeAttribute("b");
		return "/index.jsp";
	}
	public String sessionOperator(HttpServletRequest request,HttpServletResponse response){
		HttpSession session = request.getSession();
		session.setAttribute("a", "aaa");
		session.setAttribute("b", "bbb");
		session.setAttribute("a", "abc");
		session.removeAttribute("b");
		return "/index.jsp";
	}
}
