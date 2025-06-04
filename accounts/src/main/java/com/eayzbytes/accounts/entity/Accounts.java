package com.eayzbytes.accounts.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

/**
 * BaseEntity is the superclass for all entity classes.
 * It can be used to define common properties such as `id`, `createdAt`, `updatedAt`, etc.
 * Extend this class in all your JPA entity classes to inherit shared attributes.
 * I'm using it to store metadata fields such as createdAt, updatedAt and etc
 */

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Accounts extends BaseEntity {

    @Id
    @Column(name = "account_number")
    private Long accountNumber;

    @Column(name = "customer_id")
    private Long customerId;

    @Column(name = "account_type")
    private String accountType;

    @Column(name = "branch_address")
    private String branchAddress;

}
