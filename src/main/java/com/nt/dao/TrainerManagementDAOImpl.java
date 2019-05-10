package com.nt.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nt.bo.TrinerManagementBO;

@Repository("strDao")
public class TrainerManagementDAOImpl implements TrainerManagementDAO {
	private static final String AUTH_QUERY="SELECT COUNT(*) FROM TRAINYMANAGEMENT WHERE USERID=? AND PASSWORD=?";
	private  static final String  INSERT_QUERY="INSERT INTO TRAINYMANAGEMENT(FIRSTNAME,LASTNAME,AGE,GENDER,CONTACTNO,USERID,PASSWORD) VALUES(?,?,?,?,?,?,?)";
	@Autowired
	 private JdbcTemplate jt;

	public int authenticate(TrinerManagementBO bo) {
     int count=0;
     count=jt.queryForObject(AUTH_QUERY,Integer.class,bo.getUserId(),bo.getPassword());
		return count;
	}

	public int insertRegister(TrinerManagementBO bo) {
		  int count=0;
		    count=jt.update(INSERT_QUERY,bo.getFirstName(),bo.getLastName(),
		   bo.getAge(),bo.getGender(),bo.getContactNo(),bo.getUserId(),bo.getPassword());
			return count;
	}

}
