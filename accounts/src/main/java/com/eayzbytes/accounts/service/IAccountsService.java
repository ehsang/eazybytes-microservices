package com.eayzbytes.accounts.service;

import com.eayzbytes.accounts.dto.CustomerDto;

public interface IAccountsService {

    /**
     * @param customerDto - CustomerDto object
     */
    void createAccount(CustomerDto customerDto);

}
