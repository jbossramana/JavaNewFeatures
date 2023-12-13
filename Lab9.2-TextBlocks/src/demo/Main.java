package demo;

public class Main {
    public static void main(String[] args) {
    	
    	
    	String messagejdk8 = "This is a multi-line\n" +
    	        "text block example.\n\n" +
    	        "It allows you to include\n" +
    	        "line breaks and preserve\n" +
    	        "the formatting of the text.\n";
    	
    	// The text block delimiter """ for multi-line text block
        String messagejdk13 = """
            This is a multi-line
            text block example.
            
            It allows you to include
            line breaks and preserve
            the formatting of the text.
            
            """;
        
        System.out.println(messagejdk8);
        System.out.println(messagejdk13);
    }
}

