package com.userapp.service;

import com.userapp.exceptions.TooLongPasswordException;
import com.userapp.exceptions.TooShortPasswordException;
import com.userapp.exceptions.UsernameAlreadyExistsException;

public class ValidationServiceImpl implements IValidationService {

	@Override
	public boolean validateUsername(String username) throws UsernameAlreadyExistsException {
		String[] usernames = {"Jacob","Kevin","Abin","Raju"};
		
		return false;
	}

	@Override
	public boolean validatePassword(String password) throws TooShortPasswordException, TooLongPasswordException {
		// TODO Auto-generated method stub
		return false;
	}

}
