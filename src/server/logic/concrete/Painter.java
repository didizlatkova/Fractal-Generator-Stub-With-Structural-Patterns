package server.logic.concrete;

public class Painter {

	private FractalLogger logger;

	public Painter(FractalLogger logger) {
		this.logger = logger;
	}
	
	public void paintImage(int[][] coordinates){
		logger.logMessage("Painting the fractal image...");
		logger.logAlways("Painting done. Image is so beautiful!");
	}

}
