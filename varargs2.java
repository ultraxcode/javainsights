package com.company;

public class varargs2 {
    static int sum(int ...arr){
        int result=0;
        for(int a: arr){
            result+=0;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(sum(4,5));

    }
}
