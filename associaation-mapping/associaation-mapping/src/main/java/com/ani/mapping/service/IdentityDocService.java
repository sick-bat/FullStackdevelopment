package com.ani.mapping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ani.mapping.domain.IdentityDoc;
import com.ani.mapping.domain.Person;
import com.ani.mapping.repository.IdentityDocRepository;

@Service
public class IdentityDocService {

    @Autowired
    private IdentityDocRepository identityDocRepository;

    public void addIdentityDoc(String type, boolean isActive, Person person) {
        IdentityDoc identityDoc = new IdentityDoc();
        identityDoc.setType(type);
        identityDoc.setIsActive(isActive);
        identityDoc.setPerson(person);
        identityDocRepository.save(identityDoc);
    }

    public List<IdentityDoc> listAll() {
        return identityDocRepository.findAll();
    }
}