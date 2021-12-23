package Exercise3_TheoreticalWork2.Exercise_3;

@SuppressWarnings("serial")
public class InvalidException extends Exception {
	
	public String message;
	
	public InvalidException() {
		this.message = "EXCEPTION: You put a value outside the intervals!!";
	}
	
	public String getMessage() { return message; }
}
