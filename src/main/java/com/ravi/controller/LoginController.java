package com.ravi.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

import org.springframework.web.servlet.mvc.Controller;



public class LoginController implements  Controller{
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
	System.out.println("HR method called...");
	ModelAndView mav=new ModelAndView("Hello");
	mav.addObject("msg","HII am from spring controller class simple url");
		return mav;
	}
	
	

	
}
