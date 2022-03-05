package com.chandradip;

public class Pattern {
//    private int num;

    public static void printPattern(int num) {
        for(int i = 1; i<=num; i++) {
            for (int y = 1; y<=i; y++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static void hollowSquare(int n) {
        for (int i = 1; i<=n; i++){
            for (int j = 1; j<=n; j++) {
                if (i==1 || i ==n || j==n || j==1 || j==i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    static void printReversePyramid(int n) {
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=n; j++) {
                if (i<=j) {
                    System.out.print("*  ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void printLeftRightAngleTrianglePattern(int n) {
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=n-i; j++) {
                System.out.print("  ");
            }
            for (int k=1; k<=i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
//        hollowSquare(5);
        printLeftRightAngleTrianglePattern(6);
    }
}
