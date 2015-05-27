package server.parameters.concrete;

import server.parameters.abstracts.Configuration;

public class Tasks extends Configuration {

	private int max;

	public Tasks(Configuration config, String name, int max) {
		super(config, name);
		this.max = max;
	}

	@Override
	public String asString() {
		return super.asString()
				+ String.format("%s: %d\n", this.name, this.max);
	}

}
