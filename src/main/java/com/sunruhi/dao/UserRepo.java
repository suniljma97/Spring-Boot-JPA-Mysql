package com.sunruhi.dao;

import org.springframework.data.repository.CrudRepository;

import com.sunruhi.entities.User;

public interface UserRepo extends CrudRepository<User ,Integer>  {
	

}
