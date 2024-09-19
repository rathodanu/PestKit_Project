package com.ASR.PestKit.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ASR.PestKit.Model.Contact;

public interface ContactRepository extends JpaRepository<Contact, String>{
    Contact findByEmail(String email);

}
