package com.sunbeam;

import java.util.Scanner;

public class LinearSearch {
    
    public static int[] linearSearch(int arr[], int N, int key) {
        int comparisons = 0;
        
        for (int i = 0; i < N - 1; i++) {
            comparisons++;
            
            if (key == arr[i])
              
                return new int[]{i, comparisons};
        }
        
        return new int[]{-1, comparisons};
    }

    public static void main(String[] args) {
       
        int arr[] = {88, 33, 66, 11, 77, 22, 11, 55, 99, 14};

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter key to be searched : ");
        int key = sc.nextInt();

        int[] result = linearSearch(arr, arr.length, key);
        int index = result[0];
        int comparisons = result[1];
        
        if (index != -1) {
            System.out.println("Key is found at index " + index);
            System.out.println("Number of comparisons: " + comparisons);
        } else {
            System.out.println("Key is not found");
            System.out.println("Number of comparisons: " + comparisons);
        }

        sc.close();
    }
}
