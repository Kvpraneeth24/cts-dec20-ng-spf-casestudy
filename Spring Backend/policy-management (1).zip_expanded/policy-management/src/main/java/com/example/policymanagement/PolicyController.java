package com.example.policymanagement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/policy")
public class PolicyController {

	@Autowired
	private PolicyRepository service;
		
	@RequestMapping(value="register" , method=RequestMethod.POST,
	consumes = MediaType.APPLICATION_JSON_VALUE,  produces = MediaType.APPLICATION_JSON_VALUE)
	public String register(@RequestBody final Policy register){
		service.save(register);
		return "Hi"+ register.getUsername()+ "your Registration process successfully completed";
	}
	
	
	@GetMapping("/all")
	public List<Policy> getAll(){
		return service.findAll();
	}
	
	/*@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,  produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Policy> persist(@RequestBody Policy register){
		service.save(register);
		return service.findAll();
	}*/
	
	
	
	
	
	
}