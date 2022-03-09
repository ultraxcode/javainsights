package com.company;
import java.util.Scanner;
import java.util.Random;

public class rps_gamee {
    public static void main(String[] args) {
        int min=1;
        int max=3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice \n1) Rock\n2) Paper\n3) Scissor");
        int choice = sc.nextInt();
        System.out.println("You have chose: "+choice);
        int computer = (int)Math.floor(Math.random()*(max-min+1)+min);
        System.out.println(computer);
        if(choice==1 || choice==2 || choice==3){
            if(computer==1){
                System.out.println("Computer Chose Rock");
            }
            else if(computer==2){
                System.out.println("Computer Chose Paper");
            }
            else if(computer==3){
                System.out.println("Computer Chose Scissor");
            }
            else{
                System.out.println("Computer Failed to chose");
            }
            if(choice==computer){
                System.out.println("It's a tie");
            }
            else if(choice==1&&computer==3||choice==2&&computer==1||choice==3&&computer==2){
                System.out.println("You are the winner");
            }
            else{
                System.out.println("You Loose");
            }


        }
    }
}
