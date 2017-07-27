package com.xia.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xia.mapper.UserInfoMapper;
import com.xia.model.UserInfo;
import com.xia.services.UserInfoService;

@Service
public class UserInfoServiceImpl implements UserInfoService {
	@Autowired
	UserInfoMapper mapper;
	
	/**
	 * 查询所有的人员信息
	 */
	@Override
	public List<UserInfo> selectAllUsers() {
		return mapper.selectAllUsers();
	}
	
	/**
	 * 根据主键删除人员信息
	 */
	@Override
	public int deleteByPrimaryKey(Integer id) {
		int count = mapper.deleteByPrimaryKey(id);
		return count;
	}
	
	/**
	 * 添加人员信息
	 */
	@Override
	public int insert(UserInfo record) {
		int count = mapper.insert(record);
		return count;
	}
	
	/**
	 * 选择性的添加人员中的信息
	 */
	@Override
	public int insertSelective(UserInfo record) {
		int count = mapper.insertSelective(record);
		return count;
	}
	
	/**
	 * 根据主键查询人员信息
	 */
	@Override
	public UserInfo selectByPrimaryKey(Integer id) {
		UserInfo user = mapper.selectByPrimaryKey(id);
		return user;
	}

	/**
	 * 根据主键选择性的更新人员信息
	 */
	@Override
	public int updateByPrimaryKeySelective(UserInfo record) {
		int count = mapper.updateByPrimaryKeySelective(record);
		return count;
	}
	
	/**
	 * 更新人员的所有信息
	 */
	@Override
	public int updateByPrimaryKey(UserInfo record) {
		int count = mapper.updateByPrimaryKey(record);
		return count;
	}
}
