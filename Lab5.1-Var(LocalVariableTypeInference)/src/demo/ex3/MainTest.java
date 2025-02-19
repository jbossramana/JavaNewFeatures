package demo.ex3;

import java.util.ArrayList;

//var with the generic type

public class MainTest {


	 public static void main(String[] args)
    {
          // var used with Generic type
        var<Integer> al = new ArrayList<Integer>();
    //    var al = new ArrayList<Integer>(); 
          // add elements 
        al.add(10);
        al.add(20);
        al.add(30);
        
        // print the list
        System.out.println(al);
    }
}