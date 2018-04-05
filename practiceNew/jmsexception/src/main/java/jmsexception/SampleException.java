package jmsexception;

public class SampleException {
	public void doSomething(String s){
		if(true){
			throw new RuntimeException("just testin");
		}
	}
}
