package week5project;

public class NewSpacedLogger implements NewLogger{

	@Override
	public void log(String log) {
	
		String spacedOutWord = "";
		for(int i = 0; i < log.length(); i++) {
			spacedOutWord += (log.charAt(i) + " ");
		}
		System.out.println(spacedOutWord);
	}

	public void error(String error) {
		// TODO Auto-generated method stub
		String spacedOutWord = "";
		for(int i = 0; i < error.length(); i++) {
			spacedOutWord += (error.charAt(i) + " ");
		}
		System.out.println("ERROR: " + spacedOutWord);
	}

}
