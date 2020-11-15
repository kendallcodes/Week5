package hw;

public class AsteriskLogger implements Logger {

	public void Log(String a) {
	System.out.println("***" + a +"***");
	}
	public void Error(String b) {
		System.out.println("*****************" + "\n" + "***" + "Error: " + b + "*****************");
	}

	 
}
