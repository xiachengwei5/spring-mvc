package com.xia.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.xia.model.UserInfo;
import com.xia.services.UserInfoService;

/**
 * 类描述：人员基本信息 
 * 创建人：XiaChengwei 
 * 创建时间：2017年7月27日 下午4:56:17
 * @version 1.0
 */
@Controller
@RequestMapping(value = "/userInfo")
public class UserInfoController {
	@Autowired
	UserInfoService service;
	
	@RequestMapping(value = "/selectAllUsers", method = RequestMethod.GET)
	public String selectAllUsers(HttpServletRequest request, HttpServletResponse response) {
		List<UserInfo> userList = service.selectAllUsers();
		request.setAttribute("userList", userList);
		return "userList.jsp";
	}
	
	@RequestMapping(value = "selectById", method = RequestMethod.GET)
	public String selectById(HttpServletRequest request, HttpServletResponse response, @RequestParam(value = "id") Integer id, @RequestParam(value = "type") String type) {
		UserInfo user = service.selectByPrimaryKey(id);
		request.setAttribute("user", user);
		if("update".equals(type)) {
			return "userUpdate.jsp";
		} else {
			return "userView.jsp";
		}
	}
	
	@RequestMapping(value = "deleteById", method = RequestMethod.GET)
	public String deleteById(HttpServletRequest request, HttpServletResponse response, @RequestParam(value = "id") Integer id) {
		int count = 0;
		
		try {
			count = service.deleteByPrimaryKey(id);
			if(count <=0 ) {
				return "error.jsp";
			} else {
				request.getRequestDispatcher("selectAllUsers").forward(request, response);
				return "userList.jsp";
			}
			
		} catch (Exception e) {
			e.getMessage();
			e.printStackTrace();
			return "error.jsp";
		}
	}
	
	
	@RequestMapping(value = "add", method = RequestMethod.POST)
	public String add(HttpServletRequest request, HttpServletResponse response, UserInfo user) {
		int count = 0;
		
		try {
			count = service.insertSelective(user);
			if(count <=0 ) {
				return "error.jsp";
			} else {
				//POST请求的方法不能直接转发到GET请求的方法，需要重定向
				response.sendRedirect("selectAllUsers");
				return "userList.jsp";
			}
		} catch (Exception e) {
			e.getMessage();
			e.printStackTrace();
			return "error.jsp";
		}
	}
	
	@RequestMapping(value = "update", method = RequestMethod.POST)
	public String update(HttpServletRequest request, HttpServletResponse response, UserInfo user) {
		int count = 0;
		
		try {
			count = service.updateByPrimaryKeySelective(user);
			if(count <=0 ) {
				return "error.jsp";
			} else {
				//POST请求的方法不能直接转发到GET请求的方法，需要重定向
				response.sendRedirect("selectAllUsers");
				return "userList.jsp";
			}
		} catch (Exception e) {
			e.getMessage();
			e.printStackTrace();
			return "error.jsp";
		}
	}
	
	
	
}
