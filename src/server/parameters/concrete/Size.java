package server.parameters.concrete;

import server.parameters.abstracts.*;

public class Size extends Configuration {
	
	private int width;
	private int height;

	public Size(Configuration config, String name, int width, int height) {
		super(config, name);
		this.width = width;
		this.height = height;
	}

	@Override
	public String asString() {		
		return super.asString() + String.format("%s: %dx%d\n", this.name, this.width, this.height);
	}

}
