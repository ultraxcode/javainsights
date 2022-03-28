package com.company;

public class ques1table {
    static void mTable(int n){
        for(int i=1;i<=10;i++){
            System.out.format("%d X %d= %d",n,i,n*i);

        }

    }
    public static void main(String[] args) {
        mTable(5);
    }
}
