package server.logic.abstracts;

public interface ComplexLogger {
	
	void logMessage(String message);
	
	void logError(String error);
	
	void logAlways(String message);
	
}
