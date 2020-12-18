package com.example.policymanagementsystem;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CustomerController {

	@Autowired
	private CustomerService service;
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE ,produces = MediaType.APPLICATION_JSON_VALUE)
	
	public Customer createCustomerAPI(@RequestBody Customer customer) {
		Customer createdCustomer = service.addCustomer(customer);
		return createdCustomer;
	}
	
	@GetMapping
	public List<Customer> getAllCustomerAPI(){
		return service.fetchCustomer();	
	}
	
	@GetMapping("{customerId}")
	public Customer getCustomerAPI (@PathVariable("customerId") int id){
		return service.fetchCustomer(id);
	}
	
	@PutMapping("{customerId}/{dob}")
	public Customer updateCustomerDobAPI(@PathVariable("customerId") int id,@PathVariable("dob") String stringDob) {
		return service.updateCustomer(id,LocalDate.parse(stringDob));
	}
	
	
}
