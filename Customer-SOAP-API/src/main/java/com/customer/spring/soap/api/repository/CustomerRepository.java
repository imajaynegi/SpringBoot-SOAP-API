package com.customer.spring.soap.api.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.customer.model.Customer;



public interface CustomerRepository extends MongoRepository<Customer, Integer> 
{
	public Customer getByCustomerId(int customerId);
}