package com.ani.rest.service;

import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.ani.rest.domain.BankAccount;
import com.ani.rest.dto.BankAccountDto;
import com.ani.rest.repository.BankAccountRepository;
import com.ani.rest.util.DmDtConverter;

import lombok.AllArgsConstructor;

@AllArgsConstructor // to enable constructor injection
@Service
public class BankAccountServiceImpl implements BankAccountService{

    private final BankAccountRepository repository;
    private final DmDtConverter converter;

    @Override
    public Integer createNewAccount(BankAccountDto dto) {
        repository.save(converter.toDomain(dto));
        return 1;
    }
    @Override
    public Double getAccountBalance(Long id) {
        BankAccount accountOpt = repository.findById(id);
        if (accountOpt.isPresent()) {
            return accountOpt.getId().getBalance();
        } else {
            return (double) -1;
        }
    }


    @Override
    public Collection<BankAccountDto> listAllAccounts() {

        return repository.findAll()
                            .stream()
                            // .map(account -> converter.toDto(account))
                           .map(converter::toDto)
                           .collect(Collectors.toList());
    }

    @Override
    public void deleteAccount(Long id) {
    BankAccount account = repository.findById(id);
    if (account != null) {
        repository.delete(account);
    }
}

}