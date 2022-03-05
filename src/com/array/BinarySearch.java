package com.array;

public class BinarySearch {
    private static int binarySearch(int[] arr, int l, int r, int x) {
        if (r>=l) {
            int mid = (l+r)/2;
            if (arr[mid]==x)
                return mid;
            if (arr[mid]>x){
                r=mid-1;
                return binarySearch(arr, l, r, x);
            }
            if (arr[mid]<x){
                l=mid+1;
                return binarySearch(arr, l, r, x);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int r=arr.length;
        int x =6;
        int result = binarySearch(arr, 0, r, x);
        if (result==-1){
            System.out.println("array element is not found");
        } else  {
            System.out.println("array found at index of "+result);
        }
    }
}
