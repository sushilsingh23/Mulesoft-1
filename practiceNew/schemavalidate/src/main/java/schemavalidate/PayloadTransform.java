package schemavalidate;

import java.util.HashMap;

import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractTransformer;

public class PayloadTransform extends AbstractTransformer {

	@Override
	protected Object doTransform(Object src, String enc)
			throws TransformerException {
		
		HashMap map=(HashMap)src;
		String name=(String)map.get("name");
		return null;
	}

}
