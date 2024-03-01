package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static String returnFizzBuzz(int num){
        if ((num % 15)==0){
            return "FizzBuzz";
        }else if ((num % 5)==0){
            return "Buzz";
        }else if ((num % 3)==0){
            return "Fizz";
        } else{
            return Integer.toString(num);
        }
    }

}