package com.ltts.movieapp.bo;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.ltts.movieapp.model.Customer;

@Repository
@EnableJpaRepositories
public interface CustomerBo extends JpaRepository<Customer,String>{

	

	Customer findByEmailAndMobile(String email, String mobile);

	public List<Customer> findAll();
	
	public <S extends Customer>Customer save(Customer c);
}
