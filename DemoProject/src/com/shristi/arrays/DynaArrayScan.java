package com.shristi.arrays;

import java.util.Scanner;

public class DynaArrayScan {

	public static void main(String[] args) {
		int[][] marks = new int[3][];
		marks[0] = new int[3]; //first row is one dim array with 3 columns
		marks[1] = new int[4]; //one dim array with 4 columns
		marks[2] = new int[2]; //one dim array with 2 columns
		
		marks[0][0]=90;
		marks[0][1]=80;
		marks[1][0]=90;
		marks[1][1]=80;
		marks[2][0]=70;
				
		System.out.println(marks.length);//3
		Scanner sc  = new Scanner(System.in);
		// get the input form user
		System.out.println("Enter values");
		for (int i = 0; i < marks.length; i++) {
			System.out.println("enter row values "+i);
		   for(int j=0;j<marks[i].length;j++) {
			   System.out.println("enter column values "+j);
			   marks[i][j]=sc.nextInt();
		   }
		}
		for (int[] one : marks) {
			for(int val:one) {
				System.out.print(val+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}
