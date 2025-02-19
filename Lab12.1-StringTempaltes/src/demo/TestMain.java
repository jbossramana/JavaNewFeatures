package demo;

public class TestMain {
	
	public static void main(String args[])
	{
	String pName = "Ramana";

	System.out.println("Example1");
	String info = STR."My name is \{pName}";
	
	System.out.println(info);
	
	System.out.println("Example2");
	
	
	String name    = "Joan Smith";
	String phone   = "555-123-4567";
	String address = "1 Maple Drive, Anytown";
	String json = STR."""
	    {
	        "name":    "\{name}",
	        "phone":   "\{phone}",
	        "address": "\{address}"
	    }
	    """;
	System.out.println(json);
	
	System.out.println("Example3");
	
	String title = "My Web Page";
	String text  = "Hello, world";
	String html = STR."""
	        <html>
	          <head>
	            <title>\{title}</title>
	          </head>
	          <body>
	            <p>\{text}</p>
	          </body>
	        </html>
	        """;
	System.out.println(html);
	

	
	
    }
	
	
}