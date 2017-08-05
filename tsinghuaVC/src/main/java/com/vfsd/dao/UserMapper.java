package com.vfsd.dao;

import com.vfsd.model.User;

public interface UserMapper {
	
	public User selectByPrimaryKey(int id);

}
