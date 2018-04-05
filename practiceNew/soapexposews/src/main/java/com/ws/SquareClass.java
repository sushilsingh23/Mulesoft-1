package com.ws;

import javax.jws.WebService;

@WebService
public class SquareClass {
	public Integer square(Integer num){
		return num*num;
	}
}
