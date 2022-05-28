package com.example.tdd;

import org.springframework.util.StringUtils;

public class FizzBuzz {

    public static String compute(int i) {
        StringBuilder sb= new StringBuilder();
        if(i%3==0){
            sb.append("Fizz");
        }
        if(i%5==0){
            sb.append("Buzz");
        }
        if(!StringUtils.hasLength(sb.toString())){
            sb.append(i);
        }
        return sb.toString();
    }
   /* public static String compute(int i) {
        if(i%3==0&&i%5==0){
            return "FizzBuzz";
        }else
        if(i%3==0){
            return "Fizz";
        }else if(i%5==0){
            return "Buzz";
        }else{
            return String.valueOf(i);
        }

    }
    */

}
