package com.ltts.movieapp.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ltts.movieapp.bo.CustomerBo;
import com.ltts.movieapp.model.Customer;

@Service
public class CustomerServiceImp implements CustomerService{

	@Autowired
    private CustomerBo cs;
	
	@Override
	public List<Customer> findAll() {
		
		return cs.findAll();
	}

	@Override
	public void save(Customer cmr) {
			// TODO Auto-generated method stub
			
		}


		@Override
		public Customer findByEmailAndMobile(String email, String mobile) {
			return cs.findByEmailAndMobile(email, mobile);
		}
}
