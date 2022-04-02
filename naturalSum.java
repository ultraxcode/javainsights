package com.company;

public class naturalSum {
    static int naturalSum1(int n){
        if(n==1){
            return 1;
        }
          return n + naturalSum1(n-1);
    }
    public static void main(String[] args) {
        int c = naturalSum1(5);
        System.out.println(c);

    }
}
