package server.parameters.concrete;

import server.parameters.abstracts.Configuration;

public class WorkingMode extends Configuration {

	private boolean isQuiet;

	public WorkingMode(Configuration config, String name, boolean isQuiet) {
		super(config, name);
		this.isQuiet = isQuiet;
	}

	@Override
	public String asString() {
		return super.asString()
				+ String.format("%s: %s\n", this.name, this.isQuiet ? "yes"
						: "no");
	}
}
