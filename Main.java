package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        System.out.println("введите число");
        double num = in.nextDouble();
        double argone = Math.pow(num,2);
        double argtwo = 1+num+argone;
        double argthree=2*num+argone;
        double argfour= argtwo/argthree;
        double arg5 = 1-num+ argone;
        double arg6=2*num-argone;
        double arg7=arg5/arg6;
        double arg8=argfour+2-arg7;
        double arg9=Math.pow(arg8,-4);
        double arg10 = 5-2*argone;
        double y= arg9 * arg10;

        System.out.print(y);
        in.close();
    }
}
