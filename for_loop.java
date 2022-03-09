package com.company;
import java.util.Scanner;
public class for_loop {
    public static void main(String[] args) {
        //A simple for loop syntax
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to print n odd number");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(2*i+1);
        }

    }
}
