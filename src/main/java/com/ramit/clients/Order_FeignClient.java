package com.ramit.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "order-client", url = "http://localhost:9090")
public interface Order_FeignClient {
	
	@GetMapping("/admin/ordersInfo")
	public OrderTransferDTO transferToAdmin(); 
}
