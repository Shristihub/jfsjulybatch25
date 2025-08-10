package com.shristi.abs;

public class Client {

	public static void main(String[] args) {
		Bank bank =  new Branch1();
		// using bank ref call all methods of bank class
		bank.housingLoan();
		bank.carLoan();
		bank.eduLoan();
		bank.adminDetails(); 
		
		//call own method of Branch1
		Branch1 branch1 = (Branch1)bank;
		branch1.payDetails();
		
		//for subbranch bank ref = new SubBranch()
		// using bank ref call all methods of bank class
		bank =  new SubBranch();
		bank.housingLoan(); //comes from Branch2
		bank.carLoan();  //comes from SubBranch
		bank.eduLoan();  //comes from Branch2
		bank.adminDetails(); //comes from Bank
		
		//call own method of Branch2(1st way)
		//super classref =  sub class object
		//CANNOT CALL SUBCLASS METHOD
		Branch2 branch2 = (Branch2)bank;
		branch2.loanTypes();  //comes from Branch2
		branch2.adminDetails();  //comes from Bank
		
		//call own method of subbranch
		//super classref =  sub class object
	    SubBranch sub = (SubBranch)branch2; // points to new SubBranch
	    sub.depositTypes(); //comes from SubBranch
	    sub.loanTypes(); //comes from Branch2
	    sub.adminDetails(); //comes from Bank
		
		
		
		
		
		
		
		
		
	}
}





