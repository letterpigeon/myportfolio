package culnab.myportfolio;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class PortfolioLambdaFunction implements RequestHandler<NewPositionRequest, String>{

	public String handleRequest(String arg0, Context arg1) {
		return "response for " + arg0;
	}

	public String handleRequest(NewPositionRequest newPosition, Context arg1) {
		
		if("VTI".equals(newPosition.symbol))
		{
			throw new RuntimeException("VTI not supported");
		}
		
		return newPosition.symbol + " added " + newPosition.qty;
	}

}
