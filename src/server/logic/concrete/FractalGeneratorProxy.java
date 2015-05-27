package server.logic.concrete;

import server.logic.abstracts.FractalGenerator;

// Remote Proxy
public class FractalGeneratorProxy implements FractalGenerator {

	private RealFractalGenerator realFractalGenerator;

	private String host;
	private int port;

	public FractalGeneratorProxy(String host, int port) {
		this.host = host;
		this.port = port;
	}

	@Override
	public void generateFractal(String configurations) {
		realFractalGenerator = new RealFractalGenerator();
		
		if (realFractalGenerator.canConnect(this.host, this.port)) {
			realFractalGenerator.connect(this.host, this.port);
			realFractalGenerator.generateFractal(configurations);
		}
	}

}
