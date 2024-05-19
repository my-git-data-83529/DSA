package com.sunbeam;

public class FirstNonRepeatingElement {
    public static int findFirstNonRepeatingElement(int[] arr) {
        int n = arr.length;
        boolean isRepeated;

        for (int i = 0; i < n; i++) {
            isRepeated = false;

           
            for (int j = 0; j < n; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isRepeated = true;
                    break;
                }
            }

           
            if (!isRepeated) {
                return arr[i];
            }
        }

       
        return -1;
    }

    public static void main(String[] args) {
        int[] input = { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 };
        int firstNonRepeating = findFirstNonRepeatingElement(input);
        System.out.println("First non-repeating element: " + firstNonRepeating);
    }
}
