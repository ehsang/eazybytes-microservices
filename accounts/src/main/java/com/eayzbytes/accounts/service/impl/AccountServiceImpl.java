package com.eayzbytes.accounts.service.impl;

import com.eayzbytes.accounts.dto.CustomerDto;
import com.eayzbytes.accounts.repository.AccountsRepository;
import com.eayzbytes.accounts.repository.CustomerRepository;
import com.eayzbytes.accounts.service.IAccountsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AccountServiceImpl implements IAccountsService {

    private AccountsRepository accountsRepository;
    private CustomerRepository customerRepository;

    /**
     * @param customerDto - CustomerDto object
     */
    @Override
    public void createAccount(CustomerDto customerDto) {

    }
}
