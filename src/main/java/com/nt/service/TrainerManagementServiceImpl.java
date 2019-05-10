package com.nt.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.nt.bo.TrinerManagementBO;
import com.nt.dao.TrainerManagementDAO;
import com.nt.dto.TrainerManagementDTO;
@Service("strService")
public class TrainerManagementServiceImpl implements TrainerManagementService{
	
	@Autowired
	private TrainerManagementDAO dao;
	@Transactional(propagation=Propagation.REQUIRED,readOnly=true)
	public String validate(TrainerManagementDTO dto) {
		int count=0;
		TrinerManagementBO bo=null;
		//convert dto to bo
		bo=new TrinerManagementBO();
		BeanUtils.copyProperties(dto, bo);
		//use dao
		count=dao.authenticate(bo);
		if(count==0)
			return "Invalid Username and password";
		else
			return "Welcome to TrainerManagement Application";
	}
	
//	@Transactional(propagation=Propagation.REQUIRED,readOnly=true)
	public String register(TrainerManagementDTO dto) {
		int count=0;
		TrinerManagementBO bo=null;
		//convert dto to bo
		bo=new TrinerManagementBO();
		BeanUtils.copyProperties(dto, bo);
		//use dao
		count=dao.insertRegister(bo);
		if(count==0)
			return "Registration Failed";
		else
			return "Registration Sucessfully";	}
	
	}
	
