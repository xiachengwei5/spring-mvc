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

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

/**
 * 类描述：人员基本信息 
 * 创建人：XiaChengwei 
 * 创建时间：2017年7月27日 下午4:56:17
 * @version 1.0
 */
@Controller
@RequestMapping(value = "/userInfo")
@Api(value = "UserInfo", description = "人员基本信息 ")
public class UserInfoController {
	@Autowired
	UserInfoService service;
	
	@RequestMapping(value = "/selectAllUsers", method = RequestMethod.GET)
	@ApiOperation(value = "查询所有的人员信息", notes = "查询所有的人员信息")
	public String selectAllUsers(HttpServletRequest request, HttpServletResponse response) {
		List<UserInfo> userList = service.selectAllUsers();
		request.setAttribute("userList", userList);
		return "userList.jsp";
	}
	
	@RequestMapping(value = "selectById", method = RequestMethod.GET)
	@ApiOperation(value = "根据用户id查询用户详细信息", notes = "根据用户id查询用户详细信息")
	@ApiImplicitParams({
		@ApiImplicitParam(name = "type", value = "类型（修改：update；默认为查看）", required = false, paramType = "query"),
		@ApiImplicitParam(name = "id", value = "用户id", required = true, paramType = "query")
		
	})
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
	@ApiOperation(value = "根据用户id删除用户信息", notes = "根据用户id删除用户信息")
	@ApiImplicitParams({
		@ApiImplicitParam(name = "id", value = "用户id", required = true, paramType = "query")
	})
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
	@ApiOperation(value = "添加用户信息", notes = "添加用户信息")
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
	@ApiOperation(value = "根据用户id修改用户信息", notes = "根据用户id修改用户信息")
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
