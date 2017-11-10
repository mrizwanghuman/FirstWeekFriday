package com.example.admin.firstweekfriday;

/**
 * Created by  Admin on 11/10/2017.
 */

public class FizzBuzz {

    public static  void FizzBuss(int number){



        if(number%5==0&& number%3==0){

            System.out.println("fizz buzz");
        }else if(number%5==0){
            System.out.println("buzz");
        }else if(number%3==0){
            System.out.println("fizz");
        }else{
            System.out.println(number);
        }

    }

    public static void main(String[] args) {
        FizzBuss(18);
    }


}
