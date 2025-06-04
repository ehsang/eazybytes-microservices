package com.eayzbytes.accounts.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

/**
 * BaseEntity is the superclass for all entity classes.
 * It can be used to define common properties such as `id`, `createdAt`, `updatedAt`, etc.
 * Extend this class in all your JPA entity classes to inherit shared attributes.
 * I'm using it to store metadata fields such as createdAt, updatedAt and etc
 */

@Getter
@Setter
@ToString
@MappedSuperclass
public class BaseEntity {

    @Column(updatable = false)
    private LocalDateTime createdAt;

    @Column(updatable = false)
    private String createdBy;

    @Column(insertable = false)
    private LocalDateTime updatedAt;

    @Column(insertable = false)
    private String updatedBy;


}
