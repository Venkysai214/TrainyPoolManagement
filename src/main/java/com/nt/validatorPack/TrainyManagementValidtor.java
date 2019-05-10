package com.nt.validatorPack;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.nt.command.TrainerManagementCommand;

@Component
public class TrainyManagementValidtor implements Validator {

	public TrainyManagementValidtor() {
		System.out.println("MyStoreValidtor-0 param constructor");
	}
	
	public boolean supports(Class<?> clazz) {
		  return clazz.isAssignableFrom(TrainerManagementCommand.class);
	}

	public void validate(Object cmd, Errors errors) {
		TrainerManagementCommand cmd1=null;
		//type casting
		cmd1=(TrainerManagementCommand)cmd;
		System.out.println(cmd1);
		if(cmd1.getFirstName().equals("") || cmd1.getFirstName().length()==0 )
			errors.rejectValue("firstName","NotEmpty.strCmd.firstName");
		if(cmd1.getLastName().equals("") || cmd1.getLastName().length()==0)
			errors.rejectValue("lastName","NotEmpty.strCmd.lastName");
		if(cmd1.getAge()==0)
			errors.rejectValue("age","NotEmpty.strCmd.age");
		if(cmd1.getUserId().equals("") || cmd1.getUserId().length()==0)
			errors.rejectValue("userId","NotEmpty.strCmd.userId");
		if(cmd1.getPassword().equals("") || cmd1.getPassword().length()==0)
			errors.rejectValue("password","NotEmpty.strCmd.password");
	}

}
