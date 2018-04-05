package jmsproj;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import static  org.junit.Assert.*;
import org.junit.Test;
import org.mule.api.MuleException;
import org.mule.api.MuleMessage;
import org.mule.api.client.MuleClient;
import org.mule.tck.junit4.FunctionalTestCase;

public class JmsOutboundTwowayTest extends FunctionalTestCase {
	
	
	@Test
	public void testSplitter() throws Exception{
		MuleClient muleClient=muleContext.getClient();
		
		
		MuleMessage replyMessage=muleClient.send("vm://vmq", "TestNew",null);
		String reply= (String) replyMessage.getPayload(); 
		assertTrue(reply.equals("TestNewResponse"));
		
	}

	@Override
	protected String getConfigResources() {
		return "src/main/app/jmsproj.xml";
	}
}
