package com.tekion.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int x = 98, y = 0;
//        System.out.println(divideLBYL(x, y));
//        System.out.println(divideEAFP(x, y));
//        System.out.println(divide(x, y));

        int x = getXLBYL();
        System.out.println(x);
    }

    private static int getX() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    private static int getXLBYL() {
        Scanner sc = new Scanner(System.in);
        boolean isValid = true;
        System.out.println("Please enter an Integer : ");
        String input = sc.next();
        for (int i = 0; i < input.length(); i++) {
            if(!Character.isDigit(input.charAt(i))) {
                isValid = false;
                break;
            }
        }
        if(isValid) return Integer.parseInt(input);
        return 0;
    }

    private static  int getXEAFP() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an Integer : ");
        try {
            return sc.nextInt();
        }
        catch (InputMismatchException e) {
            return 0;
        }
    }
    private static int divideLBYL(int x, int y) {
        if (y != 0) {
            return x / y;
        }
        return 0;
    }

    private static int divideEAFP(int x, int y) {
        try {
            return x / y;
        } catch (ArithmeticException e) {
            return 0;
        }
    }

    private static int divide(int x, int y) {
        return x / y;
    }
}
