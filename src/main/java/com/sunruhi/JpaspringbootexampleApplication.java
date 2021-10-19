package com.sunruhi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.sunruhi.dao.UserRepo;
import com.sunruhi.entities.User;

@SpringBootApplication
public class JpaspringbootexampleApplication {

	public static void main(String[] args) {
		
		 ApplicationContext context =SpringApplication.run(JpaspringbootexampleApplication.class, args);
	     UserRepo userrepository= context.getBean(UserRepo.class);
	     User user=new User();
	     user.setName(" Sunil Dhakad");
	     user.setCity("Mandsaur");
	     user.setStatus("I am Java Developer");
	     
	      User user1=userrepository.save(user);
	      System.out.println(user1);
	     
	}

}
