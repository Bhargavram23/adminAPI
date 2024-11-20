package com.ramit.clients;

import lombok.Data;

@Data
public class OrderTransferDTO {
	Integer totalSuccessfullOrders;
	Float totalOrdersValue;
	Integer totalOrderQty;
	Integer customerCount;
}
