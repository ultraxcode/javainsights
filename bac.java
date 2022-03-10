package com.company;

public class bac {
    public static void main(String[] args) {
        for(int i=0; i<5; i++){
            System.out.println(i);
            if(i==2){
                System.out.println("End the loop");
                break; //break keyboard breaks the loop if a certain condition is met
                //Similarly the continue statement is used to jump immidiately to the next iteration if the condition is met
            }
        }

    }
}
