package jmsproj;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import static  org.junit.Assert.*;

import org.junit.Test;
import org.mule.api.MuleContext;
import org.mule.api.MuleException;
import org.mule.api.MuleMessage;
import org.mule.api.client.MuleClient;
import org.mule.config.spring.SpringXmlConfigurationBuilder;
import org.mule.context.DefaultMuleContextFactory;
import org.mule.tck.junit4.FunctionalTestCase;

public class JmsOutboundTwowayTest extends FunctionalTestCase {
	
	
	@Test
	public void testSplitter() throws Exception{
		/*MuleClient muleClient=muleContext.getClient();
		*/DefaultMuleContextFactory mulefactory=new DefaultMuleContextFactory();
		
		SpringXmlConfigurationBuilder configBuilder=new SpringXmlConfigurationBuilder("jmssample.xml");
		MuleContext mulecontext=
		mulefactory.createMuleContext(configBuilder);

		MuleMessage replyMessage=
		mulecontext.getClient().send("vm://vmq", "TestNew",null);
		/*MuleMessage replyMessage=muleClient.send("vm://vmq", "TestNew",null);
		*/
		String reply= (String) replyMessage.getPayload(); 
		assertTrue(reply.equals("TestNewResponse"));
		
	}

	@Override
	protected String getConfigResources() {
		return "src/main/app/jmssample.xml";
	}
}
