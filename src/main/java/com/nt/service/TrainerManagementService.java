package com.nt.service;

import com.nt.dto.TrainerManagementDTO;

public interface TrainerManagementService {

	public String validate(TrainerManagementDTO dto);

	public String register(TrainerManagementDTO dto);

}
