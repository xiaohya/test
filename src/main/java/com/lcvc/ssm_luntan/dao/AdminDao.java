package com.lcvc.ssm_luntan.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.lcvc.ssm_luntan.model.Admin;


/*
 * 该接口用来与mybatis的对应映射文件对接
 */
public interface AdminDao {
	/*
	 * 处理数据库的登录方法
	 * @return null表示登录失败
	 */
	Admin login(@Param(value="username")String username,@Param(value="password")String password);
	
	

}

