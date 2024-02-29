package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static String returnFizzBuzz(int num){
        if (Math.ceilMod(num,15)==0){
            return "FizzBuzz";
        }else if (Math.ceilMod(num,5)==0){
            return "Buzz";
        }else if (Math.ceilMod(num,3)==0){
            return "Fizz";
        }else{
            return Integer.toString(num);
        }
    }
}
