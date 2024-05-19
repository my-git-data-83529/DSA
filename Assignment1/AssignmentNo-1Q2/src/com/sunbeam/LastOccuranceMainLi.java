package com.sunbeam;

import java.util.Scanner;

public class LastOccuranceMainLi {

	public static int linearSearch(int arr[], int N, int key) {
		
		for(int i = N-1 ; i>=0 ; i--) {
			
			if(key == arr[i])
				
				return i;	
		}
		
		return -1;
	}

	public static void main(String[] args) {
		
		int arr[] = {88, 33, 33, 66, 99, 11, 77, 22, 11, 55, 99, 14};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter key to be searched : ");
		int key = sc.nextInt();
		
		int index = linearSearch(arr, arr.length, key);
		if(index != -1)
			System.out.println("Key is found at index " + index);
		else
			System.out.println("Key is not found");
		
		sc.close();
	}


}
