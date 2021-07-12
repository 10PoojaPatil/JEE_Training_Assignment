package com.example.demo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Car;

import java.util.*;
@Repository
public class CarRepository {

	
	@Autowired
	private JdbcTemplate template;
	
	public int addCustomer(Car entity) {
		
		SimpleJdbcInsert inserter = new SimpleJdbcInsert(template);
		
		inserter.withTableName("car").usingColumns("dist","brand","model","year");
		
		BeanPropertySqlParameterSource sql = new BeanPropertySqlParameterSource(entity);
		
		return inserter.execute(sql);
	}
	
	public List<Car> getAllCustomers(){
		
		String sql ="select * from customer";
		
		List<Car> custList = 
				template.query(sql,BeanPropertyRowMapper.newInstance(Car.class));
		
		return custList;
		
		
		
	}

	public List<Car> getAllCars() {
		// TODO Auto-generated method stub
		return null;
	}
}
