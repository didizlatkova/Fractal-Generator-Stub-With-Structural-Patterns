package server.logic.concrete;

import server.logic.abstracts.FractalGenerator;
import server.parameters.abstracts.Configuration;

// Remote Proxy
public class FractalGeneratorProxy implements FractalGenerator {

	private RealFractalGenerator realFractalGenerator;

	private FractalLogger logger;
	private String host;
	private int port;

	public FractalGeneratorProxy(String host, int port, FractalLogger logger) {
		this.host = host;
		this.port = port;
		this.logger = logger;
	}

	@Override
	public void generateFractal(Configuration configurations) {
		realFractalGenerator = new RealFractalGenerator(this.logger);
		
		if (realFractalGenerator.canConnect(this.host, this.port)) {
			realFractalGenerator.connect(this.host, this.port);
			realFractalGenerator.generateFractal(configurations);
		}
	}

}
