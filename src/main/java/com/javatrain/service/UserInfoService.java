package com.javatrain.service;

import com.javatrain.dao.UserInfoMapper;
import com.javatrain.model.UserInfo;

public class UserInfoService {
	private UserInfoMapper userInfoMapper;
	
	public UserInfo getUserInfo(int id){
		return userInfoMapper.getUserInfo(id);
	}

	public void setUserInfoMapper(UserInfoMapper userInfoMapper) {
		this.userInfoMapper = userInfoMapper;
	}
}
