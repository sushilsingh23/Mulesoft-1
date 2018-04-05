package com.mulesoft;

import java.io.Serializable;
import java.util.List;

public class Order implements Serializable {
	
	private String orderId;
	private String type;
	
	@Override
	public String toString() {
		return "Order Id "+orderId+" type "+type;
	}
	
	
	
	public Order(String orderId, String type) {
		super();
		this.orderId = orderId;
		this.type = type;
	}

	private List<Object> items;

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Object> getItems() {
		return items;
	}

	public void setItems(List<Object> items) {
		this.items = items;
	}
	
	
	

}
