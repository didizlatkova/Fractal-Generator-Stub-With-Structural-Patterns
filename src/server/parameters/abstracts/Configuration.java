package server.parameters.abstracts;

// Decorator

public abstract class Configuration {

	protected Configuration config;
	protected String name;
	
	public Configuration(Configuration config, String name){
		this.config = config;
		this.name = name;
	}
		
	public String asString() {
		if (this.config != null) {
			return this.config.asString();
		}
		
		return "";
	}

}
