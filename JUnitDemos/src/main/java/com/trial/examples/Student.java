package com.trial.examples;

import com.trial.exceptions.InvalidNumException;

public class Student {

	public int calcSum(int m1, int m2, int m3){
		if(m1<0 ||m2<0|| m3<0 )
			throw new InvalidNumException("num cant be less than 0");
		if(m1>100 ||m2>100|| m3>100 )
			throw new InvalidNumException("num cant be less than 0");
		return  m1+m2+m3;
	}
	
	public String getGrades(int...marks) {
		int sum=0;
		for (int i : marks) {
			sum+=i;
		}
	 	double avg = sum/3;
	 	
		return null;
	}
	
	
	
}
