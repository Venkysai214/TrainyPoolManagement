package com.nt.controller;

import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nt.command.TrainerManagementCommand;
import com.nt.dto.TrainerManagementDTO;
import com.nt.service.TrainerManagementService;
import com.nt.validatorPack.TrainyManagementValidtor;

@Controller
public class MyStoreController {
	@Autowired
	private TrainerManagementService service;
	
	@Autowired
	private TrainyManagementValidtor validator;

	@GetMapping(value="/welcome.htm")
	public String showHomePage(@ModelAttribute("strCmd") TrainerManagementCommand cmd) {
		return "welcome_page";
	}
	@GetMapping(value="/login_page.htm")
	public String showLoginPage(@ModelAttribute("strCmd") TrainerManagementCommand cmd) {
		return "login_page";
	}
	@PostMapping(value="/welcome.htm")
	public  String  processForm(Map<String,Object> map,
			                                           @ModelAttribute("strCmd")TrainerManagementCommand cmd,BindingResult errors){
		TrainerManagementDTO dto=null;
		String result=null;
		
		//perform validations using Validator 
		
		//Convert command to dTO
		dto=new TrainerManagementDTO();
		BeanUtils.copyProperties(cmd,dto);
		//use service
		result=service.validate(dto);
		if(result.toString().equalsIgnoreCase("Welcome to TrainerManagement Application")){
		map.put("result", result);
		return "main_page";
		}
		else {
			map.put("result", result);
			return "welcome_page";
		}
	}
	@GetMapping(value="/signup_page.htm")
	public String showSignUpPage(@ModelAttribute("strCmd") TrainerManagementCommand cmd) {
		return "register_page";
	}
	@PostMapping(value="/signup_page.htm")
public String registerForm(Map<String,Object> map,
									@ModelAttribute("strCmd")TrainerManagementCommand cmd,BindingResult errors ) {
	TrainerManagementDTO dto=null;
	String registerResult=null;
	if(validator.supports(TrainerManagementCommand.class)){
		System.out.println(cmd);
		validator.validate(cmd, errors);
		if(errors.hasErrors()){
			return "register_page";
		}
	}
	else{
		return "register_page";
	}
	dto=new TrainerManagementDTO();
	BeanUtils.copyProperties(cmd,dto);
	//use service
	registerResult=service.register(dto);
	if(registerResult.toString().equalsIgnoreCase("Registration Sucessfully")){
		map.put("registerResult", registerResult);
		return "register_page";
		}
		else {
			map.put("registerResult", registerResult);
			return "register_page";
		}
	}
}
	

