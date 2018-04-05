package client;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mule.api.MuleMessage;
import org.mule.api.client.MuleClient;
import org.mule.tck.junit4.FunctionalTestCase;

public class VmTest extends FunctionalTestCase{

	@Test
	public void testCreditAgencySoapClient() throws Exception{
		MuleClient muleClient=muleContext.getClient();
		
		
		Integer payload=new Integer(10);
		MuleMessage reply=
				muleClient.send("vm://soapQ", payload,null);
		Object payloadRes=reply.getPayload();
		System.out.println(payloadRes);
		assertTrue(payloadRes instanceof Integer);
		
	}

	@Override
	protected String getConfigResources() {
		return "src/main/app/client.xml";
	}
}
