package com.chandradip;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Temperature {
    private static final DecimalFormat dfZero = new DecimalFormat("0.00");
    static void findAvg(int n, double[] arr) {
        double sum = 0;
        for (int i=0; i<n; i++) {
           sum += arr[i];
        }
        double f = sum/n;
        double c = ((f-32)/9)*5;
        System.out.println(dfZero.format(c));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] arr = new double[n];
        for (int i =0; i<n; i++) {
            arr[i]= scanner.nextDouble();
        }
        findAvg(n, arr);
    }
}
