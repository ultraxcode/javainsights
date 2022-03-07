package com.company;
import java.util.Locale;
import java.util.Scanner;

public class strings {
    public static void main(String[] args) {
        //strings
        //string is a class
        //string is not a primitive data type but can be used like one
        //String name = new String("Harry");
        String name = "Ultra";
        System.out.println(name);
       //Input taking of a String
        //Scanner sc = new Scanner(System.in);
        //String st = sc.nextLine();
        //System.out.println(st);

        //String Methods in JAVA
        int value = name.length(); //name.length returns the lenght of the string
        System.out.println(value);
        String value2 = name.toLowerCase(); //returns to lowecase
        System.out.println(value2);
        //toUpperCase
        //.trim() = trims the case
        //.substring() = returns a new string from the place number specified eg
        String subs = name.substring(2,4);//index starts from zero
        System.out.println(subs);
        //name.replace() = replaces the old char to new char
        String nrep = name.replace('l','t');
        System.out.println(nrep);
        //you can also replace partial string inside using name.replace
        //name.StartsWith(name)
        System.out.println((name.startsWith("Ult")));
        System.out.println(name);
        //name.Ends With can be used in a similar fashion
    }
}
