package server.logic.concrete;

import server.logic.abstracts.ComplexLogger;
import server.parameters.abstracts.Configuration;

public class MandelbrotChecker {
	
	private ComplexLogger logger;
	
	public MandelbrotChecker(ComplexLogger logger){
		this.logger = logger;
	}

	public void checkSomeThings(Configuration configurations) {
		logger.logMessage("Starting the Mandelbrot algorithm checking...");
		logger.logError("Some failure during Mandelbrot checking, nothing lethal, so continue...");
		logger.logMessage("Everything is checked!");
	}
	
	public int[][] getFractalImageCoordinates(){
		logger.logMessage("Getting the fractal image coordinates...");
		
		return new int[200][200];
	}
}
