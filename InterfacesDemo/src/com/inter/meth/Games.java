package com.inter.meth;

public class Games {

	static String[] getGamesByType(String type) {
		if(type.equals("in"))
			return new String[] {"Chess","Squash"};
		else
			return new String[] {"football","cricket"};
	}
}
