import java.util.Scanner;

public class Input {
	
	Scanner in = new Scanner(System.in);
	
	public int inInt() {
		return in.nextInt();
	}
	
	public double inDouble() {
		return in.nextDouble();
	}
	
	public String inString() {
		return in.next();
	}
}