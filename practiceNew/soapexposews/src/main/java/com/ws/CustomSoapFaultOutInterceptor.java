package com.ws;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.binding.soap.interceptor.AbstractSoapInterceptor;
import org.apache.cxf.binding.soap.interceptor.Soap11FaultOutInterceptor;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.phase.Phase;
import org.mule.api.MuleEventContext;
import org.mule.api.lifecycle.Callable;



public class CustomSoapFaultOutInterceptor extends AbstractSoapInterceptor implements Callable {
private final static Log logger =LogFactory.getFactory().getLog(SquareClass.class);
private static MuleEventContext context;
public CustomSoapFaultOutInterceptor() {
super(Phase.POST_MARSHAL);
getAfter().add(Soap11FaultOutInterceptor.class.getName());
}


@Override
public void handleMessage(SoapMessage message) throws Fault {
	System.out.println("I am in fault interceptor");
	System.out.println("message is "+message.getEnvelopeNs());
	try {
		System.out.println("event context is"+context.getMessage().getPayloadAsString());
	} catch (Exception e) {
		System.out.println("callable not called");
	}
Fault fault = (Fault) message.getContent(Exception.class);
logger.error(fault.getMessage(), fault);
//delete the Mule Exception to have the one throw by the component in the SoapMessage
Throwable t = getOriginalCause(fault.getCause());
System.out.println("fault code is "+fault.getCode());
 if (fault.getCode() != null && fault.getCode().equals("UNMARSHAL_ERROR"))//Handles UNMARSHAL_ERROR
 {
 fault.setMessage(fault.getCode()+": Please Enter a number");//Here set custom message for UNMARSHAL_ERROR
 }
 else
 {
 fault.setMessage(t.getMessage());//Here set custom message for other normal errors
 System.out.println("custom msg is "+t.getMessage()+" "+t.getCause());
 }

}
private Throwable getOriginalCause(Throwable t) {
if (t.getCause() == null || t.getCause().equals(t))
return t;
else
return getOriginalCause(t.getCause());
}


@Override
public Object onCall(MuleEventContext eventContext) throws Exception {
	// TODO Auto-generated method stub
	this.context=eventContext;
	return null;
}

}
