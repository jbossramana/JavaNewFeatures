var keyword

The main advantage of this feature is to reduce boilerplate variable type definitions and to
increase code readability

var id=0;// At this moment, compiler interprets 
//variable id as integer.
id="34"; // This will result in compilation error 
//because of incompatible types: java.lang.String 
//can't be converted to int.

var p=new Doctor(); 

var list = new ArrayList<String>();

var list = Arrays.asList("One", "Two", "Three", "Four", "Five");


Limitations of var:

Although a really useful feature, var does have some limitations. Some of them are mentioned below:

We cannot use it to declare local variables inside methods. We cannot use it to declare method parameters or instance fields.

We cannot use it to specify the return type of a method.





