

public class HelloWorld {
    public static void main(String[] args) {
    	   long startTime = System.nanoTime();
    	   
        System.out.println("Hello, World!");
        
        long endTime = System.nanoTime();

   //     System.out.println("Time taken for  : "  + (endTime - startTime)+ " nano seconds");
        
  // using a text block
        System.out.println("""
        	    Time taken for: %d nano seconds
        	""".formatted(endTime - startTime));
        
        

        
    }
}
