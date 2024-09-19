package com.ASR.PestKit.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ASR.PestKit.DAO.ContactRepository;
import com.ASR.PestKit.DAO.SignUpRepository;
import com.ASR.PestKit.Model.Contact;
import com.ASR.PestKit.Model.UserSignup;

import java.util.Optional;

@Component
public class ContactValidation {
	@Autowired
	ContactRepository contactRepository;
	
	@Autowired
	SignUpRepository signUpRepository;

	public void validateContact(Contact contact) throws Exception {
		UserSignup byEmail = signUpRepository.findByEmail(contact.getEmail());

		if(byEmail == null)
		{
			throw new Exception("Please Signup Before Contact");
		}

	}


}
