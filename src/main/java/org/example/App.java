package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static String returnFizzBuzz(int num){
        if (Mod(num,15)==0){
            return "FizzBuzz";
        }else if (Mod(num,5)==0){
            return "Buzz";
        }else if (Mod(num,3)==0){
            return "Fizz";
        }else{
            return Integer.toString(num);
        }
    }

    public static int Mod(int num, int div){
        return (num/div) - (Math.floorDiv(num,div) * div);
    }
}
