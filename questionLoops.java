package com.company;

import java.util.Arrays;

public class questionLoops {
    public static void main(String[] args) {
        //Practice Set Questions on Loops

        //Ques 1

        /*int n = 4;
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");

            }
            System.out.println("\n");

        }*/

        //Ques 2

        /*int sum=0;
        int n = 5;
        for(int i=0;i<=n;i++){
            sum=sum+(2*i);
        }
        System.out.println("Sum of even numbers is: ");
        System.out.println(sum);*/

        //Ques 3

        int n=2;
        for(int i=1;i<=10;i++){
            System.out.printf("%d*%d = %d\n",n,i,n*i);
        }


    }
}
