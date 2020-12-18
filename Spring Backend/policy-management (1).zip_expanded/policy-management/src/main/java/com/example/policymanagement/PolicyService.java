package com.example.policymanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PolicyService {
	
	@Autowired
	private PolicyRepository dao;
	
	//public Policy save(Policy policy) {
		//return dao.store(policy);
	//}
	
}
