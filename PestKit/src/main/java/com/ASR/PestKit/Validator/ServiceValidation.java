package com.ASR.PestKit.Validator;

import com.ASR.PestKit.DAO.ContactRepository;
import com.ASR.PestKit.Model.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ASR.PestKit.DAO.ServiceRepository;
import com.ASR.PestKit.DAO.SignUpRepository;
import com.ASR.PestKit.Model.Service;
import com.ASR.PestKit.Model.UserSignup;

@Component
public class ServiceValidation {
	@Autowired
	ServiceRepository serviceRepository;

	@Autowired
	SignUpRepository signUpRepository;

	@Autowired
	ContactRepository contactRepository;

	public void serviceValid1(Service service) throws Exception {
		UserSignup byEmail = signUpRepository.findByEmail(service.getEmail());
		if(byEmail == null)
		{
			throw new Exception("Please Signup Before Service");
		}
	}
	public void serviceValid2(Service service) throws Exception {
		Contact contact = contactRepository.findByEmail(service.getEmail());
		if(contact == null)
		{
			throw new Exception("Please Contact Before Service");
		}
	}

}
