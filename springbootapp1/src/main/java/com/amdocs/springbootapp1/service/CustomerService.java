package com.amdocs.springbootapp1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amdocs.springbootapp1.repo.CustomerRepo;

@Service
public class CustomerService {
	
	private CustomerRepo custrepo;
	
	@Autowired
	public CustomerService(CustomerRepo custrepo) {
		super();
		this.custrepo = custrepo;
	}
	

}
