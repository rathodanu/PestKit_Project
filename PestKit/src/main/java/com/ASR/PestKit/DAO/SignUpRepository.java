package com.ASR.PestKit.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ASR.PestKit.Model.UserSignup;



public interface SignUpRepository extends JpaRepository<UserSignup, String>{
    UserSignup findByEmail(String email);
}
