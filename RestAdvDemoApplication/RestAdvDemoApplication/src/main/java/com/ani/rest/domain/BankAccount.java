package com.ani.rest.domain;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class BankAccount {
    private Long id;
    private String owner;
    private Double balance;
    private LocalDate lastModified;
    public boolean isPresent() {
        return false;
    }
    public double getBalance() {
        return 0;
    }
}