package com.ani.rest.service;


import java.util.Collection;

import com.ani.rest.dto.BankAccountDto;

public interface BankAccountService {
 
    Integer createNewAccount(BankAccountDto account);

    Collection<BankAccountDto> listAllAccounts();

    Double getAccountBalance(Long id);

    void deleteAccount(Long id);

}