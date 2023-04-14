package com.ani.rest.repository;

import java.util.Collection;
import java.util.Optional;

import com.ani.rest.domain.BankAccount;

public interface BankAccountRepository {
    
    BankAccount save(BankAccount account);

    Collection<BankAccount> findAll();
    void delete(BankAccount account);
    BankAccount findById(Long id);
}