package com.eayzbytes.accounts.constants;

public class AccountsConstants {

    /**
     * restricts instantiation, so no one can create an object from this class.
     * And no business logic code can pollute this class
     * It is just for using as a holder for constant values
     */
    private AccountsConstants() {
    }

    public static final String SAVINGS = "Savings";
    public static final String ADDRESS = "123 Main Street, New York";
    public static final String STATUS_201 = "201";
    public static final String MESSAGE_201 = "Account created successfully";
    public static final String STATUS_200 = "200";
    public static final String MESSAGE_200 = "Request processed successfully";
    public static final String STATUS_500 = "500";
    public static final String MESSAGE_500 = "An error occurred. Please try again or contact Dev team";
}
