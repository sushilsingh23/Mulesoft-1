package dd;

import org.mule.api.MuleContext;
import org.mule.api.config.ConfigurationException;
import org.mule.api.lifecycle.InitialisationException;
import org.mule.config.spring.SpringXmlConfigurationBuilder;
import org.mule.context.DefaultMuleContextFactory;

public class RunMule {
	public static void main(String[] args) throws Exception {
		DefaultMuleContextFactory mulefactory=new DefaultMuleContextFactory();
		try {
			SpringXmlConfigurationBuilder configBuilder=new SpringXmlConfigurationBuilder("dd.xml");
			MuleContext mulecontext=
			mulefactory.createMuleContext(configBuilder);
			mulecontext.start();

		} catch (ConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}