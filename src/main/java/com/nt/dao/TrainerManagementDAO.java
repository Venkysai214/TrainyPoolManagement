package com.nt.dao;

import com.nt.bo.TrinerManagementBO;

public interface TrainerManagementDAO {

	public int authenticate(TrinerManagementBO bo);

	public int insertRegister(TrinerManagementBO bo);

}
