package com.company;
import java.util.*;

class nodigits {

    static int countDigit(long n)
    {
        return (int)Math.floor(Math.log10(n) + 1);
    }

    public static void main(String[] args)
    {
        long n = 9235;
        System.out.print("Number of digits : "
                + countDigit(n));
    }
}


