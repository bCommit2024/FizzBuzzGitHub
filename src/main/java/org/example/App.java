package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(new Float(7F/3F));
        System.out.println(Math.floorDiv(7,3));
    }
    public static String returnFizzBuzz(int num){
        if ((num % 15)==0){
            return "FizzBuzz";
        }else if ((num % 5)==0){
            return "Buzz";
        }else if ((num % 3)==0){
            return "Fizz";
        }
        return "";
    }

}
