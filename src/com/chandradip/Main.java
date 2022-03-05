package com.chandradip;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter the number to print the triangular pattern of the stars.: ");

        Pattern.printPattern(scanner.nextInt());
        System.out.println("hurry you are able to print the pattern");
    }
}
