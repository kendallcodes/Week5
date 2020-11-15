package hw;

public class SpacedLogger implements Logger {

	
	public void Log(String Log) {
		
	StringBuilder spacedString = new StringBuilder();
	
	for (int i = 0; i < Log.length();i++) {
	
		spacedString.append(Log.charAt(i) + " ");
		System.out.println(spacedString);
		}
	}	
	public void Error(String Error) { 	
}

}