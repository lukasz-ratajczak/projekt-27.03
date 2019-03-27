package com.company;

public class Palindrom {

    public void equal(String input){

        input = input.replace(" ", "");
        input = input.toLowerCase();

        int lenght = input.length();

        int breaker = 0;
        int ender = lenght - 1;



        for(int begginner = 0; begginner < ender; begginner++){

           if(input.charAt(begginner) != input.charAt(ender)){
               breaker = 1;
               break;
           }
           ender--;

        }
        if(breaker == 1) System.out.println("to NIE jest palidrom");
        else System.out.println("to JEST palindrom");


    }

}
