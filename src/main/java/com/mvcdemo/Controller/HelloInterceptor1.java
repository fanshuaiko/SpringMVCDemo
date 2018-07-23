package com.mvcdemo.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class HelloInterceptor1 implements HandlerInterceptor {


	//返回值：
	//false：终止请求，该拦截器中之后的方法都不会执行
	//true：请求继续
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("执行到了HelloInterceptor1中的preHandle");
		return HandlerInterceptor.super.preHandle(request, response, handler);
	}
	
	//可以通过modelAndView参数来改变显示的视图，或发往视图 的参数
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("执行到了HelloInterceptor1中的postHandle");
//		//修改显示的视图为home.jsp
//		modelAndView.setViewName("home");
//		//设置发往视图的参数
//		modelAndView.addObject("msg", "通过HelloInterceptor1拦截器将所有的返回视图都转到了这个页面， this is HelloInterceptor1 msg");
		
		HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
	}
	
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("执行到了HelloInterceptor1中的afterCompletion");
		HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
	}


	
}
