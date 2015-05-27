package client.concrete;

import client.abstracts.SimpleLogger;

public class ConcreteSimpleLogger implements SimpleLogger {

	@Override
	public void log(String message) {
		System.out.println(message);
	}

}
