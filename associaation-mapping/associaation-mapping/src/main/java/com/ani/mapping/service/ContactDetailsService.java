package com.ani.mapping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ani.mapping.domain.ContactDetails;
import com.ani.mapping.domain.Person;
import com.ani.mapping.repository.ContactDetailsRepository;

@Service
public class ContactDetailsService {

    @Autowired
    private ContactDetailsRepository contactDetailsRepository;

    public void addContactDetails(String mobile, String email, Person person) {
        ContactDetails contactDetails = new ContactDetails();
        contactDetails.setMobile(mobile);
        contactDetails.setEmail(email);
        contactDetails.setPerson(person);
        contactDetailsRepository.save(contactDetails);
    }

    public List<ContactDetails> listAll() {
        return contactDetailsRepository.findAll();
    }
}