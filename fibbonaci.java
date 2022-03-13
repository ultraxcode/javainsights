package com.company;

//Program to print a fibbonaci series.
public class fibbonaci {
    public static void main(String[] args) {
        int n=10;
        int a=0;
        int b=1;

        for(int i=0;i<=10;i++){
          int nextNum=a+b;
            System.out.println(nextNum);
            a=b;
            b=nextNum;
        }
    }
}
