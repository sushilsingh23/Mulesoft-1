package com.mulesoft;

import org.mule.api.annotations.expressions.Mule;
import org.mule.api.annotations.param.Payload;

	public class OrderProcessor {
		
		public String processOrder(@Payload Order order,
				@Mule(value="message.id",optional=true)String id,
				@Mule(value="message.correlationId",optional=true)
		String correlationId){
			
			System.out.println("OrderProcessor.processOrder(). Message id ===="+id +"Correlation id : "+correlationId);
			return order.getType()+"";
		}	
		
		
	}
