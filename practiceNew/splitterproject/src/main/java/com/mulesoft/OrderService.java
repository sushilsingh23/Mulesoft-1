package com.mulesoft;

import java.util.ArrayList;
import java.util.List;

	public class OrderService {
	
		public List<Order> getOrders(String inout){
			List<Order> orders= new ArrayList<Order>();
			
			orders.add(new Order("1", "electronic"));
			orders.add(new Order("2", "sport"));
			orders.add(new Order("3", "kitchen"));
			
			return orders;
		}

	}

	