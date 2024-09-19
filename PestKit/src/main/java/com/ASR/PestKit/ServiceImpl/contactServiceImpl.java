package com.ASR.PestKit.ServiceImpl;

import com.ASR.PestKit.Validator.ContactValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ASR.PestKit.DAO.ContactRepository;
import com.ASR.PestKit.Model.Contact;
import com.ASR.PestKit.Service.ContactService;

@Service
public class contactServiceImpl implements ContactService{

	@Autowired
	ContactRepository contactRepository;

	@Autowired
	ContactValidation contactValidation;
	
	@Override
	public Contact addContact(Contact contact) throws Exception {
		contactValidation.validateContact(contact);
		return contactRepository.save(contact);
		
	}
	

}
