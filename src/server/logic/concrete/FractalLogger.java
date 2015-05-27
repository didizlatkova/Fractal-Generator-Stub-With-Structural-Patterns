package server.logic.concrete;

import server.logic.abstracts.*;

// Singleton
public class FractalLogger implements ComplexLogger {

	public static FractalLogger instance;

	private boolean shouldLog;

	public static synchronized FractalLogger getInstance(boolean shouldLog) {
		if (instance == null) {
			instance = new FractalLogger();
		}
		instance.shouldLog = shouldLog;

		return instance;
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
