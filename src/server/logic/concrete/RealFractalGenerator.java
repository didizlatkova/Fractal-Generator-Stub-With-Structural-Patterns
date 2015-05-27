package server.logic.concrete;

import server.logic.abstracts.FractalGenerator;

public class RealFractalGenerator implements FractalGenerator {
	
	public boolean canConnect(String host, int port){
		// check some things
		return true;
	}
	
	public void connect(String host, int port){
		// do some connection things
	}

	@Override
	public void generateFractal(String configurations) {
		
	}

}
