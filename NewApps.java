package week5project;

public class NewApps {

	

	public static void main(String[] args) {
		
		NewLogger loggerS = new NewSpacedLogger();
		NewLogger loggerA = new NewAsteriskLogger();
		
		System.out.println("Spaced Logger output:");
		loggerS.log("DANGER");
		loggerS.error("DANGER");
		
		System.out.println("Asterisk Logger output:");
		loggerA.log("DANGER");
		loggerA.error("DANGER");
	}

}
