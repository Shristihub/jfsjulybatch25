package com.shristi.arrays;

import java.util.Scanner;

public class TwoDimScan {

	public static void main(String[] args) {
		int[][] marks = new int[3][2];
		System.out.println(marks.length);//3
		
//		marks[0][0]=90;
//		marks[0][1]=80;
//		marks[1][0]=90;
//		marks[1][1]=80;
//		marks[2][0]=70;
//		marks[2][1]=90;
		
		Scanner sc  = new Scanner(System.in);
		// get the input form user
		System.out.println("Enter values");
		for (int i = 0; i < marks.length; i++) {
		   for(int j=0;j<marks[i].length;j++) {
			   marks[i][j]=sc.nextInt();
		   }
		}
		
		for (int[] one : marks) {
			for(int val:one) {
				System.out.print(val+" ");
			}
			System.out.println();
		}
	}
}
