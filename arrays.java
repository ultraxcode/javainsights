package com.company;

public class arrays {
    public static void main(String[] args) {
        //Array in JAVA
        int [] marks = {100,20,32,32,54};//Declaration+Initialization.

        System.out.println(marks[2]);//Accesing the array Index.
        System.out.println(marks.length);//Lenght of an array.
        for(int i= marks.length-1;  i>=0 ; i--){
            System.out.println(marks[i]);//Displaying an array using for loop(reversed)
        }
        for(int elements: marks){
            System.out.println(marks);
        }//for each loop

    }
}
