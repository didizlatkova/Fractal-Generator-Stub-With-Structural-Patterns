package client.concrete;

import client.abstracts.SimpleLogger;
import server.logic.abstracts.ComplexLogger;

// Adapter
public class SimpleLoggerAdapter implements ComplexLogger {

	private SimpleLogger logger;	
	private boolean shouldLog;
	
	public SimpleLoggerAdapter(SimpleLogger logger, boolean shouldLog){
		this.logger = logger;
		this.shouldLog = shouldLog;
	}
	
	@Override
	public void logMessage(String message) {
		if (shouldLog) {
			System.out.print("Message: ");
			logger.log(message);
		}
	}

	@Override
	public void logError(String error) {
		if (shouldLog) {
			System.out.print("Error: ");
			logger.log(error);
		}		
	}

	@Override
	public void logAlways(String message) {
		logger.log(message);
	}

}
