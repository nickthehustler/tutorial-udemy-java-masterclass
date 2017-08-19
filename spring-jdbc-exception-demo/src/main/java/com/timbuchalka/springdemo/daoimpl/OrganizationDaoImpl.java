package com.timbuchalka.springdemo.daoimpl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.timbuchalka.springdemo.dao.OrganizationDao;
import com.timbuchalka.springdemo.domain.Organization;

@Repository("orgDao")
public class OrganizationDaoImpl implements OrganizationDao {
	 
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void setDataSource(DataSource datasource) {
		jdbcTemplate = new JdbcTemplate(datasource);
	}
	
	public boolean create(Organization org) {
		return false;
	}
	
	public Organization getOrganization(Integer id) {
		return null; 
	}
	
	public List<Organization> getAllOrganizations() {
		String sqlQuery = "SELEC * FROM organization";
		List<Organization> orgList = jdbcTemplate.query(sqlQuery, new OrganizationRowMapper());
		return orgList;
	}
	
	public boolean delete(Organization org) {
		return false;
	}
	
	public boolean update(Organization org) {
		return false;
	}
	
	public void cleanup() {
		
	}

}
