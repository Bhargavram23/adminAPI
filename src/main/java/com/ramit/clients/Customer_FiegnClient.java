package com.ramit.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "my-client", url = "http://localhost:7070")
public interface Customer_FiegnClient {
	
	@GetMapping("/admin/customer-count")
	public int customerCount(); 
}
