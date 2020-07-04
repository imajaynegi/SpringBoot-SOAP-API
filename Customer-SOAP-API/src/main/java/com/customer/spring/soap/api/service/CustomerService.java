package com.customer.spring.soap.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.spring.soap.api.main.GetCustomerRequest;
import com.customer.spring.soap.api.main.GetCustomerResponse;
import com.customer.spring.soap.api.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	CustomerRepository customerRepository;

	public GetCustomerResponse getcustomer(GetCustomerRequest request) {
		GetCustomerResponse response = new GetCustomerResponse();
		response.setCustomer(customerRepository.getByCustomerId(request.getCustomerId()));
		return response;	
	}

}
