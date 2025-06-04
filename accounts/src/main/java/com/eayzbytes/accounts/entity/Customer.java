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
public class Customer extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    @Column(name = "customer_id")
    private Long customerId;

    private String name;

    private String email;

    @Column(name = "mobile_number")
    private String mobileNumber;

}
