package demo;

public class NullpointerException {

	public static void main(String[] args) {
	    String text = null;

	    int length = 0;
	    if (text != null) {
	        length = text.length();
	    }

	    System.out.println("Length of the text: " + length);
	}
	
}
