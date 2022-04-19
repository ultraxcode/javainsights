package com.company;
class pDetails{

}
class employee{
    int id;
    String name;
    public void printDetails(){
        System.out.println("This is my id "+ id);
        System.out.println("This is my intro "+ name);
    }

}
public class customclass {
    public static void main(String[] args) {
        employee anurag = new employee();
        //setting properties of our class
        anurag.id=10;
        anurag.name="Hey Guys I am anurag";
       //System.out.println(anurag.id)
        // System.out.println(anurag.name);
    anurag.printDetails();

    }
}
