package com.sunbeam;


public class palindrome {
 
  public static boolean isPalindrome(int[] N) {
      int left = 0;
      int right = N.length - 1;
      
      while (left < right) {
          if (N[left] == N[right]) {
              return true;
          }
          left++;
          right--;
      }
      return false;
  }


public static void main(String[] args) {
  int[] nums = {1, 2, 3, 4, 3, 2, 1}; 
  

  if (isPalindrome(nums)) {
      System.out.println("The array is a palindrome.");
  } else {
      System.out.println("The array is not a palindrome.");
  }
}
}





