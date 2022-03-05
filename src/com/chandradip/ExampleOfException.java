package com.chandradip;

public class ExampleOfException {
    //learn Arithmetic Exception Handling
    static void exampleOfArithmeticException() {
        try {
            int a = 50/0;
            System.out.println(a);
        } catch (ArithmeticException arithmeticException) {
            System.out.println(arithmeticException.getMessage());
        }
    }

    public static void main(String[] args) {
        exampleOfArithmeticException();
    }

}
