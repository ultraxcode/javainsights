package com.company;
import java.util.Scanner;

public class conditions {
    public static void main(String[] args) {

//if and else statements
        int nage = 18;
        if (nage >= 18) {
            System.out.println("You can drive");
        } else {
            System.out.println("You cannot drive");
        }
        //Logical Operators
        //Written in notion

//Else-If Clause

        Scanner sc = new Scanner(System.in);
       /* System.out.println("Enter Your Age");
        int age = sc.nextInt();

        if(age>50){
            System.out.println("you are a premium member");
        }
        else if(age>40){
            System.out.println("You are Golden Member");
        }
        else if(age>20){
            System.out.println("You are entry level Member");
        }
        else{
            System.out.println("Sorry you are not qualified enough");
        }
        //This is an if else if else if else ladder*/

//Switch Case Statements

        System.out.println("Enter your age");
        int age = sc.nextInt();
        switch(age){
            case 18:
                System.out.println("hehe boy");
                break;
            default:
                System.out.println("nene boy");
        }




    }
}