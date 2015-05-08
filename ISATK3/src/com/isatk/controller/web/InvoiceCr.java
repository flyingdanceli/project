package com.isatk.controller.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.isatk.ge.model.bean.PageBean;
import com.isatk.model.dto.BankName;
import com.isatk.model.dto.FaInvoice;
import com.isatk.model.dto.SysPoint;
import com.isatk.service.base.BankNameService;
import com.isatk.service.base.FaInvoiceService;
import com.isatk.service.base.SysPointService;

@Controller
@RequestMapping("/invoice")
public class InvoiceCr {
	@Autowired
	private FaInvoiceService faInvoiceService;
	@Autowired
	private SysPointService sysPointService;
	@Autowired
	private BankNameService bankNameService;
	@RequestMapping("/mine.html")
	public ModelAndView mine(HttpServletRequest request,HttpServletResponse response,PageBean<FaInvoice, FaInvoice> page,FaInvoice faInvoice){
		if(page==null){
			page = new PageBean<FaInvoice,FaInvoice>();
		}
		ModelAndView mv=new ModelAndView("web/invoice/mine");
		page.setParameterEntity(faInvoice);
		page.setHasEnable(1);
		page = faInvoiceService.findListData(page);
		mv.addObject("page", page);
		return mv;
	}
	@RequestMapping("/add.html")
	public ModelAndView add(HttpServletRequest request,HttpServletResponse response){
		ModelAndView mv=new ModelAndView("web/invoice/add");
		List<SysPoint> fa = sysPointService.findList(1, 0);
		List<SysPoint> so = sysPointService.findList(0, 1);
		List<BankName> bankNames=bankNameService.findList(null);
		
		mv.addObject("fa", fa);
		mv.addObject("so", so);
		mv.addObject("bankNames", bankNames);
		return mv;
	}
}
