package server.logic.concrete;

import server.logic.abstracts.*;

public class FractalLogger implements ComplexLogger {

	private boolean shouldLog;

	public FractalLogger(boolean shouldLog) {
		this.shouldLog = shouldLog;
	}

	@Override
	public void logMessage(String message) {
		if (this.shouldLog) {
			System.out.println("The message is: " + message);
		}
	}

	@Override
	public void logError(String error) {
		if (this.shouldLog) {
			System.out.println("The error is: " + error);
		}
	}

	@Override
	public void logAlways(String message) {
		System.out.println("Important message: " + message);
	}

}
