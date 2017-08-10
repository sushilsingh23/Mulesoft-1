package org.cap.demo;

import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractTransformer;

public class HelloWorld extends AbstractTransformer{

	@Override
	protected Object doTransform(Object src, String enc) throws TransformerException {
		
		return "HelloWorld";
	}

}
