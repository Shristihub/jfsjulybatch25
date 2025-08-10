package com.inter.lamb;

public interface IPrinter {

	void showMsg();
}

interface ICourse{
	void showCourseName(String name);
}

interface ISports{
	String[] sportsType();
}

interface IChecker{
	int showLength(String name);
}