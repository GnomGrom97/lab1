package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out. println ("input a x ");
        double fx;
        int x = in.nextInt();
        System.out.println("input a a ");
        int a = in.nextInt();
        System.out.println ("imput a b");
        int b = in.nextInt();
        System.out.println("imput a c");
        int c = in.nextInt();
        System.out.println ("imput a d");
        int d = in.nextInt();

        if(x<5 & b!=0)
        {
           fx = (a*(Math.pow(2,x+7)))-b;
        }
        if (x>5 && b==0)
        {
            fx=x-(c*d)/a*x;
        }
else {
            fx=x/c;
}
        System.out.println(fx);
        in.close();
    }
}
