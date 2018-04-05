package soapservice;

import java.util.Collection;
import java.util.HashMap;

import static  org.junit.Assert.*;

import org.junit.Test;
import org.mule.DefaultMuleMessage;
import org.mule.api.MuleException;
import org.mule.api.MuleMessage;
import org.mule.api.client.MuleClient;
import org.mule.tck.junit4.FunctionalTestCase;



public class SoapUnitTest extends FunctionalTestCase {
	
	
	@Test
	public void testCreditAgencySoapClient() throws Exception{
		MuleClient muleClient=muleContext.getClient();
		
		Integer arg1=new Integer(10);
		Integer arg2=new Integer(20);
	
		
		MuleMessage reply=
				muleClient.send("vm://soapClientVM",new Integer(10),null);
		Object payload=reply.getPayload();
		assertTrue(payload instanceof Object);
		
	}

	@Override
	protected String getConfigResources() {
		return "src/main/app/soapclient.xml";
	}

}
