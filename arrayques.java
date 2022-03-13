package com.company;

public class arrayques {
    public static void main(String[] args) {
        //Ques Create an array of 5 floats and calculate their sum.
        float [] sum={1.2f,3.3f,4.5f,6.7f,8.2f};
        float nsum=0f;
        for(float element:sum){
            nsum=nsum+element;
        }
        System.out.println(nsum/sum.length);

        //Ques Write a program to find out whether a given integer is present in an array or not
        int [] arr = {1,2,3,4,5,6,7,8,9,0};
        int n = 11;
        boolean present = false;
        for(int element1:arr){
            if(n==element1){
                present=true;
                break;
            }

        }
        if(present){
            System.out.println("It is here");
        }
        else{
            System.out.println("It is not here");
        }

        //Ques Calculate the average marks from an array containing of all students in physics using for-each loop

       //edited in ques 1

        //Ques
        int [][] mat1={{1,3,5},{1,6,3}};
        int [][] mat2={{3,5,2},{8,3,1}};
        int [][] result = {{0,0,0},{0,0,0}};//Creating a 2D matrix in an multi dimensional array

        for(int i=0;i< mat1.length;i++){
            for(int j=0;j<mat1[i].length;j++){
                result[i][j]=mat1[i][j]+mat2[i][j];
                System.out.print(result[i][j]+" ");
            }
            System.out.println(" ");
        }


        //Ques Write a java program to reverse an array
        int [] rev={0,1,2,3,4,5};
        int l = rev.length;
        int m = Math.floorDiv(l, 2);
        int temp;
        for(int i =0;i<m;i++){
            //Swap a[i] and a[l-1-i]
        temp=rev[i];
        rev[i]=rev[l-1-i];
        rev[l-i-1]=temp;


        }
        for(int elements2:rev){
            System.out.print(elements2 +" ");

        }

        //Ques Write a java program to find the maximum element in an array

        int[] maxm={1,2,3,5,6};
        int max=0;
        for(int e:arr){
            if(e>max){
                max=e;
            }

        }
        System.out.println(max);


// Practice Problem 7
        boolean isSorted = true;
        int [] arr = {1, 12, 3, 4, 5, 34, 67};
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] > arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("The Array is sorted");
        }
        else{
            System.out.println("The Array is not sorted");
        }

    }
}
