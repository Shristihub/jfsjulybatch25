package com.set.compare;

import java.util.Comparator;

public class CitySort implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o2.getCity().compareTo(o1.getCity());
	}

}
