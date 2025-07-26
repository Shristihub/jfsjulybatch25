package com.shristi.arrays;

import java.util.Scanner;

public class OneDimScan {

	public static void main(String[] args) {
		int[] nums = new int[4];
		Scanner sc  = new Scanner(System.in);
		// get the input form user
		System.out.println("Enter nums");
		for (int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
		}

		for(int val:nums)
			System.out.println(val);
	
	}
}
