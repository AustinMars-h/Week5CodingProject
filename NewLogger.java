package week5project;

public interface NewLogger{
	public void log(String log);
	public default void error(String error) {
		// TODO Auto-generated method stub
		
	}
	
	
}
