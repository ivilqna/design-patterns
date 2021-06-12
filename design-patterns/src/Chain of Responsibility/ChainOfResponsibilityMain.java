package chainofresponsibility;

public class ChainOfResponsibilityMain {

	public static void main(String[] args) {


		Logger errorLogger = new ErrorLogger();
		Logger warnLogger = new WarnLogger();
		Logger infoLogger = new InfoLogger();
		
		errorLogger.setNexxtLogger(warnLogger);
		warnLogger.setNexxtLogger(infoLogger);
		
	 //errorLogger.logMessage(2, "Text message");
	 //errorLogger.logMessage(1, "Text message");
		
		errorLogger.logMessage(200, "Text message");

	}

}
