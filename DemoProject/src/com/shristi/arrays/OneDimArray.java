package com.shristi.arrays;

public class OneDimArray {

	public static void main(String[] args) {
		//declare and initialize
		int[] nums = new int[4];
		System.out.println(nums.length);
		System.out.println(nums[2]);//0
		//populate the array
		nums[0]=100;
		nums[1]=90;
		nums[2]=80;
		nums[3]=70;
//		nums[4]=90;// ArrayIndexOutOfBoundsException
		System.out.println(nums[3]);
		System.out.println("iterate and print");
		
		int sum = 0;
		for(int i=0;i<nums.length;i++) {
//		  sum = sum + nums[i];
		  sum+=nums[i];
		}
		System.out.println("Sum "+sum);
		
		int sum1 = 0;
		for(int num:nums) // num is the value
			sum1+= num;
		System.out.println("Sum "+sum1);
		
	}
}








