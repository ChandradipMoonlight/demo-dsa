package com.chandradip;

public class Solution {
    public Solution(String name) {
        System.out.println(name);
    }
   private Solution(int x){
       this("dipak");
       System.out.println(x);
   }

    public static void main(String[] args) {
       Solution solution = new Solution(10);
    }
}
