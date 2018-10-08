package com.lcvc.ssm_luntan.test.dao;

import javax.annotation.Resource;

import com.lcvc.ssm_luntan.test.SpringJunitTest;
import org.junit.Test;

import com.lcvc.ssm_luntan.dao.AdminDao;
import com.lcvc.ssm_luntan.test.SpringJunitTest;

public class AdminDaoTest extends SpringJunitTest {
	
	@Resource
	private AdminDao adminDao;
	
	@Test
	public void loginTest(){
		System.out.println(adminDao.login("user", "123456"));
	}
}
