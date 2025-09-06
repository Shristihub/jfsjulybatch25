package com.set.compare;

import java.util.Comparator;

public class IdSort implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return Integer.compare(o1.getStudentId(), o2.getStudentId());
	}

}
