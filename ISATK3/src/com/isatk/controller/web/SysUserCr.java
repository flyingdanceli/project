package com.isatk.controller.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.isatk.controller.base.BaseController;
import com.isatk.model.dao.BasOrganizeMapper;
import com.isatk.model.dao.SysUserMapper;
import com.isatk.model.dto.SysUser;
import com.isatk.model.dto.SysUserExample;

@Controller
@RequestMapping("/sysUser")
public class SysUserCr extends BaseController{
	@Autowired
	BasOrganizeMapper orgMapper;
	@Autowired
	SysUserMapper userMapper;
	@RequestMapping("/userIndex.html")
	public ModelAndView toIndex(HttpServletRequest request,HttpServletResponse response){
		List<SysUser> userList = userMapper.selectByExample(new SysUserExample());
		ModelAndView mv=new ModelAndView("web/sysuser/index");
		mv.addObject("userList", userList);
		return mv;
	}
	
	@RequestMapping("/addUser.html")
	public ModelAndView toAddUser(HttpServletRequest request,HttpServletResponse response,Long id){
		ModelAndView mv=new ModelAndView("web/sysuser/add");
		if(id != null){
			SysUser user = userMapper.selectByPrimaryKey(id);
			mv.addObject("user", user);
		}
		return mv;
	}
	
	@RequestMapping("/saveUser.mo")
	public ModelAndView saveUser(SysUser user){
		if(user.getId()!=null){
			userMapper.updateByPrimaryKeySelective(user);
		}else{
			userMapper.insert(user);
		}
		List<SysUser> userList = userMapper.selectByExample(new SysUserExample());
		ModelAndView mv=new ModelAndView("web/sysuser/index");
		mv.addObject("userList", userList);
		mv.addObject("res","操作成功");		
		return mv;
	}
	
	@RequestMapping("/delUser.mo")
	public ModelAndView deleteUser(Long id){
		userMapper.deleteByPrimaryKey(id);
		List<SysUser> userList = userMapper.selectByExample(new SysUserExample());
		ModelAndView mv=new ModelAndView("web/sysuser/index");
		mv.addObject("userList", userList);
		mv.addObject("res","操作成功");		
		return mv;
	}
}
