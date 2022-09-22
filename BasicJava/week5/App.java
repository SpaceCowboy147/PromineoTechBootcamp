package week5;

public class App {

	public static void main(String[] args) {
		
		Logger logger = new AsteriskLogger();
		
		logger.log("Hello there");
        logger.error("Computer on fire");
	 
        Logger space = new spaceLogger();
		space.log("Cheese");
		space.error("missing script");
				
	}

}
