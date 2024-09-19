package com.ASR.PestKit.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ASR.PestKit.DAO.SignUpRepository;
import com.ASR.PestKit.Model.UserSignup;
import com.ASR.PestKit.Service.SignUpService;


@Service
public class SignUpServiceImpl implements SignUpService{

	@Autowired
	SignUpRepository sinRepository;

	@Override
	public UserSignup addSignUp(UserSignup signUp) {
		return sinRepository.save(signUp);
	}	
	}
	
	


