package demo.ex5;


//Java program to demonstrate that
//var cannot be used with Lambda
//Expression



interface myInt {
 
 int add(int a, int b);
}

class MainTest {
 public static void main(String[] args)
 {
     
       // var cannot be used since they
       // require explicit target type
   var obj = (a, b) -> (a + b);
   
   // Specify the target type (MyInt) for the lambda expression
   // MyInt obj = (a, b) -> (a + b);

       // calling add method
    System.out.println(obj.add(2, 3));
 }
}
