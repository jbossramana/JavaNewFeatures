package demo;

public class NullpointerExceptionTest {

	public static void main(String[] args) {
	    String text = null;

	    int length = 0;
	   
	    length = text.length(); 	

	    System.out.println("Length of the text: " + length);
	}
	
}
