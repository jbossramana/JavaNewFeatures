package demo;

public class Java9MainClass implements Java9Interface{


		
		  @Override
		    public void abstractMethod() {
		        System.out.println("abstract Method implementation");
		    }

		    public static void main(String[] args) {
		    	Java9Interface action = new Java9MainClass();
		        action.defaultMethod();
		        action.abstractMethod();
		        Java9Interface.staticMethod();
		        
		    }
		    
		
		
	
}
