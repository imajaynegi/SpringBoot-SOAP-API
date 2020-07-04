package com.customer.spring.soap.api.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.customer.spring.soap.api.main.GetCustomerRequest;
import com.customer.spring.soap.api.main.GetCustomerResponse;
import com.customer.spring.soap.api.service.CustomerService;

@Endpoint
public class CustomerEndpoint {

	private static final String NAMESPACE = "http://www.customer.com/spring/soap/api/getcustomer";

	@Autowired
	private CustomerService service;

	@PayloadRoot(namespace = NAMESPACE, localPart = "CustomerRequest")
	@ResponsePayload
	public GetCustomerResponse getLoanStatus(@RequestPayload GetCustomerRequest request) {
		return service.getcustomer(request);
	}

}

