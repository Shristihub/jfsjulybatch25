package com.inter.meth;

public class MethRefDemo {

	public static void main(String[] args) {
		
		Loan loan =  new Loan();
		//refer to an instance method of loan class
		IProcessor processor  = loan::checkDocuments;
		processor.showProcess("personal loan");
		
		//refer to an static method of loan class
		processor = Loan::printNames;
		processor.showProcess("vehicle loan");
		
		System.out.println();
		
		ISportsDetails sportsDetails = Games::getGamesByType;
		String[] games=sportsDetails.showGames("in");
		for (String game : games) {
			System.out.println(game);
		}
	}
}
