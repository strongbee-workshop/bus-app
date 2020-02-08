package com.workshop.sb.testworkshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@SpringBootApplication
public class TestWorkshopApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestWorkshopApplication.class, args);
	}

//	@Bean
//	public DataSource dataSource(){
////		System.out.println(driverClass+" "+ url+" "+username+" "+password);
//		DriverManagerDataSource source = new DriverManagerDataSource();
//		source.setDriverClassName("org.postgresql.Driver");
//		source.setUrl("jdbc:postgres://kuflvzrbujjnat:d125224cbbd0391f7ecae0cba0e43288275a4a99d320447d998a51608456b4d0@ec2-184-72-236-57.compute-1.amazonaws.com:5432/df63444k1md5nf");
//		source.setUsername("kuflvzrbujjnat");
//		source.setPassword("d125224cbbd0391f7ecae0cba0e43288275a4a99d320447d998a51608456b4d0");
//		return source;
//	}
//
//	@Bean
//	public NamedParameterJdbcTemplate namedParameterJdbcTemplate(){
//		NamedParameterJdbcTemplate namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(this.dataSource());
//		return namedParameterJdbcTemplate;
//	}

}
