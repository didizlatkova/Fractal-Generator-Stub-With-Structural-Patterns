package server.parameters.concrete;

import server.parameters.abstracts.Configuration;

public class Rectangle extends Configuration {

	private int a;
	private int b;
	private int c;
	private int d;

	public Rectangle(Configuration config, String name, int a, int b, int c,
			int d) {
		super(config, name);
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	@Override
	public String asString() {
		return super.asString()
				+ String.format("%s: [%d,%d],[%d,%d]\n", this.name, this.a,
						this.b, this.c, this.d);
	}

}
