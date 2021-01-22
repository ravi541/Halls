package com.ravi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController1 {

	public LoginController1() {
	System.out.println("Login controller1 constructor called..");
	}
	
	@RequestMapping(value="/hi")
	public ModelAndView displayMessage()
	{
		System.out.println("display message called..");
		ModelAndView mav=new ModelAndView("Hello");
		mav.addObject("msg","Hello gud mrngGGG");
		return mav;
	}
	
	@RequestMapping(value="/ravi")
	public ModelAndView getmsg()
	{
		System.out.println("get msg called..");
		ModelAndView mav=new ModelAndView("Hello");
		mav.addObject("msg","Hello gud mrng raviii");
		return mav;
		
	}
}
