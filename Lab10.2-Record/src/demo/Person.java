package demo;

public record Person(String name, int age) {
    // Record body (optional)
    
	 public Person withName(String newName) {
	        return new Person(newName, this.age);
	    }

	 
    // Additional method
    public void greet() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }
}