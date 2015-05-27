package server.logic.concrete;

import server.logic.abstracts.ComplexLogger;

public class Painter {

	private ComplexLogger logger;

	public Painter(ComplexLogger logger) {
		this.logger = logger;
	}
	
	public void paintImage(int[][] coordinates){
		logger.logMessage("Painting the fractal image...");
		logger.logAlways("Painting done. Image is so beautiful!");
	}

}
