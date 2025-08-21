package com.userapp.service;

import com.userapp.exceptions.TooLongPasswordException;
import com.userapp.exceptions.TooShortPasswordException;
import com.userapp.exceptions.UsernameAlreadyExistsException;

public interface IValidationService {

	boolean validateUsername(String username) throws UsernameAlreadyExistsException;
	boolean validatePassword(String password) throws TooShortPasswordException,TooLongPasswordException;
}
