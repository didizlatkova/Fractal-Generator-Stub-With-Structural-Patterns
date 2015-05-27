package server.logic.concrete;

import server.logic.abstracts.ComplexLogger;
import server.logic.abstracts.FractalGenerator;
import server.parameters.abstracts.Configuration;

// Facade
public class RealFractalGenerator implements FractalGenerator {

	private ComplexLogger logger;
	private MandelbrotChecker checker;
	private Painter painter;

	public RealFractalGenerator(FractalLogger logger) {
		this.logger = logger;
		this.checker = new MandelbrotChecker(logger);
		this.painter = new Painter(logger);		
	}

	public boolean canConnect(String host, int port) {
		// check some things
		return true;
	}

	public void connect(String host, int port) {
		// do some connection things
	}

	@Override
	public void generateFractal(Configuration configurations) {
		logger.logMessage("using configurations: " + configurations.asString());
		checker.checkSomeThings(configurations);
		int[][] coordinates = checker.getFractalImageCoordinates();
		painter.paintImage(coordinates);
	}

}
