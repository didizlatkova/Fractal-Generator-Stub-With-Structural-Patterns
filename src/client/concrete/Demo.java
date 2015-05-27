package client.concrete;

import server.logic.abstracts.ComplexLogger;
import server.logic.concrete.FractalLogger;
import server.parameters.abstracts.Configuration;
import server.parameters.concrete.Rectangle;
import server.parameters.concrete.Size;
import server.parameters.concrete.Tasks;
import server.parameters.concrete.WorkingMode;

public class Demo {

	public static void main(String[] args) {
		boolean quietMode = false;

		Configuration config = new Size(null, "Image size", 640, 480);
		config = new Rectangle(config, "Field coords", -2, 2, -1, 1);
		config = new Tasks(config, "Maximum threads", 10);
		config = new WorkingMode(config, "Quiet mode", quietMode);

		// Test1 - Using Adapter
		ComplexLogger logger = new SimpleLoggerAdapter(
				new ConcreteSimpleLogger(), !quietMode);
		FractalGeneratorProxy generator = new FractalGeneratorProxy(
				"http://rmi.yaht.net/", 88, logger);
		generator.generateFractal(config);

		 // Test2 - Using legacy version
//		 ComplexLogger logger2 = new FractalLogger(!quietMode);
//		 FractalGeneratorProxy generator2 = new
//		 FractalGeneratorProxy("http://rmi.yaht.net/", 88, logger2);
//		 generator2.generateFractal(config);

		// Test3 - quiet mode
//		boolean quietMode3 = true;
//
//		Configuration config3 = new Size(null, "Image size", 640, 480);
//		config3 = new Rectangle(config3, "Field coords", -2, 2, -1, 1);
//		config3 = new Tasks(config3, "Maximum threads", 10);
//		config3 = new WorkingMode(config3, "Quiet mode", quietMode);
//		
//		ComplexLogger logger3 = new SimpleLoggerAdapter(
//				new ConcreteSimpleLogger(), !quietMode3);
//		FractalGeneratorProxy generator3 = new FractalGeneratorProxy(
//				"http://rmi.yaht.net/", 88, logger3);
//		generator3.generateFractal(config3);
	}

}
