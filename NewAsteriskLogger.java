package week5project;

public class NewAsteriskLogger implements NewLogger {

	public void log(String a) {
		// TODO Auto-generated method stub
	
		
		System.out.println("***" + a + "***");
	}

	
	public void error(String a) {
		// TODO Auto-generated method stub
						
		System.out.println("*******************");		
		System.out.println("***ERROR: " + a + "***");		
		System.out.println("*******************"); 
	}
}
