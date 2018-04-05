package com.training;

import javax.management.RuntimeErrorException;

public class Sample {
	public void m1(String s){
		if(true){
			throw new RuntimeException("just for testing");
		}
	}
}
