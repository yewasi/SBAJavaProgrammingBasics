package com.perscholas;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        //Initialize array
        char[] arr = new char[]{'c', 'a', 'k', 'e', ' ', 'p', 'o', 'u', 'n', 'd', ' ', 's', 't', 'e', 'a', 'l' };
        System.out.println("Original array: ");
        IntStream.range(0, arr.length).mapToObj(i -> arr[i] + " ").forEach(System.out::print);
        System.out.println();
        System.out.println("Array in reverse order: ");
        //Loop through the array in reverse order
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.println(arr[i] + " ");
            for (int x = arr.length-1; x <= 0; x ++) {
                System.out.println(arr[x] + " ");
            }


        }

    }
}
