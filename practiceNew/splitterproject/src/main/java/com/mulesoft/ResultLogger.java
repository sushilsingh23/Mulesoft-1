package com.mulesoft;

import java.util.List;

import org.mule.api.annotations.param.InboundHeaders;

public class ResultLogger {
	
	public String log(String result){
		System.out.println("Inside OrderProcessorResultLogger.log(String) "+result);
		//nSystem.out.println(resultList);
		return result;
		
	}
	
	public List log(List results){
		System.out.println("Inside OrderProcessorResultLogger.log(List) "+results);
		System.out.println(results);
		return results;
		
	}

		

}
