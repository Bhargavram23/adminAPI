package com.ramit.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ramit.clients.Customer_FiegnClient;
import com.ramit.clients.OrderTransferDTO;
import com.ramit.clients.Order_FeignClient;

@RestController
@CrossOrigin("http://localhost:4200")
public class AdminController {
	
	@Autowired
	Order_FeignClient orderClient;
	@Autowired
	Customer_FiegnClient customerClient;
	
	@GetMapping("admin/dashboard")
	public OrderTransferDTO getDashboardDetails() {
		OrderTransferDTO orderTransferDTO ;
		orderTransferDTO = orderClient.transferToAdmin();
		orderTransferDTO.setCustomerCount(customerClient.customerCount());
		return orderTransferDTO;
		
	}
	
}
