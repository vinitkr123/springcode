package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CommonController {
	
	@RequestMapping("/Demo1")
	public ModelAndView Demo1(HttpServletResponse res, HttpServletRequest req)
	{
		String view = "demo1.jsp";
		return new ModelAndView(view);
	}

}
