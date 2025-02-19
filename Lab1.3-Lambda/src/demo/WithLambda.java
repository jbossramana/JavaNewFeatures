package demo;

import java.util.function.BiFunction;

@FunctionalInterface  //It is optional  
interface Drawable2{  
    public void draw();  
  }  


interface Calculate
{  
	public int operation(int a, int b);
}

public class WithLambda {

	 public static void main(String[] args) {  
	        int width=10;  
	          
	        //with lambda  
	        Drawable2 d2=()->{  
	            System.out.println("Drawing "+width);  
	        };  
	        
	        d2.draw();  
	        
	        Calculate add = (a,b) ->  a+b;
	        Calculate sub = (a,b) -> a-b;
	        
	        
	        BiFunction<Integer, Integer, Integer> biAdd = (a,b) -> {System.out.println("inside"); return a+b;};
	        
	        BiFunction<Integer, Integer, Integer> biSubt = (a,b) -> a-b;
	        
	        System.out.println("adding two values:" + add.operation(10, 20));
	        
	        System.out.println("substract two values:" + sub.operation(20, 10));
	        
	        
	        System.out.println("adding two values:" + biAdd.apply(10, 20));
	        
	        System.out.println("substract two values:" + biSubt.apply(20, 10));
	        
	    }  
	 
}
