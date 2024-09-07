package com.Dispatcher;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {
	
	@RequestMapping(value = "/add")
	public ModelAndView add(HttpServletRequest req , HttpServletResponse res) {

		int num1 = Integer.parseInt(req.getParameter("num1"));
		int num2 = Integer.parseInt(req.getParameter("num2"));
		
		System.out.println("result is: " +(num1+num2));
		int result = num1+num2;
		ModelAndView mv =new ModelAndView();
		mv.setViewName("display");
		mv.addObject("result",result);

		
		return mv;
	}

}
