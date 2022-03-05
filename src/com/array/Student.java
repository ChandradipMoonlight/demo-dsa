package com.array;

import java.util.Arrays;

public class Student {
    static void nonPrimitiveArr(){
        MyClass student1 = new MyClass("Chandradip", 25, 1);
        MyClass student2 = new MyClass("Umesh", 25, 2);
        MyClass student3 = new MyClass("Shivshankar", 25, 3);
        MyClass[] arr = new MyClass[3];
        arr[0] = student1;
        arr[1] = student2;
        arr[2] = student3;
        System.out.println(Arrays.toString(arr));
        for (MyClass ele: arr) {

            System.out.println(ele.getName()+", "+ele.getAge()+", "+ele.getRollNo());
        }
    }
    public static void main(String[] args) {
        nonPrimitiveArr();
    }
}
