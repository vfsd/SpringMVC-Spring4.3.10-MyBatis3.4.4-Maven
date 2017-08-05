package com.vfsd.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.vfsd.model.User;
import com.vfsd.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring.xml","classpath:spring-mybatis.xml"})
public class TestUserOperation{
	
	//private ApplicationContext ac;
	private UserService userService;
	
	public UserService getUserService() {
		return userService;
	}
	
	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}


	@Test
	public void test1(){
		//ac = new ClassPathXmlApplicationContext(new String[]{"spring.xml","spring-mybatis.xml"});
		//userService = (UserService) ac.getBean("userService");
		User u = userService.getUserById(1);
		System.out.println("user:"+u.getName());
	}

}
