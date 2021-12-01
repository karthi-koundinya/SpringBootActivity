package com.ltts.movieapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ltts.movieapp.model.Customer;

@Service
public interface CustomerService {

	void save(Customer email);
	
	public Customer findByEmailAndMobile(String email, String mobile);

	public List<Customer> findAll();
	
}
