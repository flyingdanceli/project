package com.isatk.controller.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
@RequestMapping("/reconciliation")
public class ReconciliationCr {
	@RequestMapping("/index.html")
	public ModelAndView toIndex(HttpServletRequest request,HttpServletResponse response){
		ModelAndView mv=new ModelAndView("web/reconciliation/index");
		return mv;
	}
}
